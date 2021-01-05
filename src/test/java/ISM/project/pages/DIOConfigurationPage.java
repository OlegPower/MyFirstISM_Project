package ISM.project.pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DIOConfigurationPage {

    @FindBy(xpath = "//*[@style='clip-path: url(\"#id_2_id_ClpPath0\");']//*[text()='DIO configuration']")
    private WebElement configurationButton;

    public DIOConfigurationPage(WebDriver driver ) {
        driver.switchTo().defaultContent().switchTo().frame("content_myframe");
        PageFactory.initElements(driver, this);
        }

    public void openDIOConfigurationPage() {
        configurationButton.click();
    }
}


