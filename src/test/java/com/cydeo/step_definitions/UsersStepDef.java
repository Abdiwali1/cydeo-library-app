package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.UsersPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UsersStepDef {

    DashboardPage dashboardPage = new DashboardPage();

    @When("there should be {int} users")
    public void there_should_be_users(int expectedUserAmount) {

        BrowserUtils.waitForVisibility(dashboardPage.usersAmount,15);

      String expectedUserCount = String.valueOf(expectedUserAmount); // expectedUserAmount+""
      String actualUserCount = dashboardPage.usersAmount.getText();

        Assert.assertEquals(expectedUserCount,actualUserCount);
    }

    @When("I click on {string} link")
    public void i_click_on_link(String link) {

        switch (link.toLowerCase()){
            case "dashboard":
                dashboardPage.dashboardLink.click();
                break;
            case "users":
                dashboardPage.usersLink.click();
                break;
            case "books":
                dashboardPage.booksLink.click();
                break;
        }

    }

    @Then("table should have the following column names:")
    public void table_should_have_the_following_column_names(io.cucumber.datatable.DataTable dataTable) {


    }



}
