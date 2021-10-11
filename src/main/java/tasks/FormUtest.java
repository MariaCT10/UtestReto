package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.UtestFormTest;


public class FormUtest implements Task {
    private String strName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strLanguages;
    private String strCity;
    private String strCodePostal;
    private String strMovileDevice;
    private String strModelMovile;
    private String strSystemMovile;
    private String strPassword;
    private String strConfirmPassword;


    public FormUtest(String strName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strLanguages, String strCity, String strCodePostal, String strMovileDevice, String strModelMovile, String strSystemMovile, String strPassword, String strConfirmPassword ) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strLanguages = strLanguages;
        this.strCity = strCity;
        this.strCodePostal = strCodePostal;
        this.strMovileDevice = strMovileDevice;
        this.strModelMovile = strModelMovile;
        this.strSystemMovile = strSystemMovile;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;

    }


    public static FormUtest the(String strName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strLanguages, String strCity, String strCodePostal, String strMovileDevice, String strModelMovile, String strSystemMovile, String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(FormUtest.class,strName,strLastName,strEmail,strMonth,strDay,strYear,strLanguages,strCity,strCodePostal,strMovileDevice,strModelMovile,strSystemMovile,strPassword,strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo( Enter.theValue(strName).into(UtestFormTest.NAME_INPUT),
                Enter.theValue(strLastName).into(UtestFormTest.LASTNAME_INPUT),
                Enter.theValue(strEmail).into(UtestFormTest.EMAIL_INPUT),
                Click.on(UtestFormTest.LIST_MONTH),
                Click.on(UtestFormTest.MONTH_BIRTH),
                Click.on(UtestFormTest.LIST_DAY),
                Click.on(UtestFormTest.DAY_BIRTH),
                Click.on(UtestFormTest.LIST_YEAR),
                Click.on(UtestFormTest.YEAR_BIRTH),
                Enter.theValue(strLanguages).into(UtestFormTest.LANGUAGUES),
                Click.on(UtestFormTest.ENTER_LANGUAGUES),
                Click.on(UtestFormTest.ENTER_BUTTON_NEXT_LOCATION),
                Enter.theValue(strCity).into(UtestFormTest.INPUT_CITY),
                        Hit.the(Keys.ARROW_DOWN).into(UtestFormTest.INPUT_CITY),
                Hit.the(Keys.ENTER).into(UtestFormTest.INPUT_CITY),
                Enter.theValue(strCodePostal).into(UtestFormTest.INPUT_CODE_POSTAL),
                /*Click.on(UtestFormTest.ENTER_COUNTRY),
                Enter.theValue("Colombia").into(UtestFormTest.INPUT_COUNTRY),
                Click.on(UtestFormTest.SELECT_COUNTRY),*/
                Click.on(UtestFormTest.ENTER_BUTTON_NEXT_DEVICES),
                Click.on(UtestFormTest.ENTER_MOVILE_DEVICE),
                Enter.theValue(strMovileDevice).into(UtestFormTest.LIST_MOVILE_DEVICE),
                Click.on(UtestFormTest.SELECT_MOVILE_DEVICE),
                Click.on(UtestFormTest.ENTER_MODEL_MOVILE),
                Enter.theValue(strModelMovile).into(UtestFormTest.LIST_MODEL_MOVILE),
                Click.on(UtestFormTest.SELECT_MODEL_MOVILE),
                Click.on(UtestFormTest.ENTER_SYSTEM_MOVILE),
                Enter.theValue(strSystemMovile).into(UtestFormTest.LIST_SYSTEM_MOVILE),
                Click.on(UtestFormTest.SELECT_SYSTEM_MOVILE),
                Click.on(UtestFormTest.SELECT_BUTTON_NEXT_LASSTEP),
                Enter.theValue(strPassword).into(UtestFormTest.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(UtestFormTest.CONFIRM_PASSWORD),
                Click.on(UtestFormTest.APPROVED_STAY_INFORMED),
                Click.on(UtestFormTest.APPROVE_TERMS_OF_USE),
                Click.on(UtestFormTest.APPROVE_PRIVACY_SECURITY),
                Click.on(UtestFormTest.COMPLET_SETUP)



                );




    }
}
