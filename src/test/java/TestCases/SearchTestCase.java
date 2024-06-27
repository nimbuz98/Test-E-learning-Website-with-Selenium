package TestCases;

import Pages.BaseTest;
import Pages.LoginPage;
import Pages.SearchPage;
import Utility.ReadExcelFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SearchTestCase extends BaseTest {

    String fileName = System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";


    @Test(priority = 1)

    void SearchCourseTest(){
        System.out.println("File Path: " + fileName);

        LoginPage lp = new LoginPage(driver);
        String userName = ReadExcelFile.getCellValue(fileName,"LoginData",1,0);
        String password = ReadExcelFile.getCellValue(fileName,"LoginData",1,1);
        System.out.println("Username from Excel: " + userName);
        System.out.println("Password from Excel: " + password);
        lp.loginPortal(userName,password);

        SearchPage sp = new SearchPage(driver);
        String SearchCourse = ReadExcelFile.getCellValue(fileName,"SearchCourse",0,0);
        sp.SearchCourse(SearchCourse);

    }
}
