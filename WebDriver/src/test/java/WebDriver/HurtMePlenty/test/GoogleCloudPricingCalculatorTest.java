package WebDriver.HurtMePlenty.test;

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

public class GoogleCloudPricingCalculatorTest {

    WebDriver driver;

    @BeforeSuite(alwaysRun = true)
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
    }

    @Test
    public void VM_ClassEqualsInputVM_Class(){
        String expectedVM_Class = "VM class: regular";
        String actuallyVM_Class = new ResultEstimatedPage(driver).resultVM_ClassText ();
        Assert.assertEquals (actuallyVM_Class, expectedVM_Class);
    }
    @Test
    public void instanceTypeEqualsInputInstanceType(){
        String expectedInstanceType = "Instance type: n1-standard-8";
        String actuallyInstanceType = new ResultEstimatedPage (driver).resultInstanceTypeText ();
        Assert.assertEquals (actuallyInstanceType, expectedInstanceType);
    }
    @Test
    public void regionLocatedEqualsInputRegionLocated(){
        String expectedRegionLocated = "Region: Frankfurt";
        String actuallyRegionLocated = new ResultEstimatedPage (driver).resultRegionLocated ();
        Assert.assertEquals (actuallyRegionLocated, expectedRegionLocated);
    }
    @Test
    public void LocalSSD_SpaceEqualsInputLocalSSD_Space(){
        String expectedLocalSSD_Space = "Total available local SSD space 2x375 GB";
        String actuallyLocalSSD_Space = new ResultEstimatedPage (driver).resultLocalSSD_space ();
        Assert.assertEquals (actuallyLocalSSD_Space, expectedLocalSSD_Space);
    }
    @Test
    public void committedTermEqualsInputCommittedTerm(){
        String expectedCommittedTerm = "Commitment term: 1 Year";
        String actuallyCommittedTerm = new ResultEstimatedPage (driver).resultCommitmentTerm ();
        Assert.assertEquals (actuallyCommittedTerm, expectedCommittedTerm);
    }
    @Test
    public void totalEstimatedCost(){
        String expectedTotalEstimatedCost = "Total Estimated Cost: USD 1,082.77 per 1 month";
        String actuallyTotalEstimatedCost = new ResultEstimatedPage (driver).actuallyTotalEstimatedCost ();
        Assert.assertEquals (actuallyTotalEstimatedCost, expectedTotalEstimatedCost);
    }
    @AfterSuite
    public void afterTest(){
        driver.quit ();
        driver = null;
    }
}
