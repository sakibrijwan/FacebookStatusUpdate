package testcases;



import org.testng.annotations.*;
import pages.facebookLogin;
import testdata.getExcelData;
import static testcases.Config.driver;

/**
 * Created by Sakib on 7/6/2017.
 */
public class testFacebookLoginPage {

    //Declaration of facebookLogin and getExcelData objects.
    facebookLogin objLogin;
    getExcelData getExlObj;

    //Test will be initiated from here by TestNG framework. This method will open facebook login page and sign in to facebook using
    //the specified email address and password in credential.xls
    @Test(dataProvider="empLogin")
    public void test_Login(){
        //Navogate to facebook login page
        driver.get("https://www.google.com/webmasters/tools/url-removal?hl=en&authuser=2&siteUrl=https://vicinal.ca/");
        //Create Login Page object
        objLogin = new facebookLogin(driver);

        //login to facebook
         objLogin.loginToFacebook();
    }

    //Test will be initiated from here by TestNG framework. This method will read the credential.xls file and extrace email, password
    // and pass it to "test_Login" through @Dataprovider
    @DataProvider(name="empLogin")
    public Object[][] loginData() {
        getExlObj= new getExcelData();
        Object[][] arrayObject = getExlObj.getExcelData("credential.xls","Sheet1");
        return arrayObject;
    }

}
