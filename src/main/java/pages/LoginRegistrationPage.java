package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginRegistrationPage extends PageBase{
    public LoginRegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement NameLink;

    @FindBy(xpath = "//input[@placeholder='Email Address' and @data-qa='signup-email']")
    WebElement EmailLink;

    @FindBy(xpath = "//button[@type='submit' and @data-qa='signup-button']")
    WebElement SubmitBtn;

    String NameTxt = PageBase.generateRandomCapitalTxt(1) + PageBase.generateRandomSmallTxt(7);
    String EmailAddress = PageBase.generateRandomCapitalTxt(3) + PageBase.generateRandomSmallTxt(5) + "@gmail.com";

    public void navigateToRegistrationForm() throws InterruptedException {
        setText(NameLink,NameTxt);
        setText(EmailLink, EmailAddress);
        clickBtn(SubmitBtn);
    }
}
