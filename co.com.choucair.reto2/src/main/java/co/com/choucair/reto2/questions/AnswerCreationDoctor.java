package co.com.choucair.reto2.questions;

import co.com.choucair.reto2.userinterface.ConfirmationCreationDoctorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerCreationDoctor implements Question<Boolean> {
    private String question;

    public AnswerCreationDoctor(String question) {this.question = question;}

    public static AnswerCreationDoctor toThe(String question) {
        return new AnswerCreationDoctor(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String title = Text.of(ConfirmationCreationDoctorPage.CONFIRMATION_MESSAGE).viewedBy(actor).asString().replace(".", "").trim();
        if (question.equalsIgnoreCase(title)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
