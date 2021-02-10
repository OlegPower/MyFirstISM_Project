package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemLinkOutputsChangeValuePage extends BasePage{
	@FindBy(css=".dropdown")
	protected WebElement expandDropdown;

	@FindBy(css=".th-path-0-1.th-path-0-2 > span")
	protected WebElement limitValueU1;

	@FindBy(css="#buttonRight")
	protected WebElement acceptButton;


    public SystemLinkOutputsChangeValuePage() {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
