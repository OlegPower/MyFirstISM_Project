package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MotorDriveOpenPage extends ContentMyFrame{

	@FindBy(xpath="//*[text()='Motor Drive Monitoring']")
	protected WebElement motorDriveRow;

}
