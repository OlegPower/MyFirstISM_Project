package ISM.project.helpers;

import ISM.project.pages.PowerGridOfParametersExpandListPage;
import org.openqa.selenium.interactions.Actions;

public class PowerGridOfParametersExpandListHelper extends PowerGridOfParametersExpandListPage {
    public void powerGridExpandList(){
        new Actions(driver)
                .moveToElement(powerGridList)
                .build()
                .perform();
        powerGridList.click();
    }
}
