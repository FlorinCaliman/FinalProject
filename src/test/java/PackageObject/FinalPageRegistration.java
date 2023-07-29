package PackageObject;

import org.example.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPageRegistration {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement succesButton;


    public FinalPageRegistration(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void returnHomeButton(){
        succesButton.click();
    }


}
