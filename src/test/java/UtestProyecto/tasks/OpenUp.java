package UtestProyecto.tasks;
import org.jetbrains.annotations.NotNull;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import UtestProyecto.userinterface.UtestPage;

public class OpenUp implements Task{
    private UtestPage utestPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(@NotNull T actor) {
        actor.attemptsTo(Open.browserOn(utestPage));
    }
}
