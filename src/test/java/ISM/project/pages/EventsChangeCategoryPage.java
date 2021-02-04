package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsChangeCategoryPage extends BasePage{

    @FindBy(css = ".dpdwn-bgrnd")
    protected WebElement expandDropdown;

    @FindBy(css = ".th-path-3-1")
    protected WebElement selectWarningValue;

    @FindBy(css = "#buttonRight")
    protected WebElement acceptConfiguration;

    @FindBy(css = ".th-path-3-0")
    protected WebElement selectErrorValue;

    public EventsChangeCategoryPage() {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
