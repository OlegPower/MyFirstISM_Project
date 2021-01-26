package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsOpenPage extends BasePage {

    @FindBy(css = "#id_Navi_5_Buttons_NavPrim2_radiobutton_clickarea")
    protected WebElement eventsButton;

    public EventsOpenPage() {
        driver.switchTo().defaultContent().switchTo().frame("id_frameMenu_myframe");
        PageFactory.initElements(driver, this);
    }
}

