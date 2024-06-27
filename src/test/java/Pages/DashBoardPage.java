package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class DashBoardPage {
    WebDriverWait wait;
    WebDriver driver;
    //Constructor
    public DashBoardPage(WebDriver ldriver){
        this.driver = ldriver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @FindBy(xpath = "//*[@id=\"login-list\"]/li[1]/a") WebElement dashboardClick;

    @FindBy(xpath = "//*[@id=\"learn-press-user-profile\"]/ul/li[3]") WebElement offeredAcademies;

    @FindBy(xpath = "//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button") WebElement subscribeButton;


    public void dashboardClick() {
        // Click on dashboard link
        dashboardClick.click();

        // Click on offered academies link
        offeredAcademies.click();
        subscribeButton.click();

    }

}