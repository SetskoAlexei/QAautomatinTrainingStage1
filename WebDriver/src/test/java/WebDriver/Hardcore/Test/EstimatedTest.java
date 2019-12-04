package WebDriver.Hardcore.Test;

import WebDriver.Hardcore.Page.Page10minutemaill;
import WebDriver.HurtMePlenty.page.GoogleCloudHomePage;
import WebDriver.HurtMePlenty.page.GoogleCloudPricingCalculatorPage;
import WebDriver.HurtMePlenty.page.ResultEstimatedPage;
import WebDriver.HurtMePlenty.page.SearchResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EstimatedTest {

    static WebDriver driver;

    @BeforeSuite
    public void browserSetup(){
        driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        String searchInput = "Google Cloud Platform Pricing Calculator";
        GoogleCloudHomePage homePage = new  GoogleCloudHomePage(driver);
        homePage.openPage ();
        homePage.searchCalculator (searchInput);
        SearchResultPage resultPage = new SearchResultPage (driver);
        resultPage.selectCalculatorFromSearch ();
        String numberOfInstancesInput = "4";
        GoogleCloudPricingCalculatorPage calculatorPage = new GoogleCloudPricingCalculatorPage (driver);
        calculatorPage.setupCalculator (numberOfInstancesInput);
        Page10minutemaill temporaryEmail = new Page10minutemaill (driver);
        temporaryEmail.openPage ();
        ResultEstimatedPage sendMail = new ResultEstimatedPage (driver);
        sendMail.hardcoreSuiteEmailEstimate ();
        temporaryEmail.readEmail ();
    }

    @Test
    public void estimatedFromCalculatorEqualsEstimatedFromEmail(){
        String estimatedFromEmail = new Page10minutemaill (driver).textFromEmail ();
        String estimatedFromCalculator = new ResultEstimatedPage (driver).estimatedCostFromCalculator ().replaceAll (" per 1 month","");
        Assert.assertEquals (estimatedFromCalculator, estimatedFromEmail);
    }
    @AfterSuite
    public void afterTest(){
        driver.quit ();
        driver = null;
    }
}
