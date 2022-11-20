package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.*;

public class RegistrationTest extends TestBase{

    LandingPage LandingPageObject;
    LoginRegistrationPage LoginRegistrationPageObject;
    SignUpPage SignUpPageObject;
    AccountCreatedPage AccountCreatedPageObject;
    HomePage HomePageObject;

    @Test
    public void registerNewUser() throws InterruptedException {
        LandingPageObject = new LandingPage(driver);
        LandingPageObject.openRegistrationPage();

        wait.until(ExpectedConditions.titleIs("Automation Exercise - Signup / Login"));
        LoginRegistrationPageObject = new LoginRegistrationPage(driver);
        LoginRegistrationPageObject.navigateToRegistrationForm();

        wait.until(ExpectedConditions.titleIs("Automation Exercise - Signup"));
        SignUpPageObject = new SignUpPage(driver);
        SignUpPageObject.addUser();

        wait.until(ExpectedConditions.titleIs("Automation Exercise - Account Created"));
        AccountCreatedPageObject = new AccountCreatedPage(driver);
        AccountCreatedPageObject.navigateToHome();

        HomePageObject = new HomePage(driver);
        HomePageObject.logOut();
    }
}
