package WebDriver.HurtMePlenty.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends AbstractPage {

    @FindBy(xpath = "//a[@class='gs-title']")
    WebElement calculatorFromSearch;

    public SearchResultPage(WebDriver driver) {
        super (driver);
    }
    public SearchResultPage selectCalculatorFromSearch(){
        calculatorFromSearch.click ();

        return this;
    }
}
