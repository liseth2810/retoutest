package co.com.utest.automation.challenge.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class JoinTodayPage {

    public static final Target JOIN_TODAY = Target.the("Button that takes us to the session to create account")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

    private JoinTodayPage() {
    }
}
