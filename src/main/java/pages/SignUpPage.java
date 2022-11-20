package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends PageBase{
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "uniform-id_gender1")
    WebElement MrOption;

    @FindBy(id = "password")
    WebElement PasswordTxtBox;

    @FindBy(id = "days")
    WebElement Days;

    @FindBy(id = "months")
    WebElement Months;

    @FindBy(id = "years")
    WebElement Years;

    @FindBy(id = "first_name")
    WebElement FNameTxtBox;

    @FindBy(id = "last_name")
    WebElement LNameTxtBox;

    @FindBy(id = "company")
    WebElement CompanyName;

    @FindBy(id = "address1")
    WebElement AddressTxt;

    @FindBy(id = "country")
    WebElement CountryName;

    @FindBy(id = "state")
    WebElement State;

    @FindBy(id = "city")
    WebElement City;

    @FindBy(id = "zipcode")
    WebElement ZipCode;

    @FindBy(id = "mobile_number")
    WebElement MobileNumber;

    @FindBy(xpath = "//button[@data-qa='create-account' and @type='submit']")
    WebElement SubmitBtn;

    String PasswordText = PageBase.generateRandomCapitalTxt(3) + PageBase.generateRandomSmallTxt(3)
            + PageBase.generateRandomSpecialCharacters(3);

    public void addUser(){
        clickBtn(MrOption);
        setText(PasswordTxtBox, PasswordText);
        Select selectDay = new Select(Days);
        selectDay.selectByValue("13");
        Select selectMonth = new Select(Months);
        selectMonth.selectByValue("11");
        Select selectYear = new Select(Years);
        selectYear.selectByValue("2000");

        setText(FNameTxtBox, "Mostafa");
        setText(LNameTxtBox, "Yaseen");
        setText(CompanyName, "Company");
        setText(AddressTxt, "Street");
        Select selectCountry = new Select(CountryName);
        selectCountry.selectByValue("United States");
        setText(State, "Newyork");
        setText(City, "Newyork");
        setText(ZipCode, "12345");
        setText(MobileNumber, "01020304050");
        //Actions actions = new Actions(driver);
        //actions.moveToElement(SubmitBtn).click().perform();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView()", SubmitBtn);
        clickBtn(SubmitBtn);
    }
}
