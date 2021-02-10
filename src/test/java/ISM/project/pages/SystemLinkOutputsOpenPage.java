package ISM.project.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemLinkOutputsOpenPage extends BasePage{

	@FindBy(css="#IOMapping_GPO")
	protected WebElement linkOutputsButton;

	@FindBy(css="#GPO1")
	protected WebElement pageWithDropDown;
	
    public SystemLinkOutputsOpenPage() {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
