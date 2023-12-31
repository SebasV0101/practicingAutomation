package com.co.conduit.stepsdefinitions;

import com.co.conduit.models.RegisterData;
import com.co.conduit.questions.ValidationName;
import com.co.conduit.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^He user is on the page$")
    public void heUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://angular.realworld.io/"));
    }

    @When("^He user enter the data for the register$")
    public void heUserEnterTheDataForTheRegister(List<RegisterData>registerDataList) {
        RegisterData registerData;
        registerData = registerDataList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Register.enter(registerData));
    }

    @Then("^He could see the name$")
    public void heCouldSeeTheName() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationName.compare()
                , Matchers.is(true)));
    }
}