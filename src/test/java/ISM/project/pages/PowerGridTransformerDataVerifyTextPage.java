package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PowerGridTransformerDataVerifyTextPage extends BasePage{

	@FindBy(css="#Wandlerdaten")
	protected WebElement transformerDataButton;

	public PowerGridTransformerDataVerifyTextPage(){
	    driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
