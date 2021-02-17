package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SystemLinkOutputsChangeValuePage extends IdAngularIFrame{
	@FindBy(css=".dropdown")
	protected WebElement expandDropdown;

	@FindBy(css=".th-path-0-1.th-path-0-2 > span")
	protected WebElement limitValueU1;

	@FindBy(css="#buttonRight")
	protected WebElement acceptButton;
}
