import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelloWebDriver {
    @Test
    public void commonSearchTermReResultIsNitEmpty() throws InterruptedException {

        WebDriver driver = new ChromeDriver ();
        driver.get ("https://selenium.dev/");
        WebElement searchInput = driver.findElement (By.id ("q"));
        searchInput.sendKeys ("abandoned");
        WebElement searchBtn = driver.findElement (By.xpath ("//*[@value='Go']"));
        searchBtn.click ();
        new WebDriverWait (driver, 10);

        Thread.sleep (200000);
        driver.quit ();

    }
}
