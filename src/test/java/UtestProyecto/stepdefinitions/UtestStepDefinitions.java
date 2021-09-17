package UtestProyecto.stepdefinitions;

import UtestProyecto.questions.Answer;
import UtestProyecto.tasks.OpenUp;
import UtestProyecto.tasks.Register;
import UtestProyecto.tasks.RegisterFinalSteps;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import UtestProyecto.model.UtestData;

import java.util.List;

public class UtestStepDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Arturo quiere registrarse en la pagina de Utest")
    public void researchingThings(List<UtestData> utestData) throws Exception {
      OnStage.theActorCalled("Arturo").wasAbleTo(OpenUp.thePage(),(Performable) Register.onThePage(utestData.get(0).getFirstName(),utestData.get(0).getLastName(),
              utestData.get(0).getEmail(),utestData.get(0).getDateOfBirthDay(),utestData.get(0).getDateOfBirthMonth(),utestData.get(0).getDateOfBirthYear(),
              utestData.get(0).getCity(),utestData.get(0).getPostalCode(),utestData.get(0).getCountry()));
    }

    @When("Arturo completa el formulario hasta el ultimo paso")
    public void searchesFor( List<UtestData> utestData) throws Exception {
       OnStage.theActorCalled("Arturo").attemptsTo(RegisterFinalSteps.onThePage(utestData.get(0).getComputer(),utestData.get(0).getVersionComputer(),
                utestData.get(0).getLanguageComputer(),utestData.get(0).getMobileDevice(),utestData.get(0).getModelMobile(),utestData.get(0).getOperatingSystemMobile(),
                utestData.get(0).getUtestPassword(),utestData.get(0).getUtestConfirmPassword()) );

    }

    @Then("Arturo presiona el boton de terminar configuracion")
    public void should_see_information_about(List<UtestData> utestData) throws Exception {
        OnStage.theActorCalled("Arturo").should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getUtestPassword())));

    }
}
