package WebDriver.Hardcore.Page;

import WebDriver.HurtMePlenty.page.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class Page10minutemaill extends AbstractPage {

    private static final String homePageURL_TemporaryEmail = "https://10minutemail.com/";

    public Page10minutemaill(WebDriver driver) {
        super (driver);
    }

    @FindBy(id = "mailAddress")
    WebElement temporaryEmail;

    @FindBy(id = "ui-id-1")
    WebElement openMessage;

    @FindBy(xpath = "(//td/h3)[2]")
    WebElement estimatedCostFromEmail;

    public Page10minutemaill  openPage() {
        ((JavascriptExecutor) driver).executeScript ("window.open();");
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles ());
        driver.switchTo ().window (tabs.get (1));
        driver.get (homePageURL_TemporaryEmail);
        return this;
    }
    public String sendEmail(){
        return temporaryEmail.getAttribute ("value");
    }
    public Page10minutemaill readEmail(){
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles ());
        driver.switchTo ().window (tabs.get (1));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        new WebDriverWait (driver, 500)
                .until (ExpectedConditions.visibilityOf (openMessage));
        openMessage.click ();
         new WebDriverWait(driver, 15)
                .until(ExpectedConditions.visibilityOfElementLocated
                        (By.xpath ("(//td/h3)[2]")));
        return this;
    }
    public String textFromEmail(){
        String estimatedFromEmail = estimatedCostFromEmail.getText ();
        return estimatedFromEmail;
    }
}
