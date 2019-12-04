package WebDriver.HurtMePlenty.page;

import WebDriver.Hardcore.Page.Page10minutemaill;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class ResultEstimatedPage extends AbstractPage {

    public ResultEstimatedPage(WebDriver driver) {
        super (driver);
    }
    @FindBy(xpath = "//*[@class='md-1-line md-no-proxy ng-scope']")
    WebElement resultVM_Class;

    @FindBy(xpath = "(//md-list-item[@class='md-1-line md-no-proxy'])[2]")
    WebElement resultInstanceType;

    @FindBy(xpath = "(//md-list-item[@class='md-1-line md-no-proxy'])[3]")
    WebElement resultRegionLocated;

    @FindBy(xpath = "(//md-list-item[@class='md-1-line md-no-proxy ng-scope'][2])")
    WebElement resultLocalSSD_space;

    @FindBy(xpath = "(//md-list-item[@class='md-1-line md-no-proxy ng-scope'])[3]")
    WebElement resultCommitmentTerm;

    @FindBy(xpath = "(//*[@class='md-title'])[6]")
    WebElement ActuallyTotalEstimatedCost;

    @FindBy(id = "email_quote")
    WebElement emailEstimate;

    @FindBy(id = "input_415")
    WebElement typingEmail;

    @FindBy(xpath = "//button[@aria-label='Send Email']")
    WebElement buttonSendEmail;

    public String resultVM_ClassText(){
        return  resultVM_Class.getText ();
    }
    public String resultInstanceTypeText(){
        return resultInstanceType.getText ();
    }
    public String resultRegionLocated(){
        return resultRegionLocated.getText ();
    }
    public String resultLocalSSD_space(){
        return resultLocalSSD_space.getText ();
    }
    public String resultCommitmentTerm (){
        return resultCommitmentTerm.getText ();
    }
    public String actuallyTotalEstimatedCost(){
        return ActuallyTotalEstimatedCost.getText ();
    }

    public ResultEstimatedPage hardcoreSuiteEmailEstimate()  {
        String email = new Page10minutemaill (driver).sendEmail ();
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles ());
        driver.switchTo().window(tabs.get(0));
        driver.switchTo ().frame ("myFrame");
        emailEstimate.click ();
        typingEmail.sendKeys (email);
        buttonSendEmail.click ();
        new WebDriverWait (driver, 10)
                .until (ExpectedConditions.elementToBeClickable (buttonSendEmail));
        return this;
    }
    public String estimatedCostFromCalculator(){
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles ());
        driver.switchTo().window(tabs.get(0));
        driver.switchTo ().frame ("myFrame");
        String estimatedCostFromCalculator = ActuallyTotalEstimatedCost.getText ();
        return estimatedCostFromCalculator.replaceAll ("Total Estimated Cost: ","");
    }
}
