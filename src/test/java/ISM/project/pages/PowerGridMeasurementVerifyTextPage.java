package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PowerGridMeasurementVerifyTextPage extends IdAngularIFrame {
    @FindBy(css = "#Messung")
    protected WebElement measurementButton;
}
