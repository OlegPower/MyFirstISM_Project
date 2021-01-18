package ISM.project.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AioConfigurationOpenPage extends BasePage {
	@FindBy(xpath="//*[text()='AIO configuration']")
	private WebElement AIOConfigurationPageButton;

    public AioConfigurationOpenPage() {
        driver.switchTo().defaultContent().switchTo().frame("content_myframe");
        PageFactory.initElements(driver, this);

    }
    public void openAioConfigurationPage() {
        AIOConfigurationPageButton.click();
    }
}
