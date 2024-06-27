package TestCases;

import Pages.BaseTest;
import Pages.DashBoardPage;
import Pages.LoginPage;
import Pages.PaymentPage;
import Utility.ReadExcelFile;
import org.testng.annotations.Test;

public class PaymentTestCase extends BaseTest {
    String fileName=System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";

    @Test(priority =1)
    void testcourses()
    {
        LoginPage lp=new LoginPage(driver);
        String username= ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
        String password= ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
        lp.loginPortal(username, password);

        DashBoardPage dp = new DashBoardPage(driver);

        dp.dashboardClick();

        PaymentPage pg= new PaymentPage(driver);
        String crdnum=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 0);
        String expdate=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 1);
        String cvcnum=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 2);



        pg.paymentOption(crdnum, expdate, cvcnum);

    }

}
