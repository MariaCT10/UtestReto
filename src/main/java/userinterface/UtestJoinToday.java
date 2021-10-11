package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinToday extends PageObject {
    public static final Target ENTER_BUTTON = Target.the("button to the get into of form")
            .located(By.xpath("(//a[contains(.,'Join Today')])[1]"));
/*
    public static final Target NAME_INPUT = Target.the("where do we write the name")
            .located(By.xpath("//input[contains(@id,'firstName')]"));

    public static final Target LASTNAME_INPUT = Target.the("where do we write the lastname")
            .located(By.xpath("//input[contains(@id,'lastName')]"));

    public static final Target EMAIL_INPUT = Target.the("where do we write the email adress")
            .located(By.xpath("//input[contains(@id,'email')]"));

    public static final Target LIST_MONTH = Target.the("where do we write the month of birth")
            .located(By.xpath("//select[contains(@id,'birthMonth')]"));

    public static final Target MONTH_BIRTH = Target.the("where do we write the month of birth")
            .located(By.xpath("//option[@label='October'][contains(.,'October')]"));

    public static final Target LIST_DAY = Target.the("where do we write the month of birth")
            .located(By.xpath("//select[contains(@id,'birthDay')]"));

    public static final Target DAY_BIRTH = Target.the("where do we write the day of birth")
            .located(By.xpath("//option[@label='21'][contains(.,'21')]"));

    public static final Target LIST_YEAR = Target.the("where do we write the month of birth")
            .located(By.xpath("//select[contains(@id,'birthYear')]"));

    public static final Target YEAR_BIRTH = Target.the("where do we write the year of birth")
            .located(By.xpath("//option[@label='1995'][contains(.,'1995')]"));

    public static final Target LANGUAGUES = Target.the("where do we write the languages")
            .located(By.xpath("//input[contains(@type,'search')]"));

    public static final Target ENTER_LANGUAGUES = Target.the("where do we click the language")
            .located(By.xpath("//span[@class='ui-select-highlight'][contains(.,'Spanish')]"));

    public static final Target ENTER_BUTTON_NEXT_LOCATION = Target.the("button to the next section location")
            .located(By.xpath("//span[contains(.,'Next: Location')]"));

    public static final Target INPUT_CITY = Target.the("where do we the city")
            .located(By.xpath("//input[contains(@id,'city')]"));
/*
    public static final Target INPUT_CODE_POSTAL = Target.the("where do we the code postal")
            .located(By.xpath("//input[contains(@id,'zip')]"));

    public static final Target ENTER_COUNTRY= Target.the("where do we the country")
            .located(By.xpath("//span[@ng-hide='$select.isEmpty()'][contains(.,'Select Country')]"));

    public static final Target INPUT_COUNTRY= Target.the("where do we the country")
            .located(By.xpath("//input[contains(@id,'city')]"));

    public static final Target SELECT_COUNTRY= Target.the("where do we the country")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner'][contains(.,'Colombia')]"));
*/
  /*  public static final Target ENTER_BUTTON_NEXT_DEVICES = Target.the("button to the next section devices")
            .located(By.xpath("//span[@aria-hidden='true'][contains(.,'Next: Devices')]"));

    public static final Target ENTER_MOVILE_DEVICE = Target.the("where do we click in list of movile device")
            .located(By.xpath("//span[@tabindex='-1'][contains(.,'Select Brand')]"));

    public static final Target LIST_MOVILE_DEVICE = Target.the("where do we write of movile device")
            .located(By.xpath("(//input[contains(@type,'search')])[4]"));

    public static final Target SELECT_MOVILE_DEVICE = Target.the("where do we select in list of movile device")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner'][contains(.,'Alcatel')]"));

    public static final Target ENTER_MODEL_MOVILE = Target.the("where do we click in the list og model movile")
            .located(By.xpath("//span[@ng-show='$select.isEmpty()'][contains(.,'Select a Model')]"));

    public static final Target LIST_MODEL_MOVILE = Target.the("where do we write of model movile")
            .located(By.xpath("(//input[contains(@type,'search')])[5]"));

    public static final Target SELECT_MODEL_MOVILE = Target.the("where do we select in the list of model movile")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner'][contains(.,'One Touch Idol')]"));

    public static final Target ENTER_SYSTEM_MOVILE = Target.the("where do we click in list to system of movile")
            .located(By.xpath("(//span[@tabindex='-1'][contains(.,'Select OS')])[3]"));

    public static final Target LIST_SYSTEM_MOVILE = Target.the("where do we write of the sysmtem of movile")
            .located(By.xpath("(//input[contains(@type,'search')])[6]"));

    public static final Target SELECT_SYSTEM_MOVILE = Target.the("where do we select in the list of system of movile")
            .located(By.xpath("(//span[@class='ui-select-choices-row-inner'][contains(.,'Android 6')])[1]"));

    public static final Target SELECT_BUTTON_NEXT_LASSTEP = Target.the("button of the next section last step")
            .located(By.xpath("//span[contains(.,'Next: Last Step')]"));

    public static final Target INPUT_PASSWORD = Target.the("where do we write the password ")
            .located(By.xpath("//input[contains(@id,'password')]"));

    public static final Target CONFIRM_PASSWORD= Target.the("where do we write again the password to confirm")
            .located(By.xpath("//input[contains(@id,'confirmPassword')]"));

    public static final Target APPROVED_STAY_INFORMED = Target.the(" where do we  approve the option to stay informed ")
            .located(By.xpath("//span[contains(@class,'checkbox--highlight')]"));

    public static final Target APPROVE_TERMS_OF_USE = Target.the("where do we approve the option of terms of use")
            .located(By.xpath("(//span[contains(@class,'checkmark signup-consent__checkbox error')])[1]"));

    public static final Target APPROVE_PRIVACY_SECURITY = Target.the("where do we approve the term of secutiry and politics")
            .located(By.xpath("(//span[contains(@class,'checkmark signup-consent__checkbox')])[3]"));

    public static final Target COMPLET_SETUP = Target.the("where do wee confirm that we was registered as a new user ")
            .located(By.xpath("//span[contains(.,'Complete Setup')]"));

    public static final Target NAME_END_PAGE = Target.the("name section end the page")
            .located(By.xpath("//span[@class='sub-title'][contains(.,'The last step')]"));



*/





}
