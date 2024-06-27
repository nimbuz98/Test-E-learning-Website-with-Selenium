package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;

    //Constructor

    public SearchPage(WebDriver ldriver){
        this.driver = ldriver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "search_course") WebElement SearchInput;

    @FindBy(xpath = "//*[@id=\"primary_menu\"]/nav[1]/form/button") WebElement SearchButton;

    public void SearchCourse( String CourseName){
        SearchInput.sendKeys(CourseName);
        SearchButton.click();


    }


}

