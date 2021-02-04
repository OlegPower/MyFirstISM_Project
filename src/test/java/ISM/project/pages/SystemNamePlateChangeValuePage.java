package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemNamePlateChangeValuePage extends BasePage{
	@FindBy(css="#Nameplate")
	protected WebElement namePlateButton;

	@FindBy(css="#Tx_Type")
	protected WebElement txTypeRow;

	@FindBy(css="div > input")
	protected WebElement valueOfTxType;

	@FindBy(css="#buttonRight")
	protected WebElement acceptButton;

    public SystemNamePlateChangeValuePage() {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
