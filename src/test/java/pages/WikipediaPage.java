package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WikipediaPage {
    public WikipediaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement searchInputBox;
    @FindBy(xpath = "//button[@class='pure-button pure-button-primary-progressive']")
    public WebElement button;
}
