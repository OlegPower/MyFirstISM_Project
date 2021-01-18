package ISM.project.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsAcceptPage extends BasePage {
    @FindBy(css = ".th-path-0-2")
    protected WebElement sortTableByCategory;

    @FindBy(css = ".th-path-1-49-1")
    protected WebElement configurationButtonForErrorCategory;

    @FindBy(css = ".dpdwn-bgrnd")
    protected WebElement expandDropdown;

    @FindBy(css = ".th-path-3-1")
    protected WebElement selectWarningValue;

    @FindBy(css = "#buttonRight")
    protected WebElement acceptConfiguration;

    @FindBy(css = ".th-path-1-16-1")
    protected WebElement configurationButtonForWarningCategory;

    @FindBy(css = ".th-path-3-0")
    protected WebElement selectErrorValue;

    public EventsAcceptPage() {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
