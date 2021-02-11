package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PowerGridVoltageMonitoringChangeValuePage extends BasePage{

	@FindBy(css="#buttonRight")
	protected WebElement acceptButton;


	public PowerGridVoltageMonitoringChangeValuePage(){
	    driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
