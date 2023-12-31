package org.example;

import PackageObject.*;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitions {
    private WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    MainPage mainPage;
    FundamentalPage fundamentalPage;
    PersonalInformation personalInformation;
    ContactInformation contactInformation;
    CourseOption courseOption;
    PaymentInformation paymentInformation;
    FinalPageRegistration finalPageRegistration;


    public StepDefinitions() {
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        fundamentalPage = new FundamentalPage(driver);
        personalInformation = new PersonalInformation(driver);
        contactInformation = new ContactInformation(driver);
        courseOption = new CourseOption(driver);
        paymentInformation = new PaymentInformation(driver);
        finalPageRegistration = new FinalPageRegistration(driver);


    }


    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///C:/Users/calim/OneDrive/Desktop/Testing-Env-master/Testing-Env-master/index.html");

    }

    @Given("I am on the fundamental page")
    public void i_am_on_the_fundamental_page() {
        driver.get("file:///C:/Users/calim/OneDrive/Desktop/Testing-Env-master/Testing-Env-master/routes/fundamentals.html");


    }

    @Given("I click to the start enrollment")
    public void i_am_to_personal_information() {
        driver.get("file:///C:/Users/calim/OneDrive/Desktop/Testing-Env-master/Testing-Env-master/routes/enrollment.html");

    }

    @Given("I am on the contact information page")
    public void i_am_on_the_contact_information_page() {
        driver.get("file:///C:/Users/calim/OneDrive/Desktop/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.FillInPersonalInformationWithValidData();

    }

    @Given("I am on the course option page")
    public void i_am_on_the_course_option_page() {
        driver.get("file:///C:/Users/calim/OneDrive/Desktop/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.FillInPersonalInformationWithValidData();
        contactInformation.FillInContactInformationWithValidData();

    }

    @Given("I am on the Payment Information page")
    public void i_am_on_the_payment_information_page() {
        driver.get("file:///C:/Users/calim/OneDrive/Desktop/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.FillInPersonalInformationWithValidData();
        contactInformation.FillInContactInformationWithValidData();
        courseOption.FillInCourseOptionWithValidData();
    }

    @Given("I am on the final page registration")
    public void i_am_on_the_final_page_restration() {
        driver.get("file:///C:/Users/calim/OneDrive/Desktop/Testing-Env-master/Testing-Env-master/routes/enrollment.html");
        personalInformation.FillInPersonalInformationWithValidData();
        contactInformation.FillInContactInformationWithValidData();
        courseOption.FillInCourseOptionWithValidData();
        paymentInformation.FillInPaymentInformationWithValidData(driver);

    }

    @Given("I am on the main page our instructor")
    public void i_am_on_the_main_page_our_instructor() {
        driver.get("file:///C:/Users/calim/OneDrive/Desktop/Testing-Env-master/Testing-Env-master/index.html");
    }
    ////////// @WHEN //////////////////////////////////////////////////////////////////////////////////////////

    @When("the email value of {string} is input")
    public void input_email_to_field(String string) {
        mainPage.imputValueInEmailField(string);
    }

    @When("the submit button is clicked")
    public void click_submit_button() {
        mainPage.clickOnSubmitButton();
    }

    @When("I click the Start the enrollment button")
    public void click_Start_the_Enrollment_button() {
        mainPage.clickStartEnrollmentButton();
    }

    @When("I click the read more button on the virtual case")
    public void click_Read_more_Virtual_case_button() {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickReadMoreVirtualCaseButton();
    }

    @When("I click the read more button on the hybrid case")
    public void click_read_more_hybrid_case_button() {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickReadMoreHybridCaseButton();
    }

    @When("I click the read more button on the in person case")
    public void click_read_more_in_person_case_button() {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickReadMoreInPersonCaseButton();
    }

    @When("I click the read more button on the fundamental page")
    public void click_read_more_fundamental_page() {
        Utils.scrollToElement(driver, mainPage.getFundamentalHeader());
        mainPage.clickReadMoreOnTheFundamentalButton();
    }

    @When("I click the read more button on the learn selenium page")
    public void click_read_more_learn_selenium_page() {
        Utils.scrollToElement(driver, mainPage.getSeleniumHeader());
        mainPage.clickReadMoreOnTheLearnSelenium();
    }

    @When("I click on expand the button")
    public void expand_button() {
        Utils.scrollToElement(driver, mainPage.getFrequentlyAskedQuestionsHeader());
        mainPage.clickWhereIsYourInstitutionLocated();
    }

    @When("I click the LinkedIn button")
    public void click_the_LinkedIn_Button() {
        Utils.scrollToElement(driver, mainPage.getOurInstructorHeader());
        mainPage.clickOnLinkedInButton();
    }

    @When("I click the return button")
    public void click_return_button() {
        Utils.scrollToElement(driver, mainPage.getDownPageHeader());
        mainPage.clickReturnButton();
    }

    @When("I click to return button from fundamental page")
    public void click_return_button_from_fundamental_page() {
        fundamentalPage.clickReturnButton();
    }


    @When("I selected one option")
    public void select_One_Option() {
        courseOption.setClickSoftwareTesting();
    }

    @When("the Card Holder name is {string} fields")
    public void write_The_Card_Holder_Fields(String string) {
        paymentInformation.inputHolderName(string);
    }

    @When("I clicked the return homepage button")
    public void click_return_page_button() {
        finalPageRegistration.returnHomeButton();
    }

    @When("I clicked the what you'll learn button")
    public void what_you_learn_button() {
        mainPage.WhatYouLearn();
    }

    @When("I click the instagram icon")
    public void click_the_instagram_icon() {
        Utils.scrollToElement(driver, mainPage.getOurInstructorHeader());
        mainPage.getClickTheInstagramIcon();
    }


    ///////////////@AND//////////////////////////////////////////////////////////////////////////////////////
    @And("we push the next button")
    public void click_next_button() {
        personalInformation.setClickNextButton();
    }
    @And("we go to the next page")
    public void click_next2_button() {
        contactInformation.setClickNextButton();
    }
    @And("I clicked the next button")
    public void click_next3_button() {
        courseOption.setClickNext3Button();
    }
    @And("I click to the next button")
    public void click_next4_button(){
        paymentInformation.setClickFinalNextButton();
    }


    @And("the first name value of {string} is inputted")
    public void input_first_value(String string) {
        personalInformation.inputValueFirstNameField(string);
    }

    @And("the last name value of {string} is inputted")
    public void input_last_value(String string) {
        personalInformation.inputValueLastNameField(string);
    }

    @And("the username value of {string} is inputted")
    public void input_username_value(String string) {
        personalInformation.inputValueUserNameField(string);
    }

    @And("the password value of {string} is inputted")
    public void input_password_value(String string) {
        personalInformation.inputValuePasswordField(string);
    }

    @And("the confirm password value of {string} is inputted")
    public void input_confirm_password_value(String string) {
        personalInformation.inputValueConfirmPasswordField(string);
    }


    @And("the email value of {string} is inputted")
    public void input_email_value(String string) {
        contactInformation.inputValueEmailField(string);
    }

    @And("the phone value of {string} is inputted")
    public void input_phone_value(String string) {
        contactInformation.inputValuePhoneField(string);
    }

    @And("the country value of {string} is inputted")
    public void input_country_value(String string) {
        contactInformation.inputValueCountryField(string);
    }

    @And("the city value of {string} is inputted")
    public void input_city_value(String string) {
        contactInformation.inputValueCityField(string);
    }

    @And("the post code value of {string} is inputted")
    public void input_post_code_value(String string) {
        contactInformation.inputValuePostCodeField(string);
    }

    @And("the card number value of {string} is inputted")
    public void input_card_number_value(String string) {
        paymentInformation.inputCardNumber(string);
    }

    @And("the cvc value of {string} is inputted")
    public void input_cvc_value(String string) {
        paymentInformation.inputCVC(string);
    }

    @And("I clicked to drop the select month")
    public void drop_the_month() {
        paymentInformation.setClickDropMonth();
    }

    @And("I selected the May")
    public void select_may() {
        paymentInformation.setSelectMay();
    }

    @And("I clicked to drop the select year")
    public void drop_the_year() {
        paymentInformation.setClickDropYear();
    }

    @And("I selected the 2025")
    public void select_year() {
        paymentInformation.setSelectYear();
    }

    @And("the expire month value {string} card is selected")
    public void select_expire_month_card(String month) {
        paymentInformation.selectMonthByXpath(driver, month);
    }

    @And("the expire year value {string} card is selected")
    public void select_expire_year_card(String year) {
        paymentInformation.selectYearByXpath(driver, year);

    }



////////////////////////@THEN/////////////////////////////////////

    @Then("the newsletter confirmation pop-up appears")
    public void theNewsletterConfirmationPopUpAppears() {
        driver.switchTo().alert().accept();
    }

    @Then("the newsletter confirmation pop-up is not appears")
    public void theNewsletterConfirmationPopUpIsNotAppears() {
        Assertions.assertTrue(driver.getPageSource().contains("error"));
    }

    @Then("we go to the final registration page")
    public void go_to_the_final_page() {
        Assertions.assertEquals("Software Testing | Enrollment",driver.getTitle());

    }

    @Then("the {string} page opens")
    public void thePageOpens(String string) {
        Assertions.assertEquals(string, driver.getTitle());
    }

    @Then("the {string} page is open")
    public void thePersonalInformationPageIsOpen(String string) {
        Assertions.assertEquals(string, driver.getTitle());
    }

    @Then("the {string} page is not open")
    public void thePageIsNotOpen(String string) {
        Assertions.assertEquals("Learn Selenium", driver.getTitle());
    }
    @Then("the {string} page is opened")
    public void theLinkedInPageOpen(String string){
        Assertions.assertEquals("LinkedIn: Log In or Sign Up ",driver.getTitle());
    }

    public WebDriver getDriver() {
       return driver;
    }


    @Then("the question is expand")
    public void theQuestionIsExpand() {
        Assertions.assertTrue(driver.getPageSource().contains("show"));
    }

    @Then("It's return to main page")
    public void itSReturnToMainPage() {
        Assertions.assertEquals("Software Testing Course",driver.getTitle());
    }


    @Then("the mainpage is open")
    public void theMainpageIsOpen() {
        Assertions.assertEquals("Software Testing Course",driver.getTitle());
    }

    @Then("the mainpage is scrolling down to the Learn The Fundamental")
    public void theMainpageIsScrollingDownToTheLearnTheFundamental() {
        Assertions.assertEquals("Software Testing Course",driver.getTitle());
    }

    @Then("the Instagram page is open")
    public void theInstagramPageIsOpen() {
        Assertions.assertEquals("Instagram",driver.getTitle());
    }

    @Then("the contact information is appear")
    public void theContactInformationIsApear() {
        Assertions.assertEquals("Software Testing | Enrollment",driver.getTitle());
    }

    @Then("the course option is appear")
    public void theCourseOptionIsApear() {
        Assertions.assertEquals("Software Testing | Enrollment",driver.getTitle());
    }

    @Then("the payment information page is appear")
    public void thePaymentInformationPageIsApear() {
        Assertions.assertEquals("Software Testing | Enrollment",driver.getTitle());
    }

    @After
    public void cleanUp(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/jpg", "");
        }
        driver.quit();
    }
}
