package co.com.utest.automation.challenge.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.JavascriptExecutor;
import net.serenitybdd.screenplay.targets.Target;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ClickJavasCript implements Performable {

    Target target;

    public ClickJavasCript(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        executor.executeScript("document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();",target.getCssOrXPathSelector());
    }

    public static ClickJavasCript onXpath(Target target){
         return Tasks.instrumented(ClickJavasCript.class, target);
    }

}
