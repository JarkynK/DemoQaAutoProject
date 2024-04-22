package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EtsyPage;
import utilities.Config;
import utilities.Driver;

public class EtsySearchStepDef {

    EtsyPage etsyPage = new EtsyPage();

    @Given("User goes to Etsy page")
    public void user_goes_to_Etsy_page() {
        Driver.getDriver().get(Config.getProperty("urlEtsy"));

    }

    @When("User types on search box wooden spoon")
    public void user_types_on_search_box_wooden_spoon() {
        etsyPage.searchInputBox.sendKeys("wooden spoon" + Keys.ENTER);
    }

    @Then("User sees wooden spoon title")
    public void user_sees_wooden_spoon_title() {
        String expectedResult = Driver.getDriver().getTitle();

        if(expectedResult.equals("Wooden spoon")){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

        //Assert.assertEquals("message",Driver.getDriver().getTitle().equals("Wooden Spoon"));
    }
}
