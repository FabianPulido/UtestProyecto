package UtestProyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestRegisterPage extends PageObject {

    public static final Target BOTON_JOIN = Target.
                                              the("boton para iniciar registro").
                                              located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']//strong[contains(text(),'Join Today')]"));

    // DATOS DEL PRIMER PASO DEL FORMULARIO ---------------

    public static final Target INPUT_FirstName = Target.
            the("Campo para ingresar nombres").
            located(By.id("firstName"));

    public static final Target INPUT_LastName = Target.
            the("Campo para ingresar apellidos").
            located(By.id("lastName"));

    public static final Target INPUT_Email = Target.
            the("Campo para ingresar correo electronico").
            located(By.id("email"));

    public static final Target INPUT_BirthDay = Target.
            the("Campo para ingresar dia de cumpleaños").
            located(By.id("birthDay"));

    public static final Target INPUT_BirthMonth = Target.
            the("Campo para ingresar mes de cumpleaños").
            located(By.id("birthMonth"));

    public static final Target INPUT_BirthYear = Target.
            the("Campo para ingresar año de cumpleaños").
            located(By.id("birthYear"));

    public static final Target Button_NextStep = Target.
            the("boton para siguiente paso").
            located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]"));

    // DATOS DEL SEGUNDO PASO DEL FORMULARIO ---------------

    public static final Target INPUT_City = Target.
            the("Campo para ingresar la ciudad").
            located(By.id("city"));

    public static final Target INPUT_PostalCode= Target.
            the("Campo para ingresar el codigo postal").
            located(By.id("zip"));

    public static final Target Click_Country= Target.
            the("Seleccionar el campo donde estara el pais").
            located(By.xpath("//div[contains(@class,'ui-select-match ng-hide')]"));

    public static final Target INPUT_Country = Target.
            the("Campo para ingresar el pais").
            located(By.xpath("//div[contains(@class,'{ 'ui-select-search-hidden' : !$select.searchEnabled }')]"));

    // DATOS DEL TERCER PASO DEL FORMULARIO ---------------

    public static final Target Click_Computer= Target.
            the("Seleccionar el campo donde estara el computador").
            located(By.xpath("//div[contains(@class,'ui-select-match')]//strong[contains(text(),'Select OS')"));

    public static final Target INPUT_Computer = Target.
            the("Campo para ingresar el computador").
            located(By.xpath("//div[contains(@class,'form-control ui-select-search ng-valid ng-dirty ng-touched ng-not-empty ng-valid-parse')]"));

    public static final Target Click_VersionComputer= Target.
            the("Seleccionar el campo donde estara la version del computador").
            located(By.xpath("//div[contains(@class,'ui-select-match')]//strong[contains(text(),'Select a Version')"));

    public static final Target INPUT_VersionComputer = Target.
            the("Campo para ingresar la version del computador").
            located(By.xpath("//div[contains(@placeholder,'Select a Version')]"));

    public static final Target Click_LanguageComputer= Target.
            the("Seleccionar el campo donde estara el lenguaje del computador").
            located(By.xpath("//div[contains(@class,'ui-select-match')]//strong[contains(text(),'Select OS language')"));

    public static final Target INPUT_LanguageComputer = Target.
            the("Campo para ingresar el lenguaje del computador").
            located(By.xpath("//div[contains(@placeholder,'Select OS language')]"));




    public static final Target Click_MobileDevice= Target.
            the("Seleccionar el campo donde estara el tipo de celular").
            located(By.xpath("//div[contains(@class,'ui-select-match')]//strong[contains(text(),'Select Brand')"));

    public static final Target INPUT_MobileDevice = Target.
            the("Campo para ingresar el tipo de celular").
            located(By.xpath("//div[contains(@placeholder,'Select Brand')]"));

    public static final Target Click_ModelMobile= Target.
            the("Seleccionar el campo donde estara el modelo de celular").
            located(By.xpath("//div[contains(@class,'ui-select-match')]//strong[contains(text(),'Select a Model')"));

    public static final Target INPUT_ModelMobile = Target.
            the("Campo para ingresar el modelo de celular").
            located(By.xpath("//div[contains(@placeholder,'Select a Model')]"));

    public static final Target Click_OperatingSystemMobile= Target.
            the("Seleccionar el campo donde estara el sistema operativo del celular").
            located(By.xpath("//div[contains(@class,'ui-select-match')]//strong[contains(text(),'Select OS')"));

    public static final Target INPUT_OperatingSystemMobile = Target.
            the("Campo para ingresar el sistema operativo del celular").
            located(By.xpath("//div[contains(@placeholder,'Select OS')]"));

    public static final Target Button_NextFinalStep = Target.
            the("boton para el paso final").
            located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]"));

    // DATOS DEL CUARTO PASO DEL FORMULARIO ---------------

    public static final Target INPUT_UtestPassword = Target.
            the("Campo para ingresar una contrasena").
            located(By.id("password"));

    public static final Target INPUT_UtestConfirmPassword = Target.
            the("Campo para reingresar la contrasena para confirmar").
            located(By.id("confirmPassword"));

    public static final Target INPUT_CheckBoxLeido= Target.
            the("Check que afirma leer los terminos y condiciones").
            located(By.xpath("//div[contains(@class,'row col-xs-12')]//strong[contains('I have read and accept the')"));

    public static final Target INPUT_CheckBoxLeidoPolitica= Target.
            the("Check que afirma leer la politica de privacidad y seguridad").
            located(By.xpath("//div[contains(@class,'row col-xs-12')]//strong[contains('I have read and accept the')"));

    public static final Target Button_FinalRegister= Target.
            the("boton para finalizar el registro").
            located(By.id("laddaBtn"));

}
