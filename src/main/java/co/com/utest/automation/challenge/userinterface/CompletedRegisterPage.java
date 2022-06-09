package co.com.utest.automation.challenge.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CompletedRegisterPage extends PageObject {

    public static final Target LBL_WELCOME_MESSAGE= Target.the("Welcome message")
            .located(By.xpath("//div[@class='image-box-header']//h1"));

}
