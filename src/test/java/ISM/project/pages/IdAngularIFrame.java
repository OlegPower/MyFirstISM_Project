package ISM.project.pages;

import org.openqa.selenium.support.PageFactory;

public class IdAngularIFrame extends BasePage{

    public IdAngularIFrame() {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }
}
