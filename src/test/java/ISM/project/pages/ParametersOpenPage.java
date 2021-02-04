package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParametersOpenPage extends BasePage{
	@FindBy(xpath="//*[text()='Parameters']")
	protected WebElement parametersButton;

    public ParametersOpenPage() {
        driver.switchTo().defaultContent().switchTo().frame("content_myframe");
        PageFactory.initElements(driver, this);
    }
}
