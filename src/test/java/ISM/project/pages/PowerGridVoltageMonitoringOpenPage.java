package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PowerGridVoltageMonitoringOpenPage extends IdAngularIFrame{

	@FindBy(css="#LimValUL2Percent")
	protected WebElement firstCellOfPercentageRow;
}
