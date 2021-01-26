package ISM.project.helpers;

import ISM.project.pages.AioConfigurationAcceptPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AioConfigurationAcceptHelper extends AioConfigurationAcceptPage {

    public void sortTable() {
        sortTableBySignalTypeUp.click();
        WebElement verticalBar = driver.findElement(By.cssSelector(".th-path-1-108-3"));
        Actions action = new Actions(driver);
        Actions moveToElement = action.moveToElement(verticalBar);
        moveToElement.sendKeys(Keys.DOWN).build().perform();
    }

    public void changeValueInConfiguration(){
        configurationButton.click();
        correctionFactorField.clear();
        correctionFactorField.sendKeys("0.002");
        acceptConfigurationModalButton.click();
        acceptAioConfigurationFormButton.click();
        acceptAioConfigurationPageButton.click();
    }
}
