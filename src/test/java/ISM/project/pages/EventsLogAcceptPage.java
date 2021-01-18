package ISM.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class EventsLogAcceptPage extends BasePage {
    @FindBy(css = "#buttonRight")
    protected WebElement openLogButton;

    @FindBy(css = "#buttonLeft")
    protected WebElement filterButton;

    @FindBy(css = "#AutoInputFields .th-path-0-0 ")
    protected WebElement yearValueFrom;

    @FindBy(css = "#AutoInputFields .th-path-0-1")
    protected WebElement monthValueFrom;

    @FindBy(css = "#AutoInputFields .th-path-0-2")
    protected WebElement dayValueFrom;

    @FindBy(css = ".th-path-12")
    protected WebElement warningEventsCheckbox;

    @FindBy(css = ".th-path-14")
    protected WebElement comingEventsCheckbox;


    @FindBy(css = ".th-path-17")
    protected WebElement searchButton;

    public EventsLogAcceptPage() {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
    
   
}
