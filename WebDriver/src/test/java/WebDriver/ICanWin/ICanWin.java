package WebDriver.ICanWin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ICanWin {

    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver ();
        driver.get ("https://pastebin.com");
        driver.manage ().timeouts ().pageLoadTimeout (15, TimeUnit.SECONDS);
        WebElement newPaste = driver.findElement (By.xpath ("//textarea[@id='paste_code']"));
        newPaste.sendKeys ("Hello from WebDriver");
        WebElement pasteExpiration = driver.findElement (By.xpath
                ("(//span[@class='select2-selection__arrow'])[2]"));

        pasteExpiration.click ();
        WebElement choosePasteExpiration = driver.findElement (By.xpath ("//li[text()='10 Minutes']"));
        choosePasteExpiration.click ();
        WebElement pasteNameTitle = driver.findElement (By.xpath ("//input[@name='paste_name']"));
        pasteNameTitle.sendKeys ("helloweb");
      //  driver.quit ();
    }
}
