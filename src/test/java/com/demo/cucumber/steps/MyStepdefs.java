package com.demo.cucumber.steps;

import com.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {



    @Given("^I click on the Accept cookies option$")
    public void iClickOnTheAcceptCookiesOption(){
        new HomePage().clickOnAcceptCoookies();

    }



   @When("^I click on careers button$")
    public void iClickOnCareersButton() {
        new HomePage().clickOnCareer();
    }

    @And("^I click Lanside  Option from the dropdown$")
    public void iClickLansideOptionFromTheDropdown() {
        new HomePage().clickOnLandsidedOption();
    }

    @And("^I click on SeeVacancy$")
    public void iClickOnSeeVacancy() {
        new HomePage().clickOnvacancy();
    }

    @And("^I click on ProcurementCoordinator$")
    public void iClickOnProcurementCoordinator() {
        new HomePage().clickOnProcurementCoordinator();
    }

    @And("^I click on Apply$")
    public void iClickOnApply() {
        new HomePage().clickOnApply();
    }

    @And("^I send text to first name field \"([^\"]*)\"$")
    public void iSendTextToFirstNameField(String firstname) {
        new HomePage().sendTextOnFirstNameField(firstname);
    }

    @And("^I send text to last name field \"([^\"]*)\"$")
    public void iSendTextToLastNameField(String lastname) {
        new HomePage().sendTextOnLastNameField(lastname);

    }

    @And("^I send text to email  field \"([^\"]*)\"$")
    public void iSendTextToEmailField(String email) {
        new HomePage().sendTextOnEmailIdField(email);
    }

    @And("^I send text to telephone num field \"([^\"]*)\"$")
    public void iSendTextToTelephoneNumField(String phonenum)   {
        new HomePage().sendTextOnphoneField(phonenum);

    }

    @And("^I send text to city name field \"([^\"]*)\"$")
    public void iSendTextToCityNameField(String city) {
        new  HomePage().sendTextOnTownField(city);

    }

    @Then("^I sucessfully submit the application$")
    public void iSucessfullySubmitTheApplication() {
    }
}
