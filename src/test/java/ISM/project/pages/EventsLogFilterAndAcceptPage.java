package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventsLogFilterAndAcceptPage extends IdAngularIFrame {
    @FindBy(css = "#buttonRight")
    protected WebElement openLogButton;

    @FindBy(css = "#buttonLeft")
    protected WebElement filterButton;

    @FindBy(css = "#AutoInputFields .th-path-0-0")
    protected WebElement yearValueFrom;

    @FindBy(css = "#AutoInputFields .th-path-0-1")
    protected WebElement monthValueFrom;

    @FindBy(css = "#AutoInputFields .th-path-0-2")
    protected WebElement dayValueFrom;

    @FindBy(css = "#AutoInputFields .th-path-1-0")
    protected WebElement yearValueTo;

    @FindBy(css = "#AutoInputFields .th-path-1-1")
    protected WebElement monthValueTo;

    @FindBy(css = "#AutoInputFields .th-path-1-2")
    protected WebElement dayValueTo;

    @FindBy(css = ".th-path-12")
    protected WebElement warningEventsCheckbox;

    @FindBy(css = ".th-path-11")
    protected WebElement infoEventsCheckbox;

    @FindBy(css = ".th-path-14")
    protected WebElement comingEventsCheckbox;

    @FindBy(css = ".th-path-17")
    protected WebElement searchButton;
}
