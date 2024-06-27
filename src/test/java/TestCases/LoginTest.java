package TestCases;

import Pages.BaseTest;
import Pages.LoginPage;
import Utility.ReadExcelFile;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
        @Test
        void verifyLogin(String UserEmail,String pwd){
            LoginPage lp = new LoginPage(driver);
            String userName = "Demo12";
            String password = "Test123456$";
            lp.loginPortal(userName,password);
        }

    }
