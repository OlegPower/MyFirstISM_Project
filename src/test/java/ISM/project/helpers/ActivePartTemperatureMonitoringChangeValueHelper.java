package ISM.project.helpers;

import ISM.project.pages.ActivePartTemperatureMonitoringChangeValuePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActivePartTemperatureMonitoringChangeValueHelper extends ActivePartTemperatureMonitoringChangeValuePage {

    public static final String MINUS_ONE_HUNDRED_TWENTY_EIGHT = "-128";
    public static final String ONE_HUNDRED_TWENTY_EIGHT = "128";

    public String temperatureMonitoringChangeValue(){
        new Actions(driver)
                .moveToElement(temperatureMonitoringButton)
                .build()
                .perform();
        temperatureMonitoringButton.click();
        topOilCellPage.click();
        WebElement getCurrentValue = driver.findElement(By.cssSelector(".rz-pointer-min"));
        String cssClasses = getCurrentValue.getAttribute("aria-valuenow");
        WebElement changeCurrentValue = driver.findElement(By.cssSelector("ng-transclude > div > tooltip > div > input"));
        String newValue = cssClasses.equals(MINUS_ONE_HUNDRED_TWENTY_EIGHT) ? "128" : "-128";
        changeCurrentValue.click();
        changeCurrentValue.clear();
        changeCurrentValue.sendKeys(newValue);
        acceptButton.click();
        return newValue;
    }
}
