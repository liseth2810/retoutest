package co.com.utest.automation.challenge.tasks;

import co.com.utest.automation.challenge.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.utest.automation.challenge.userinterface.RegisterStepTwoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class FillAddYourAddress implements Task {

    private User user;

    public FillAddYourAddress(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(SELECT_CITY, isVisible()),
                Enter.theValue(user.getCity()).into(SELECT_CITY),
                Enter.theValue(user.getPostalcode()).into(INPUT_POSTAL_CODE),
                WaitUntil.the(IMG_MAP, isVisible()),
                Click.on(BUTTON_NEXT_DEVICES)

        );
    }

}
