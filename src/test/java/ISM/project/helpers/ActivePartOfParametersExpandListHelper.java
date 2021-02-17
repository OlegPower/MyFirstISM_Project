package ISM.project.helpers;

import ISM.project.pages.ActivePartOfParametersExpandListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class ActivePartOfParametersExpandListHelper extends ActivePartOfParametersExpandListPage {

    public void activePartExpandList(){
        new Actions(driver)
                .moveToElement(activePartList)
                .build()
                .perform();
        activePartList.click();
    }
}
