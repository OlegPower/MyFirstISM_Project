package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivePartOfParametersExpandListPage extends IdAngularIFrame{

	@FindBy(css="#CLUSTER_ACTIVEPART")
	protected WebElement activePartList;

}
