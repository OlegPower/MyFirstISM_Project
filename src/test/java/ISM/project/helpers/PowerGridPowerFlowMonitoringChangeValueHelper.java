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

    public void selectSpecificPowerFlow(String specificMode) {
        WebElement dropDown = driver.findElement(By.cssSelector(".th-dynamic-dropdown"));
        String currentDropdownValue = dropDown.getText();
        if (currentDropdownValue.equalsIgnoreCase(specificMode)) {
            System.out.println("specified mode `" + specificMode + "` is already selected!");
            return;
        }
        dropDown.click();
        WebElement dropdownMenu = dropDown.findElement(By.cssSelector(".dropdown-menu"));
        List<WebElement> options = dropdownMenu.findElements(By.tagName("li"));
        Optional<WebElement> specifiedElement = options.stream()
                .filter(el -> el.getText().equalsIgnoreCase(specificMode))
                .findFirst();
        if (!specifiedElement.isPresent()) {
            throw new RuntimeException("Can not find element with mode `" + specificMode + "`!");
        }
        WebElement differentWebElement = specifiedElement.get();
        differentWebElement.click();
        acceptButton.click();
    }
}