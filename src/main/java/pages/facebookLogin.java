package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sakib on 7/6/2017.
 */
public class facebookLogin {
    //Declaration of WebDriver
    WebDriver driver;
    //Find emil element on Login page by name and create a Webelement object
    @FindBy(name="identifier")
    WebElement email;
    //Find password element on Login page by name and create a Webelement object
    @FindBy(xpath="//input[@name='password']")
    WebElement password;
    //Find login button element on Login page by name and create a Webelement object
    @FindBy(css="span.RveJvd.snByac")
    WebElement nextButton;
    @FindBy(xpath="//*[@id=\'create-removal_button\']/div")
    WebElement removalButton;

    @FindBy(id="urlt")
    WebElement urlBox;

    @FindBy(name="urlt.submitButton")
    WebElement continueButton;

    @FindBy(id="submit-button")
    WebElement submitButton;

    //Constructor of this class to get the webdriver and initialize webelements
    public facebookLogin(WebDriver driver){

        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);

    }
    //Method to set email address to email address field
    public void setUserName(String strUserName){email.sendKeys(strUserName);
    }

    //Method to set password to password field
    public void setPassword(String strPassword){password.sendKeys(strPassword);
    }

    //Method to set password to password field
    public void urlBoxType(){urlBox.sendKeys("rr'");
    }

    //Method for clicking on login button
    public void clickLogin(){nextButton.click();

    }
    public void clickRemovalButton(){removalButton.click();
    }

    public void clickContinueButton(){continueButton.click();
    }

    public void clickSubmitButton(){submitButton.click();
    }
    //Method called from testFacebookLoginPage, this method is the testcase which will set email,password and
    //click on login button.
    public void loginToFacebook(){

        //Fill user name
        this.setUserName("opaxsolutions@gmail.com");
        this.clickLogin();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Fill password
        this.setPassword("36$rxt48");

        //Click Login button
        this.clickLogin();
        this.clickRemovalButton();
        this.urlBoxType();
        this.clickContinueButton();
        this.clickSubmitButton();
    }

}
