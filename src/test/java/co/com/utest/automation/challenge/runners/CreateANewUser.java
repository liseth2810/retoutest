package co.com.utest.automation.challenge.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/jointoday.feature",
        tags = "@SuccessfulUserCreation",
        glue = {"co.com.utest.automation.challenge.stepdefinitions", "co.com.utest.automation.challenge.datadefinitions"},
        snippets = SnippetType.CAMELCASE)

public class CreateANewUser {
}
