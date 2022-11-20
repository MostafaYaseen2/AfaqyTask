package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AccountCreatedPage extends PageBase{
    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/' and @data-qa= 'continue-button']")
    WebElement ContinueBtn;

    public void navigateToHome(){
        String Txt = ContinueBtn.getText();
        Assert.assertEquals(Txt, "Continue");
        clickBtn(ContinueBtn);
    }
}
