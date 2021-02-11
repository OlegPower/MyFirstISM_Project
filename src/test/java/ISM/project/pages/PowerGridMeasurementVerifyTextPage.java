package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PowerGridMeasurementVerifyTextPage extends BasePage {
    @FindBy(css = "#Messung")
    protected WebElement measurementButton;

    public PowerGridMeasurementVerifyTextPage() {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
