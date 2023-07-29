package PackageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentInformation {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement cardHolderNameFields;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement cardNumberFields;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement cvcFields;

    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement clickDropMonth;

    @FindBy(xpath = "//*[@id=\"month\"]/option[6]")
    private WebElement selectMay;

    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement clickDropYear;
    @FindBy(xpath = "//*[@id=\"year\"]/option[6]")
    private WebElement selectYear;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement clickNextButton;


    public PaymentInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void inputHolderName(String string) {
        cardHolderNameFields.sendKeys(string);
    }

    public void inputCardNumber(String string) {
        cardNumberFields.sendKeys(string);
    }

    public void inputCVC(String string) {
        cvcFields.sendKeys(string);
    }

    public void setClickDropMonth() {
        clickDropMonth.click();
    }

    public void setSelectMay() {
        selectMay.click();
    }

    public void setClickDropYear() {
        clickDropYear.click();
    }

    public void setSelectYear() {
        selectYear.click();
    }

    public void setClickFinalNextButton() {
        clickNextButton.click();
    }

    public void selectMonthByXpath(WebDriver driver, String month) {
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"month\"]"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(month);
    }

    public void selectYearByXpath(WebDriver driver, String year) {
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"year\"]"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(year);
    }

    public void FillInPaymentInformationWithValidData(WebDriver driver) {
        inputHolderName("florinel");
        inputCardNumber("225544");
        inputCVC("321");
        setClickDropMonth();
        setSelectMay();
        setClickDropYear();
        setSelectYear();
        selectMonthByXpath(driver, "June");
        selectYearByXpath(driver, "2023");
        setClickFinalNextButton();

    }

    public void PaymentInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
