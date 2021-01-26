package ISM.project.helpers;

import ISM.project.pages.DioConfigurationAcceptPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Optional;

public class DioConfigurationAcceptHelper extends DioConfigurationAcceptPage {

    public void toggleValueInDropdown() {
        new Actions(driver)
                .moveToElement(dioConfigurationRow)
                .sendKeys(Keys.DOWN)
                .build()
                .perform();
        WebElement dropDown = dioConfigurationRow.findElement(By.cssSelector(".th-path-1-88-2"));
        String currentDropdownValue = dropDown.getText();
        System.out.println("current value: " + currentDropdownValue);
        dropDown.click();
        WebElement dropdownMenu = dropDown.findElement(By.cssSelector(".dropdown-menu"));
        List<WebElement> options = dropdownMenu.findElements(By.tagName("li"));
        Optional<WebElement> differentDropdownValue = options.stream()
                .peek(el -> System.out.println("Option : " + el.getText()))
                .filter(el -> !el.getText().equalsIgnoreCase(currentDropdownValue))
                .findFirst();
        if (!differentDropdownValue.isPresent()) {
            throw new RuntimeException("Can not find element with different value!");
        }
        differentDropdownValue.get().click();
        acceptButton.click();
        acceptConfirmationButton.click();
    }
}

