package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemLinkOutputsCheckTextPage extends BasePage{
    @FindBy(css="#IOMapping_GPO")
    protected WebElement linkOutputsButton;

    public SystemLinkOutputsCheckTextPage(){
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
