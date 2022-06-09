package co.com.utest.automation.challenge.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterStepFourPage extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("where select your computer")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where select your computer")
            .located(By.id("confirmPassword"));

    public static final Target BOX_STAY_INFORMED = Target.the("where select your computer")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));

    public static final Target BOX_ACCEPT_TERM = Target.the("where select your computer")
            .located(By.xpath("//input[@id='termOfUse']//following::span[1]"));

    public static final Target BOX_ACCEPT_PRIVACY = Target.the("where select your computer")
            .located(By.xpath("//input[@id='privacySetting']//following::span[1]"));

    public static final Target BUTTON_COMPLETED = Target.the("where select your computer")
            .located(By.xpath("//a[@id='laddaBtn']//following::span[1]"));
}
