package TestCases;

import Pages.BaseTest;
import Pages.LoginPage;
import Utility.ReadExcelFile;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTestDrivenData extends BaseTest {
    String filename = System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";
    @Test(priority =1,dataProvider="LoginDataProvider")
    void verifyLogin(String UserEmail,String pwd) throws IOException {
        LoginPage lp = new LoginPage(driver);
        //String userName = "Demo12";
        //String password = "Test123456$";
        lp.loginPortal(UserEmail,pwd);

        if(UserEmail.equals("Demo12") && pwd.equals("Test123456$"))
        {
            System.out.println("Test Passed");
            Assert.assertTrue(true);
            lp.logout();
        }
        else
        {
            captureScreenShot(driver,"VerifyLogin");
            Assert.assertTrue(false);
        }
    }
    @DataProvider(name="LoginDataProvider")
    public String[][] LoginDataProvider() {


        int ttlRows = ReadExcelFile.getRowCount(filename, "LoginData");
        int ttlColumns = ReadExcelFile.getColCount(filename, "LoginData");

        String[][] data = new String[ttlRows - 1][ttlColumns];

        for (int i = 1; i < ttlRows; i++) {
            for (int j = 0; j < ttlColumns; j++) {
                data[i - 1][j] = ReadExcelFile.getCellValue(filename, "LoginData", i, j);
            }
        }
        return data;
    }
}
