package co.com.utest.automation.challenge.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterStepTwoPage {

    public static final Target SELECT_CITY = Target.the("where select the city")
            .located(By.id("city"));

    public static final Target INPUT_POSTAL_CODE = Target.the("where we write the postal code")
            .located(By.id("zip"));

    public static final Target BUTTON_NEXT_DEVICES = Target.the("where we click to continue")
            .located(By.xpath("//a[@Class='btn btn-blue pull-right']//span"));

    public static final Target IMG_MAP = Target.the("Image gps")
            .located(By.xpath("//img[@usemap='#gmimap1']"));

    private RegisterStepTwoPage() {}
}
