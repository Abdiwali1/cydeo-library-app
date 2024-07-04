package com.cydeo.step_definitions;

import com.cydeo.pages.BooksPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BooksStepDef {

      BooksPage booksPage = new BooksPage();
    Select select = new Select(booksPage.selectRecords);

    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(int expectedDefaultNum) {

        String actualDefaultNum = select.getFirstSelectedOption().getText();
        String expectedDefaultNumber = String.valueOf(expectedDefaultNum); // expectedDefaultNum+""

        Assert.assertEquals(expectedDefaultNumber,actualDefaultNum);
    }

    @Then("show records should have the following options:")
    public void show_records_should_have_the_following_options(List<String> expectedOptions) {

        List<String> actualOptions = new ArrayList<>();

        List<WebElement> options = select.getOptions();

        for (WebElement eachOption : options) {
            actualOptions.add(eachOption.getText());
        }

        Assert.assertEquals(expectedOptions,actualOptions);


    }


}
