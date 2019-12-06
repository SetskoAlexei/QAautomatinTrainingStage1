package WebDriver.BringItOn.Test;

import WebDriver.BringItOn.Page.PastebinHomePage;
import WebDriver.BringItOn.Page.ResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PastebinTest {
    WebDriver driver;


    @BeforeSuite (alwaysRun = true)
public void browserSetup(){
        driver = new  ChromeDriver();
        driver.manage ().window ().maximize ();
        String inputCode = "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        String inputNameTitleText = "how to gain dominance among developers";
        PastebinHomePage homePage = new PastebinHomePage (driver);
        homePage.openPage ();
        homePage.ContentFilling (inputCode, inputNameTitleText);
    }

    @Test
    public void nameTitleEqualsInputNameTitle(){
        String expectedResult = "how to gain dominance among developers";
        String actuallyResult = new ResultPage (driver).ResultNameTitle ();
        Assert.assertEquals (expectedResult, actuallyResult);
    }

    @Test
    public void CodeEqualsInputCode(){
        String expectedCode = "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        String actuallyResultCode = new ResultPage (driver).ResultCode ();
        Assert.assertEquals (expectedCode, actuallyResultCode);
    }

    @Test
    public void SyntaxBashColor(){
        String expectedStringsBashColor = "#c20cb9 #ff0000";
        String actuallyStringsBashColor = new ResultPage (driver).ResultSyntaxBashColor ();
        Assert.assertEquals (expectedStringsBashColor, actuallyStringsBashColor);
    }

    @AfterSuite(alwaysRun = true)
    public void AfterTest(){
        driver.quit ();
        driver = null;
    }
}
