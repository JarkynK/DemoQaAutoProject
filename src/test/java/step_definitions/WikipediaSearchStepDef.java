package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WikipediaPage;
import utilities.Config;
import utilities.Driver;

import java.lang.module.Configuration;

public class WikipediaSearchStepDef {

    WikipediaPage wikipediaPage = new WikipediaPage();

    @Given("User goes to Wikipedia page")
    public void user_goes_to_Wikipedia_page() {
        Driver.getDriver().get(Config.getProperty("urlWikipedia"));

    }

    @When("User types on search box Barak Obama")
    public void user_types_on_search_box_Barak_Obama() {
        wikipediaPage.searchInputBox.sendKeys("Barak Obama" + Keys.ENTER);
    }

    @Then("User sees Barak Obama on title")
    public void user_sees_Barak_Obama_on_title() {

       String nameResult = Driver.getDriver().getTitle();
        System.out.println(nameResult);

       if (nameResult.equals("Barak Obama")){
           System.out.println("Test Passed");
       }else {
           System.out.println("Test failed");
       }

       // Assert.assertEquals(nameResult.equals("Barak Obama"),"message");
    }
}
