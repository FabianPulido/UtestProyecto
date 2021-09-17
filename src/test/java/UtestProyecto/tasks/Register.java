package UtestProyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import UtestProyecto.userinterface.UtestRegisterPage;

public class Register implements Task {
    private String FirstName;
    private String LastName;
    private String Email;
    private String DateOfBirthDay;
    private String DateOfBirthMonth;
    private String DateOfBirthYear;
    private String City;
    private String PostalCode;
    private String Country;

    public Register(String firstName, String lastName, String email, String dateOfBirthDay, String dateOfBirthMonth, String dateOfBirthYear, String city, String postalCode, String country) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        DateOfBirthDay = dateOfBirthDay;
        DateOfBirthMonth = dateOfBirthMonth;
        DateOfBirthYear = dateOfBirthYear;
        City = city;
        PostalCode = postalCode;
        Country = country;
    }


    public static Register onThePage(String firstName, String lastName, String email, String dateOfBirthDay, String dateOfBirthMonth, String dateOfBirthYear, String city, String postalCode, String country) {
        return Tasks.instrumented(Register.class, firstName,lastName, email,dateOfBirthDay,dateOfBirthMonth,dateOfBirthYear, city, postalCode, country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

                //Primer paso de datos del formulario

        actor.attemptsTo(Click.on(UtestRegisterPage.BOTON_JOIN),
                Enter.theValue(FirstName).into(UtestRegisterPage.INPUT_FirstName),
                Enter.theValue(LastName).into(UtestRegisterPage.INPUT_LastName),
                Enter.theValue(Email).into(UtestRegisterPage.INPUT_Email),
                SelectFromOptions.byVisibleText(DateOfBirthMonth).from(UtestRegisterPage.INPUT_BirthMonth),
                SelectFromOptions.byVisibleText(DateOfBirthDay).from(UtestRegisterPage.INPUT_BirthDay),
                SelectFromOptions.byVisibleText(DateOfBirthYear).from(UtestRegisterPage.INPUT_BirthYear),
                Click.on(UtestRegisterPage.Button_NextStep),

                //Segundo paso de datos del formulario

                Enter.theValue(City).into(UtestRegisterPage.INPUT_City),
                Enter.theValue(PostalCode).into(UtestRegisterPage.INPUT_PostalCode),
                Click.on(UtestRegisterPage.Click_Country),
                Enter.theValue(Country).into(UtestRegisterPage.INPUT_Country),
                Click.on(UtestRegisterPage.Button_NextStep)


        );
    }
}
