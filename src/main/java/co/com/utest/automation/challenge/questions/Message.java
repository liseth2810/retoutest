package co.com.utest.automation.challenge.questions;

import co.com.utest.automation.challenge.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.utest.automation.challenge.userinterface.CompletedRegisterPage.LBL_WELCOME_MESSAGE;

@Subject("Get the welcome message to utest")
public class Message implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        String message = Text.of(LBL_WELCOME_MESSAGE).viewedBy(actor).asString();
        return Constants.WELCOME_MESSAGE.getValue().equals(message);

    }

    public static Message ofWelcomeMessage() {
        return new Message();
    }
}
