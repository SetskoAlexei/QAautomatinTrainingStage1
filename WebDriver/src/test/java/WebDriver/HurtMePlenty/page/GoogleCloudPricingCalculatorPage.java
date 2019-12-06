package WebDriver.HurtMePlenty.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleCloudPricingCalculatorPage extends AbstractPage {

    public GoogleCloudPricingCalculatorPage(WebDriver driver) {
        super (driver);
    }

    @FindBy(xpath = "//div[@title='Compute Engine']")
    WebElement selectComputeEngine;

    @FindBy(xpath = "//input[@id='input_53']")
    WebElement numberOfInstances;

    @FindBy(id = "select_value_label_46")
    WebElement  operatingSystemSoftwareList;

    @FindBy(xpath = "//md-option[@value='free']")
    WebElement selectOperationSystemSoftware;

    @FindBy (id = "select_value_label_47")
    WebElement machineClass;

    @FindBy(id = "select_option_67")
    WebElement selectMachineClassRegular;

    @FindBy(id = "select_value_label_49")
    WebElement machineType;

    @FindBy(xpath = "//*[@id='select_option_217']/div")
    WebElement machineTypeSelectedN1standard8vCPUs8RAM30GB;

    @FindBy(xpath = "//div[@class='md-container md-ink-ripple']")
    WebElement checkBoxAddGPUs;

    @FindBy(id = "select_value_label_346")
    WebElement numberOfGPUs;

    @FindBy(id = "select_option_353")
    WebElement selectNumberOfGPUsBy1;

    @FindBy(id = "select_value_label_347")
    WebElement CPU_Type;

    @FindBy(xpath = "//*[@value='NVIDIA_TESLA_V100']")
    WebElement selectCPU_TypeByV100;

    @FindBy(id = "select_78")
    WebElement localSSD;

    @FindBy(id = "select_option_171")
    WebElement selectLocalSSD2x375;

    @FindBy(id = "select_80")
    WebElement dataCenterLocation;

    @FindBy(id = "select_option_185")
    WebElement selectDataCenterLocation;

    @FindBy(id = "select_85")
    WebElement committedUsage;

    @FindBy(id = "select_option_83")
    WebElement selectCommittedUsageBy1yer;

    @FindBy(xpath = "//button[@aria-label='Add to Estimate']")
    WebElement addToEstimate;

    public GoogleCloudPricingCalculatorPage setupCalculator(String numberOfInstancesInput)  {
        new WebDriverWait (driver, 15)
                .until (ExpectedConditions.presenceOfElementLocated (By.id ("top_of_page")));
        driver.switchTo ().frame ("myFrame");
        selectComputeEngine.click ();
        numberOfInstances.sendKeys (numberOfInstancesInput);
        operatingSystemSoftwareList.click ();
        new  WebDriverWait(driver, 10)
                .until (ExpectedConditions.visibilityOf (selectOperationSystemSoftware));
        selectOperationSystemSoftware.click ();
        new WebDriverWait (driver, 10)
                .until (ExpectedConditions.invisibilityOf (selectOperationSystemSoftware));
        machineClass.click ();
        new  WebDriverWait(driver, 10)
                .until (ExpectedConditions.visibilityOf (selectMachineClassRegular));
        selectMachineClassRegular.click ();
        new WebDriverWait (driver, 10)
                .until (ExpectedConditions.invisibilityOf (selectMachineClassRegular));
        machineType.click ();
        new  WebDriverWait(driver, 10)
                .until (ExpectedConditions.visibilityOf (machineTypeSelectedN1standard8vCPUs8RAM30GB));
        machineTypeSelectedN1standard8vCPUs8RAM30GB.click ();
        new WebDriverWait (driver, 10)
                .until (ExpectedConditions.visibilityOf (checkBoxAddGPUs));
        checkBoxAddGPUs.click ();
        new  WebDriverWait(driver, 10)
                .until (ExpectedConditions.visibilityOf (numberOfGPUs));
        numberOfGPUs.click ();
        new  WebDriverWait(driver, 10)
                .until (ExpectedConditions.visibilityOf (selectNumberOfGPUsBy1));
        selectNumberOfGPUsBy1.click ();
        new WebDriverWait (driver, 10)
                .until (ExpectedConditions.invisibilityOf (selectNumberOfGPUsBy1));
        CPU_Type.click ();
        new  WebDriverWait(driver, 10)
                .until (ExpectedConditions.visibilityOf (selectCPU_TypeByV100));
        selectCPU_TypeByV100.click ();
        new WebDriverWait (driver, 10)
                .until (ExpectedConditions.invisibilityOf (selectCPU_TypeByV100));
        localSSD.click ();
        new  WebDriverWait(driver, 10)
                .until (ExpectedConditions.visibilityOf (selectLocalSSD2x375));
        selectLocalSSD2x375.click ();
        new WebDriverWait (driver, 10)
                .until (ExpectedConditions.invisibilityOf (selectLocalSSD2x375));
        dataCenterLocation.click ();
        new  WebDriverWait(driver, 10)
                .until (ExpectedConditions.visibilityOf (selectDataCenterLocation));
        selectDataCenterLocation.click ();
        committedUsage.click ();
        new  WebDriverWait(driver, 10)
                .until (ExpectedConditions.visibilityOf (selectCommittedUsageBy1yer));
        selectCommittedUsageBy1yer.click ();
        addToEstimate.click ();
        return this;
    }
}
