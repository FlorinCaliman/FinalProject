package PackageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseOption {

    @FindBy (xpath = "//*[@id=\"flexRadioButton1\"]")
    private WebElement clickSoftwareTesting;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement clickNextButton;


    public CourseOption (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void setClickSoftwareTesting(){
        clickSoftwareTesting.click();
    }
    public void setClickNextButton(){
        clickNextButton.click();
    }

    public void FillInCourseOptionWithValidData(){

        setClickSoftwareTesting();
        setClickNextButton();
    }



}
