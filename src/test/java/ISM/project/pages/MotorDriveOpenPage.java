package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MotorDriveOpenPage extends ContentMyFrame{
	/*@FindBy(xpath="//*[text()='AVR Overview']")
	protected WebElement avrOverviewRow;*/

/*	@FindBy(xpath="//*[text()='Motor Drive Monitoring']")
	protected WebElement motorDriveButton;*/

	@FindBy(css="g:nth-child(37)")
	protected WebElement motorDriveRow;

	@FindBy(css="#id_2_slider")
	protected WebElement Slider;

}
