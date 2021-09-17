package UtestProyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import UtestProyecto.userinterface.UtestRegisterPage;

public class RegisterFinalSteps implements Task  {

    private String Computer;
    private String VersionComputer;
    private String LanguageComputer;
    private String MobileDevice;
    private String ModelMobile;
    private String OperatingSystemMobile;
    private String UtestPassword;
    private String UtestConfirmPassword;

    public RegisterFinalSteps(String computer, String versionComputer, String languageComputer, String mobileDevice, String modelMobile, String operatingSystemMobile, String utestPassword, String utestConfirmPassword) {
        Computer = computer;
        VersionComputer = versionComputer;
        LanguageComputer = languageComputer;
        MobileDevice = mobileDevice;
        ModelMobile = modelMobile;
        OperatingSystemMobile = operatingSystemMobile;
        UtestPassword = utestPassword;
        UtestConfirmPassword = utestConfirmPassword;
    }

    public static Register onThePage(String computer, String versionComputer, String languageComputer, String mobileDevice, String modelMobile, String operatingSystemMobile, String utestPassword, String utestConfirmPassword) {
        return Tasks.instrumented(Register.class, computer, versionComputer,languageComputer,mobileDevice,modelMobile,operatingSystemMobile, utestPassword, utestConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                //Tercer paso de datos del formulario

                Click.on(UtestRegisterPage.Click_Computer),
                Enter.theValue(Computer).into(UtestRegisterPage.INPUT_Computer),
                Click.on(UtestRegisterPage.Click_VersionComputer),
                Enter.theValue(VersionComputer).into(UtestRegisterPage.INPUT_VersionComputer),
                Click.on(UtestRegisterPage.Click_LanguageComputer),
                Enter.theValue(LanguageComputer).into(UtestRegisterPage.INPUT_LanguageComputer),
                Click.on(UtestRegisterPage.Click_MobileDevice),
                Enter.theValue(MobileDevice).into(UtestRegisterPage.INPUT_MobileDevice),
                Click.on(UtestRegisterPage.Click_ModelMobile),
                Enter.theValue(ModelMobile).into(UtestRegisterPage.INPUT_ModelMobile),
                Click.on(UtestRegisterPage.Click_OperatingSystemMobile),
                Enter.theValue(OperatingSystemMobile).into(UtestRegisterPage.INPUT_OperatingSystemMobile),
                Click.on(UtestRegisterPage.Button_NextFinalStep),

                //Cuarto y ultimo paso de datos del formulario

                Enter.theValue(UtestPassword).into(UtestRegisterPage.INPUT_UtestPassword),
                Enter.theValue(UtestConfirmPassword).into(UtestRegisterPage.INPUT_UtestConfirmPassword),
                Click.on(UtestRegisterPage.INPUT_CheckBoxLeido),
                Click.on(UtestRegisterPage.INPUT_CheckBoxLeidoPolitica),
                Click.on(UtestRegisterPage.Button_FinalRegister)


        );

    }


}
