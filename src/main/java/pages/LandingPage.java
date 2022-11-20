package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends PageBase{
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/login']")
    WebElement LoginLink;

    public void openRegistrationPage(){
        clickBtn(LoginLink);
    }
}
