package PackageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformation {

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement inputEmailField;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement inputPhoneField;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement inputCountryField;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement inputCityField;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement inputPostCodeField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement clickNextButton;

    public ContactInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void inputValueEmailField(String string) {
        inputEmailField.sendKeys(string);
    }

    public void inputValuePhoneField(String string) {
        inputPhoneField.sendKeys(string);
    }

    public void inputValueCountryField(String string) {
        inputCountryField.sendKeys(string);
    }

    public void inputValueCityField(String string) {
        inputCityField.sendKeys(string);
    }

    public void inputValuePostCodeField(String string) {
        inputPostCodeField.sendKeys(string);

    }
    public void setClickNextButton(){
        clickNextButton.click();
    }

    public void FillInContactInformationWithValidData (){
        inputValueEmailField("cucu@yahoo.com");
        inputValuePhoneField("01545545651");
        inputValueCountryField("Tunisia");
        inputValueCityField("Ghonia");
        inputValuePostCodeField("566421");
        setClickNextButton();
    }
    //public void setClickPrevButton(){
      //  clickPrevButton.click();
    }
//}
