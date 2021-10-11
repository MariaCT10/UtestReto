package tasks;


import cucumber.api.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestJoinToday;

public class JoinToday implements Task {


    public static JoinToday onThePage() {
      return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestJoinToday.ENTER_BUTTON)
               /* Enter.theValue("Maria Camila").into(UtestJoinToday.NAME_INPUT),
                Enter.theValue("Tobon Villegas").into(UtestJoinToday.LASTNAME_INPUT),
                Enter.theValue("tobonsvillegascamilas@gmail.com").into(UtestJoinToday.EMAIL_INPUT),
                Click.on(UtestJoinToday.LIST_MONTH),
                Click.on(UtestJoinToday.MONTH_BIRTH),
                Click.on(UtestJoinToday.LIST_DAY),
                Click.on(UtestJoinToday.DAY_BIRTH),
                Click.on(UtestJoinToday.LIST_YEAR),
                Click.on(UtestJoinToday.YEAR_BIRTH),
                Enter.theValue("Spanish").into(UtestJoinToday.LANGUAGUES),
                Click.on(UtestJoinToday.ENTER_LANGUAGUES),
                Click.on(UtestJoinToday.ENTER_BUTTON_NEXT_LOCATION),
                Enter.theValue("Bello").into(UtestJoinToday.INPUT_CITY),
                /*Enter.theValue("1350").into(UtestJoinToday.INPUT_CODE_POSTAL),
                Click.on(UtestJoinToday.ENTER_COUNTRY),
                Enter.theValue("Colombia").into(UtestJoinToday.INPUT_COUNTRY),
                Click.on(UtestJoinToday.SELECT_COUNTRY),*/
                /*Click.on(UtestJoinToday.ENTER_BUTTON_NEXT_DEVICES),
                Click.on(UtestJoinToday.ENTER_MOVILE_DEVICE),
                Enter.theValue("Alcatel").into(UtestJoinToday.LIST_MOVILE_DEVICE),
                Click.on(UtestJoinToday.SELECT_MOVILE_DEVICE),
                Click.on(UtestJoinToday.ENTER_MODEL_MOVILE),
                Enter.theValue("One Touch Idol").into(UtestJoinToday.LIST_MODEL_MOVILE),
                Click.on(UtestJoinToday.SELECT_MODEL_MOVILE),
                Click.on(UtestJoinToday.ENTER_SYSTEM_MOVILE),
                Enter.theValue("Android 6").into(UtestJoinToday.LIST_SYSTEM_MOVILE),
                Click.on(UtestJoinToday.SELECT_SYSTEM_MOVILE),
                Click.on(UtestJoinToday.SELECT_BUTTON_NEXT_LASSTEP),
                Enter.theValue("Camila951021*").into(UtestJoinToday.INPUT_PASSWORD),
                Enter.theValue("Camila951021*").into(UtestJoinToday.CONFIRM_PASSWORD),
                Click.on(UtestJoinToday.APPROVED_STAY_INFORMED),
                Click.on(UtestJoinToday.APPROVE_TERMS_OF_USE),
                Click.on(UtestJoinToday.APPROVE_PRIVACY_SECURITY),
                Click.on(UtestJoinToday.COMPLET_SETUP)*/



                );

    }
}
