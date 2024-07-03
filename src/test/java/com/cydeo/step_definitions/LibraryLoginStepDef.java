package com.cydeo.step_definitions;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LibraryLoginStepDef {

    LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
    }


    @When("I log in as a librarian")
    public void i_log_in_as_a_librarian() {
//     libraryLoginPage.emailInput.sendKeys(ConfigurationReader.getProperty("lib22_user"));
//     libraryLoginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
//     libraryLoginPage.signinBtn.click();

        libraryLoginPage.login(ConfigurationReader.getProperty("lib22_user"),ConfigurationReader.getProperty("lib22_pass"));
    }


    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));

    }


}
