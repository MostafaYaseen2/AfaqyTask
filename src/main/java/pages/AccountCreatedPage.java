package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends PageBase{
    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/' and @data-qa= 'continue-button']")
    WebElement ContinueBtn;

    public void navigateToHome(){
        clickBtn(ContinueBtn);
    }
}
