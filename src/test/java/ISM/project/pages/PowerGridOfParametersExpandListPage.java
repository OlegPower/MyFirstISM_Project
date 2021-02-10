package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PowerGridOfParametersExpandListPage extends BasePage{
	@FindBy(css="#CLUSTER_POWERGRID")
	protected WebElement powerGridList;

	public PowerGridOfParametersExpandListPage(){
	    driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
