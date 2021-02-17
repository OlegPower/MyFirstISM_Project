package ISM.project.pages;

import org.openqa.selenium.support.PageFactory;

public class IdFrameMenuMyFrame extends BasePage{

    public IdFrameMenuMyFrame() {
        driver.switchTo().defaultContent().switchTo().frame("id_frameMenu_myframe");
        PageFactory.initElements(driver, this);
    }
}
