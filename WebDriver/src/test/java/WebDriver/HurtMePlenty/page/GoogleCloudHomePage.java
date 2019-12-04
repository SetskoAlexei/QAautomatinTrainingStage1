package WebDriver.HurtMePlenty.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleCloudHomePage extends AbstractPage {

    private static final String homePageURL = "https://cloud.google.com/";

    @FindBy(name = "q")
    WebElement searchButton;

    public GoogleCloudHomePage(WebDriver driver) {
        super (driver);
    }
    public GoogleCloudHomePage openPage(){
        driver.get (homePageURL);
        new WebDriverWait (driver, 15)
                .until (ExpectedConditions.presenceOfElementLocated (By.name ("q")));
        return this;
    }
    public GoogleCloudHomePage searchCalculator(String searchInput){
        searchButton.click ();
        searchButton.sendKeys (searchInput);
        searchButton.submit ();
        return this;
    }
}
