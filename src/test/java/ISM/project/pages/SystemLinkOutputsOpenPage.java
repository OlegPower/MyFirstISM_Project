package ISM.project.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemLinkOutputsOpenPage extends IdAngularIFrame{

	@FindBy(css="#IOMapping_GPO")
	protected WebElement linkOutputsButton;

	@FindBy(css="#GPO1")
	protected WebElement pageWithDropDown;
}
