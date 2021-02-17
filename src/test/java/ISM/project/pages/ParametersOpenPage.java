package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParametersOpenPage extends ContentMyFrame{
	@FindBy(xpath="//*[text()='Parameters']")
	protected WebElement parametersButton;
}
