package co.com.utest.automation.challenge.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterStepThreePage extends PageObject {

    public static final Target INPUT_COMPUTER = Target.the("where select your computer")
            .located(By.xpath("//div[@name='osId']"));

    public static final Target INPUT_VERSION = Target.the("where select your version computer")
            .located(By.xpath("//div[@name='osVersionId']"));

    public static final Target INPUT_LANGUAGE = Target.the("where select your language")
            .located(By.xpath("//div[@name='osLanguageId']"));

    public static final Target INPUT_MOBILE_DEVICE = Target.the("where select your mobile")
            .located(By.xpath("//div[@name='handsetMakerId']"));

    public static final Target INPUT_MODEL = Target.the("where select your model of mobile")
            .located(By.xpath("//div[@name='handsetModelId']"));

    public static final Target INPUT_OPERATING_SYSTEM = Target.the("where select your computer")
            .located(By.xpath("//div[@name='handsetOSId']"));

    public static final Target LIST_ELEMENT_SELECTION = Target.the("where select your computer")
            .locatedBy("//div[text()='{0}']");

    public static final Target BUTTON_NEXT_LAST_STEP = Target.the("where we click to continue")
            .located(By.xpath("//a[@Class='btn btn-blue pull-right']//span"));

}
