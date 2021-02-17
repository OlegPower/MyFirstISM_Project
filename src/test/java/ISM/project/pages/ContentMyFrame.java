package ISM.project.pages;

import org.openqa.selenium.support.PageFactory;

public class ContentMyFrame extends BasePage{

    public ContentMyFrame() {
        driver.switchTo().defaultContent().switchTo().frame("content_myframe");
        PageFactory.initElements(driver, this);
    }
}
