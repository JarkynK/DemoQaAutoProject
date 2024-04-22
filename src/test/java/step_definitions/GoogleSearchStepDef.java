package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GooglePage;
import utilities.Config;
import utilities.Driver;
import utilities.Wait;


public class GoogleSearchStepDef {
    GooglePage googlePage = new GooglePage();

    @Given("User goes to Google page")
    public void user_goes_to_Google_page() throws Exception{

        Driver.getDriver().get("https://www.google.com/");
    }

    @When("User types on google search box wooden spoon")
    public void user_types_on_google_search_box_wooden_spoon() {
        Wait.exWait(googlePage.searchInputBox);
        googlePage.searchInputBox.sendKeys("wooden spoon" + Keys.ENTER);
    }

    @Then("User sees wooden spoon on title")
    public void user_sees_wooden_spoon_on_title() {
        String expectedResultTitle = Driver.getDriver().getTitle();
       if (expectedResultTitle.equals("Wooden spoon")){
           System.out.println("Test passed");
       }else {
           System.out.println("Test Failed");
       }
    }
}
