package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PowerGridVoltageMonitoringOpenPage extends BasePage{
    @FindBy(css="#Spannungsgrenzwerte")
    protected WebElement voltageMonitoringButton;

	@FindBy(css="#LimValUL2Percent")
	protected WebElement firstCellOfPercentageRow;

    public PowerGridVoltageMonitoringOpenPage(){
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
