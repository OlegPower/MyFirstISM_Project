package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DioConfigurationAcceptPage extends BasePage {

    @FindBy(css = ".th-path-1-88")
    protected WebElement dioConfigurationRow;

    @FindBy(css = ".btn-accept")
    protected WebElement acceptButton;

    @FindBy(css = "bottom-buttons.white .btn-accept")
    protected WebElement acceptConfirmationButton;

    public DioConfigurationAcceptPage() {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
