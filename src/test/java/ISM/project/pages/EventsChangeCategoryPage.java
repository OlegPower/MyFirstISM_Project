package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventsChangeCategoryPage extends IdAngularIFrame{

    @FindBy(css = ".dpdwn-bgrnd")
    protected WebElement expandDropdown;

    @FindBy(css = ".th-path-3-1")
    protected WebElement selectWarningValue;

    @FindBy(css = "#buttonRight")
    protected WebElement acceptConfiguration;

    @FindBy(css = ".th-path-3-0")
    protected WebElement selectErrorValue;
}
