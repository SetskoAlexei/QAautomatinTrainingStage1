package WebDriver.BringItOn.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {
    WebDriver driver;


    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }


    public String ResultNameTitle(){
        WebElement resultNameTitle = driver.findElement (By.xpath ("//div[@class='paste_box_line1']"));
        return resultNameTitle.getText ();
    }
    public String ResultCode(){
        WebElement resultCode = driver.findElement (By.xpath ("//textarea[@id='paste_code']"));
        return resultCode.getText ();
    }
    public String ResultSyntaxBashColor(){
        WebElement syntaxBashColorPurple = driver.findElement (By.xpath ("//span[@class='kw2']"));
        WebElement syntaxBashColorRed = driver.findElement (By.xpath ("//span[@class='st0']"));
        String stringBashColor =
                Color.fromString (syntaxBashColorPurple.getCssValue ("color")).asHex () + " " +
                        Color.fromString (syntaxBashColorRed.getCssValue ("color")).asHex ();
        return stringBashColor;
    }
}
