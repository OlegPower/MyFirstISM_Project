package ISM.project.helpers;

import ISM.project.pages.SystemNamePlateCheckTabHandlerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SystemNamePlateCheckTabHandlerHelper extends SystemNamePlateCheckTabHandlerPage {

    public String getTabHandlerPosition(){
        WebElement currentTabHandlerPosition = driver.findElement(By.cssSelector("#Nameplate"));
        return currentTabHandlerPosition.getAttribute("class");
    }
}
