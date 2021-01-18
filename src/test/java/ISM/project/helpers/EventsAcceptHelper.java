package ISM.project.helpers;

import ISM.project.pages.EventsAcceptPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class EventsAcceptHelper extends EventsAcceptPage {
    public void mainTest(){
        sortTableByCategory.click();
        new Actions(driver)
                .moveToElement(configurationButtonForErrorCategory)
                .sendKeys(Keys.DOWN)
                .build()
                .perform();
        configurationButtonForErrorCategory.click();
        expandDropdown.click();
        selectWarningValue.click();
        acceptConfiguration.click();
        new Actions(driver)
                .moveToElement(configurationButtonForWarningCategory)
                .sendKeys(Keys.UP)
                .build()
                .perform();
        configurationButtonForWarningCategory.click();
        expandDropdown.click();
        selectErrorValue.click();
        acceptConfiguration.click();
        sortTableByCategory.click();
    }
}
