package ISM.project.helpers;

import ISM.project.pages.SystemLinkOutputsOpenPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SystemLinkOutputsOpenPageHelper extends SystemLinkOutputsOpenPage {

    public void openPage(){
        WebElement row = driver.findElement(By.cssSelector("#IOMapping_GPO"));
        new Actions(driver)
                .moveToElement(row)
                .build()
                .perform();
        linkOutputsButton.click();
        pageWithDropDown.click();
    }
}
