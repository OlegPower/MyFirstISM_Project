package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventsSortPage extends IdAngularIFrame {
    @FindBy(css = ".th-path-0-2")
    protected WebElement sortTableByCategory;
}
