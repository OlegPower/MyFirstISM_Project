package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ControlParametersPage extends IdAngularIFrame{
	@FindBy(css="tr:nth-child(4)")
	protected WebElement timeResponseButton;

	@FindBy(css="#buttonLeft")
	protected WebElement cancelButton;


}
