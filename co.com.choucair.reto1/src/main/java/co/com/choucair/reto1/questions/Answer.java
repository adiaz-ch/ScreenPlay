package co.com.choucair.reto1.questions;

import co.com.choucair.reto1.userinterface.WebTablePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String titulo = Text.of(WebTablePage.TITLE).viewedBy(actor).asString().replaceFirst("- ", "").replace(".", "");
        if (question.equals(titulo)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
