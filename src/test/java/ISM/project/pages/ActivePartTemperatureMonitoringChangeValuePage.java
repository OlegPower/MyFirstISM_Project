package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivePartTemperatureMonitoringChangeValuePage extends IdAngularIFrame{

	@FindBy(css="#TemperatureMonitoring")
	protected WebElement temperatureMonitoringButton;

	@FindBy(css="#LimValTopOilL2Absolut")
	protected WebElement topOilCellPage;

	@FindBy(css="#buttonRight")
	protected WebElement acceptButton;
}
