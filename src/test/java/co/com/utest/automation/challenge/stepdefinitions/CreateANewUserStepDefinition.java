package co.com.utest.automation.challenge.stepdefinitions;

import co.com.utest.automation.challenge.exceptions.AccountCreationFailed;
import co.com.utest.automation.challenge.model.Devices;
import co.com.utest.automation.challenge.model.User;
import co.com.utest.automation.challenge.questions.Message;
import co.com.utest.automation.challenge.tasks.RegisterAccount;
import co.com.utest.automation.challenge.userinterface.UtestPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateANewUserStepDefinition {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) open the page Utest")
    public void lisethOpenThePageUtest(String actor) {
        OnStage.theActorCalled(actor);
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(new UtestPage()));
    }

    @When("(.*) register with valid data")
    public void youRegisterWithValidData(User user, List<Devices> data) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                RegisterAccount.fillFormTellUsAboutYourself(user),
                RegisterAccount.fillFormAddYourAddress(user),
                RegisterAccount.fillTellUsAboutYourDevices(data.get(0)),
                RegisterAccount.fillTheLastStep(user)
        );
    }

    @Then("the client can see information on how to get started with uTest")
    public void theClientCanSeeInformationOnHowToGetStartedWithUTest() {
        theActorInTheSpotlight().should(
                seeThat(Message.ofWelcomeMessage(), Matchers.equalTo(true)).orComplainWith(AccountCreationFailed.class)
        );

    }
}
