package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.FormUtest;
import tasks.JoinToday;
import tasks.OpenUp;

import java.util.List;

public class JoinTodayUtestStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Camila enters Join Today of the Utest page$")
    public void thatCamilaEntersJoinTodayOfTheUtestPage() throws Exception {
        OnStage.theActorCalled("Camila").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());

    }

    @When("^she complete all form fields$")
    public void sheCompleteAllFormFields() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(FormUtest.the("Maria Camila","Tobon Villegas","tovisscamil@gmail.com","October","21","1995","Spanish","Bello","1350","Alcatel","One Touch Idol","Android 6","Camila951021.*","Camila951021.*"));

}

    @Then("^she shows the end section (.*)$")
    public void sheShowsTheEndSectionTheLastStep(String question) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }




    @Given("^that Santiago enters Join Today of the Utest page$")
    public void thatSantiagoEntersJoinTodayOfTheUtestPage() throws Exception {
        OnStage.theActorCalled("Santiago").wasAbleTo(OpenUp.thePage(),JoinToday.onThePage());

    }

    @When("^he complete all form fields$")
    public void heCompleteAllFormFields(List<UtestData> utestData) throws Exception {
        OnStage.theActorCalled("Santiago").wasAbleTo(FormUtest.the(utestData.get(0).getStrName(),utestData.get(0).getStrLastName(),utestData.get(0).getStrEmail(),utestData.get(0).getStrMonth(),utestData.get(0).getStrDay(),utestData.get(0).getStrYear(),utestData.get(0).getStrLanguages(),utestData.get(0).getStrCity(),utestData.get(0).getStrCodePostal(),utestData.get(0).getStrMovileDevice(),utestData.get(0).getStrModelMovile(),utestData.get(0).getStrSystemMovile(),utestData.get(0).getStrPassword(),utestData.get(0).getStrConfirmPassword()));


    }

    @Then("^he shows the end section The last step$")
    public void heShowsTheEndSectionTheLastStep(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrSection())));

    }
}
