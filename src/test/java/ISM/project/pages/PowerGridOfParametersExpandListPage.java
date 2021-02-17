package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PowerGridOfParametersExpandListPage extends IdAngularIFrame{
	@FindBy(css="#CLUSTER_POWERGRID")
	protected WebElement powerGridList;
}
