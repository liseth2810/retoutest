package co.com.utest.automation.challenge.tasks;

import co.com.utest.automation.challenge.interactions.ClickJavasCript;
import co.com.utest.automation.challenge.model.Devices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.utest.automation.challenge.userinterface.RegisterStepThreePage.*;

public class FillTellUsAboutYourDevices implements Task {

    private Devices devices;

    public FillTellUsAboutYourDevices(Devices devices) {
        this.devices = devices;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_COMPUTER),
                ClickJavasCript.onXpath(LIST_ELEMENT_SELECTION.of(devices.getComputer())),

                Click.on(INPUT_VERSION),
                ClickJavasCript.onXpath(LIST_ELEMENT_SELECTION.of(devices.getVersion())),

                Click.on(INPUT_LANGUAGE),
                ClickJavasCript.onXpath(LIST_ELEMENT_SELECTION.of(devices.getLanguage())),

                Click.on(INPUT_MOBILE_DEVICE),
                ClickJavasCript.onXpath(LIST_ELEMENT_SELECTION.of(devices.getMobile())),

                Click.on(INPUT_MODEL),
                ClickJavasCript.onXpath(LIST_ELEMENT_SELECTION.of(devices.getModel())),

                Click.on(INPUT_OPERATING_SYSTEM),
                ClickJavasCript.onXpath(LIST_ELEMENT_SELECTION.of(devices.getSystem())),

                Click.on(BUTTON_NEXT_LAST_STEP)
       );

    }
}
