package ISM.project.helpers;

import ISM.project.pages.SystemNamePlateCheckTabHandlerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SystemNamePlateCheckTabHandlerHelper extends SystemNamePlateCheckTabHandlerPage {

    public String getTabHandlerPosition(){
        WebElement currentTabHandlerPosition1 = driver.findElement(By.cssSelector("#Nameplate"));
        return currentTabHandlerPosition1.getAttribute("class");
    }
}
