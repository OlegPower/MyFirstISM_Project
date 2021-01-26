package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AioConfZCheckTabHandlerPositionPage extends BasePage{

	@FindBy(css="#buttonLeft")
    protected WebElement cancelButton;

    public AioConfZCheckTabHandlerPositionPage() {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
