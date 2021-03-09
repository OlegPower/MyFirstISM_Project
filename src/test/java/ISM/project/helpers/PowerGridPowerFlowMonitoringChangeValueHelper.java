package ISM.project.helpers;

import ISM.project.pages.PowerGridPowerFlowMonitoringChangeValuePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Optional;

public class PowerGridPowerFlowMonitoringChangeValueHelper extends PowerGridPowerFlowMonitoringChangeValuePage {

    public void powerFlowMonitoringOpen() {
        powerFlowMonitoringButton.click();
        reversalOfPowerFlowRow.click();
    }

    public String reversalOfPowerFlowChangeValue() {
        WebElement dropDown = driver.findElement(By.cssSelector(".th-dynamic-dropdown"));
        String currentDropdownValue = dropDown.getText();
        dropDown.click();
        WebElement dropdownMenu = dropDown.findElement(By.cssSelector(".dropdown-menu"));
        List<WebElement> options = dropdownMenu.findElements(By.tagName("li"));
        Optional<WebElement> differentDropdownValue = options.stream()
                .filter(el -> !el.getText().equalsIgnoreCase(currentDropdownValue))
                .findFirst();
        if (!differentDropdownValue.isPresent()) {
            throw new RuntimeException("Can not find element with different value!");
        }
        WebElement differentWebElement = differentDropdownValue.get();
        String newValue = differentWebElement.getText().trim();
        differentWebElement.click();
        acceptButton.click();
        return newValue;
    }
}