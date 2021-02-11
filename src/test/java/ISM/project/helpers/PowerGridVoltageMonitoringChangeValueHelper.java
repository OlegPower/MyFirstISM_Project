package ISM.project.helpers;

import ISM.project.pages.PowerGridVoltageMonitoringChangeValuePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PowerGridVoltageMonitoringChangeValueHelper extends PowerGridVoltageMonitoringChangeValuePage {

    public static final String ONE_HUNDRED = "100";
    public static final String SIXTY = "60";

    public void changeValue() {
        WebElement getCurrentValue = driver.findElement(By.cssSelector(".rz-pointer-min"));
        String cssClasses = getCurrentValue.getAttribute("aria-valuenow");
        WebElement changeCurrentValue = driver.findElement(By.cssSelector("ng-transclude > div > tooltip > div > input"));
        if (cssClasses.equals(ONE_HUNDRED)) {
            changeCurrentValue.click();
            changeCurrentValue.clear();
            changeCurrentValue.sendKeys("60");
        }
        if (cssClasses.equals(SIXTY)) {
            changeCurrentValue.click();
            changeCurrentValue.clear();
            changeCurrentValue.sendKeys("100");
        }
        acceptButton.click();
    }
}
