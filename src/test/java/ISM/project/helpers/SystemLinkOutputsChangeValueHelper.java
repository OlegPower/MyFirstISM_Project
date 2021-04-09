package ISM.project.helpers;

import ISM.project.pages.SystemLinkOutputsChangeValuePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Optional;

public class SystemLinkOutputsChangeValueHelper extends SystemLinkOutputsChangeValuePage {

    public void genericDigitalOutputOpen(){
        genericDigital.click();
    }

    public void changeValue() {
        WebElement dropDown = driver.findElement(By.cssSelector(".dropdown.th-selectable"));
        String currentDropdownValue = dropDown.getText();
        dropDown.click();
        WebElement dropdownMenu = dropDown.findElement(By.cssSelector(".dropdown-menu"));
        List<WebElement> options = dropdownMenu.findElements(By.tagName("li"));
        Optional<WebElement> differentDropdownValue = options.stream()
                .peek(el -> System.out.println("Option : " + el.getText()))
                .filter(el -> !el.getText().equalsIgnoreCase(currentDropdownValue))
                .filter(el -> !el.getText().equalsIgnoreCase(" 500: Deactivated "))
                .findFirst();
        if (!differentDropdownValue.isPresent()) {
            throw new RuntimeException("Can not find element with different value!");
        }
        differentDropdownValue.get().click();
        acceptButton.click();
    }
}
