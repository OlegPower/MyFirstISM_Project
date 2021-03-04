package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PowerGridPowerFlowMonitoringChangeValuePage extends IdAngularIFrame{

	@FindBy(css="#NegativerWirkleistungsflussueberwachung")
	protected WebElement powerFlowMonitoringButton;

	@FindBy(css="#NegPowerFlowReaction")
	protected WebElement reversalOfPowerFlowRow;

	@FindBy(css=".th-dynamic-dropdown")
	protected WebElement reversalOfPowerFlowDropdown;

}
