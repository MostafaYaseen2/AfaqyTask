package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
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
        String TxtR = driver.findElement(By.xpath("//button[@type='submit' and @data-qa='signup-button']")).getText();
        Assert.assertEquals(TxtR, "Signup");
        LoginRegistrationPageObject = new LoginRegistrationPage(driver);
        LandingPageObject.openRegistrationPage();
        LoginRegistrationPageObject.navigateToRegistrationForm();

        wait.until(ExpectedConditions.titleIs("Automation Exercise - Signup"));
        String TxtA = driver.findElement(By.xpath("//button[@data-qa='create-account' and @type='submit']")).getText();
        Assert.assertEquals(TxtA, "Create Account");
        SignUpPageObject = new SignUpPage(driver);
        SignUpPageObject.addUser();

        wait.until(ExpectedConditions.titleIs("Automation Exercise - Account Created"));
        String TxtC = driver.findElement(By.xpath("//a[@href='/' and @data-qa= 'continue-button']")).getText();
        Assert.assertEquals(TxtC, "Continue");
        AccountCreatedPageObject = new AccountCreatedPage(driver);
        AccountCreatedPageObject.navigateToHome();

        HomePageObject = new HomePage(driver);
        HomePageObject.logOut();
        String TxtO = driver.findElement(By.xpath("//a[@href='/login']")).getText();
        Assert.assertEquals(TxtO, "Signup / Login");
    }
}
