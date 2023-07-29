package PackageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformation {

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement inputFirstNameField;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement inputLastNameField;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement inputUserNameField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement inputPasswordField;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement inputConfirmPasswordField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement clickNextButton;


    public PersonalInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void inputValueFirstNameField(String string) {
        inputFirstNameField.sendKeys(string);
    }

    public void inputValueLastNameField(String string) {
        inputLastNameField.sendKeys(string);
    }

    public void inputValueUserNameField(String string) {
        inputUserNameField.sendKeys(string);
    }

    public void inputValuePasswordField(String string) {
        inputPasswordField.sendKeys(string);
    }

    public void inputValueConfirmPasswordField(String string) {
        inputConfirmPasswordField.sendKeys(string);

    }
    public void setClickNextButton(){
        clickNextButton.click();
    }

    public void FillInPersonalInformationWithValidData(){
        inputValueFirstNameField("Florin");
        inputValueLastNameField("cali");
        inputValueUserNameField("coco");
        inputValuePasswordField("123456");
        inputValueConfirmPasswordField("123456");
        setClickNextButton();

    }
}
