package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPanel extends BasePage {
	@FindBy(css="#id_Navi_5_Buttons_NavPrim5_radiobutton_clickarea")
	private WebElement settingsButton;

    public SettingsPanel() {
        driver.switchTo().defaultContent().switchTo().frame("id_frameMenu_myframe");
        PageFactory.initElements(driver, this);
    }

    public void openSettingsPanel(){
        settingsButton.click();
    }
}
