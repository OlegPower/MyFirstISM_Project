package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemNamePlateChangeValuePage extends IdAngularIFrame{

	@FindBy(css="#Tx_Type")
	protected WebElement txTypeRow;

	@FindBy(css="div > input")
	protected WebElement valueOfTxType;

	@FindBy(css="#buttonRight")
	protected WebElement acceptButton;
}
