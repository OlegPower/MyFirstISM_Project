package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PowerGridPowerFlowMonitoringChangeValuePage extends IdAngularIFrame{

	@FindBy(css="#NegativerWirkleistungsflussueberwachung > span")
	protected WebElement powerFlowMonitoringButton;

	@FindBy(css="#NegPowerFlowReaction")
	protected WebElement reversalOfPowerFlowRow;

	@FindBy(css=".th-dynamic-dropdown")
	protected WebElement reversalOfPowerFlowDropdown;

	@FindBy(css=".th-path-0-1")
	protected WebElement targetTapPositionValue;

	@FindBy(css=".th-path-0-0")
	protected WebElement offValue;

	@FindBy(css="#buttonRight")
	protected WebElement acceptButton;

}
