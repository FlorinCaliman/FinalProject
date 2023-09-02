package PackageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement inputEmailField;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement SubmitBotton;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement StartEnrollmentButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement VirtualHeader;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement ReadMoreVirtualCaseButton;


    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement ReadMoreHybridCaseButton;


    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement ReadMoreInPersonCaseButton;


    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement FundamentalHeader;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement ReadMoreOnTheFundamentalButton;


    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/h2")
    private WebElement SeleniumHeader;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement ReadMoreOnTheLearnSelenium;

    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement FrequentlyAskedQuestionsHeader;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[2]/h3/button")
    private WebElement ExpandAskedQuestions;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[3]")
    private WebElement LinkedInButton;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/h3")
    private WebElement OurInstructorHeader;

    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement ReturnButton;

    @FindBy(xpath = "/html/body/footer/div/p")
    private WebElement DownPageHeader;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement WhatYouLearnButton;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[3]/div/div/a[4]")
    private WebElement InstagramIcon;
    @FindBy(xpath = "//*[@id=\"map\"]/div[3]/div[4]/div/button")
    private WebElement clickIOnTheMap;
    @FindBy(xpath = "//*[@id=\"map\"]/div[3]/div[4]/div/div/a[2]")
    private WebElement OpenStreetMap;
    @FindBy(xpath = "/html/body/section[8]/div/div/div[1]/ul/li[5]/span")
    private WebElement contactInfoHeader;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void imputValueInEmailField(String string) {
        inputEmailField.sendKeys(string);

    }

    public void clickOnSubmitButton() {
        SubmitBotton.click();
    }

    public void clickStartEnrollmentButton() {
        StartEnrollmentButton.click();
    }

    public void clickReadMoreVirtualCaseButton() {
        ReadMoreVirtualCaseButton.click();
    }

    public void clickReadMoreHybridCaseButton() {
        ReadMoreHybridCaseButton.click();
    }

    public void clickReadMoreInPersonCaseButton() {
        ReadMoreInPersonCaseButton.click();
    }

    public void clickReadMoreOnTheFundamentalButton() {
        ReadMoreOnTheFundamentalButton.click();
    }

    public void clickReadMoreOnTheLearnSelenium() {
        ReadMoreOnTheLearnSelenium.click();
    }

    public WebElement getVirtualHeader() {
        return VirtualHeader;
    }

    public WebElement getFundamentalHeader() {
        return FundamentalHeader;
    }

    public WebElement getSeleniumHeader() {
        return SeleniumHeader;
    }

    public void clickWhereIsYourInstitutionLocated() {
        ExpandAskedQuestions.click();
    }

    public WebElement getFrequentlyAskedQuestionsHeader() {
        return FrequentlyAskedQuestionsHeader;
    }

    public void clickOnLinkedInButton() {
        LinkedInButton.click();
    }

    public WebElement getOurInstructorHeader() {
        return OurInstructorHeader;
    }

    public void clickReturnButton() {
        ReturnButton.click();
    }

    public WebElement getDownPageHeader() {
        return DownPageHeader;
    }

    public void getClickTheInstagramIcon() {
        InstagramIcon.click();
    }

    public void WhatYouLearn() {
        WhatYouLearnButton.click();
    }
    public void setClickIOnTheMap(){
        clickIOnTheMap.click();
    }
    public WebElement getDownPageContactInfo(){
        return contactInfoHeader;
    }
    public void OpenStreetMap(){
        OpenStreetMap.click();
    }

}

