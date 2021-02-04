package ISM.project.pages;

import org.openqa.selenium.support.PageFactory;

public class SystemNamePlateCheckTabHandlerPage extends BasePage{

    public SystemNamePlateCheckTabHandlerPage(){
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver,this);
    }
}
