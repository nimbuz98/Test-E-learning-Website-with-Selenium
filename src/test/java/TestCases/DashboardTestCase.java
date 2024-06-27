package TestCases;

import Pages.BaseTest;
import Pages.DashBoardPage;
import Pages.LoginPage;
import Utility.ReadExcelFile;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class DashboardTestCase extends BaseTest {
    String fileName=System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";

    @Test(priority =1)
     void testCourses() {
        LoginPage lp=new LoginPage(driver);
        String username= ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
        String password= ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
        System.out.println(username+" "+password);
        lp.loginPortal(username,password);

        DashBoardPage dp =new DashBoardPage(driver);
        dp.dashboardClick();

}
}
