package ISM.project.pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DioConfigurationOpenPage extends BasePage {

    @FindBy(xpath = "//*[text()='DIO configuration']")
    private WebElement configurationButton;

    public DioConfigurationOpenPage() {
        driver.switchTo().defaultContent().switchTo().frame("content_myframe");
        PageFactory.initElements(driver, this);
    }

    public void openDioConfigurationPage() {
        configurationButton.click();
    }
}


