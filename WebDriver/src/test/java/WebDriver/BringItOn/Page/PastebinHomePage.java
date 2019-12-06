package WebDriver.BringItOn.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PastebinHomePage {

    private static final String HomePageURL = "http://pastebin.com";
    private WebDriver driver;

@FindBy(xpath = "//textarea[@id='paste_code']")
    private WebElement newPaste;

@FindBy(xpath = "(//span[@class='select2-selection__arrow'])[2]")
private WebElement pasteExpiration;

@FindBy(xpath = "(//span[@class='select2-selection__arrow'])")
private WebElement syntaxHighlighting;

@FindBy(xpath = "//li[text()='Bash']")
private WebElement chooseSyntaxHighlighting;


@FindBy(xpath = "//input[@name='paste_name']")
private WebElement pasteNameTitle;

@FindBy(xpath = "//li[text()='10 Minutes']")
private WebElement choosePasteExpiration;

@FindBy(xpath = "//input[@id='submit']")
private WebElement buttonCreateNewPaste;

public PastebinHomePage (WebDriver driver){
    this.driver = driver;
    PageFactory.initElements (driver, this);
}
public PastebinHomePage openPage(){
    driver.get (HomePageURL);
    new WebDriverWait (driver, 10).until (ExpectedConditions.presenceOfElementLocated (By.xpath ("//input[@name='paste_name']")));
    return this;
}
public PastebinHomePage ContentFilling(String inputCode, String inputNameTitleText) {
    newPaste.sendKeys (inputCode);
    syntaxHighlighting.click ();
    chooseSyntaxHighlighting.click ();
    pasteExpiration.click ();
    choosePasteExpiration.click ();
    pasteNameTitle.sendKeys (inputNameTitleText);
    buttonCreateNewPaste.click ();
    return this;
    }
}
