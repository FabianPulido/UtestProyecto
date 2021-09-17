package UtestProyecto.questions;

import UtestProyecto.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import UtestProyecto.model.UtestData;

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
        String ConfirmPassword= Text.of(UtestRegisterPage.INPUT_UtestConfirmPassword).viewedBy(actor).asString();
        if (question.equals(ConfirmPassword)){
            result  =   true;
        }else{
            result  = false;
        }
        return result;
    }
}