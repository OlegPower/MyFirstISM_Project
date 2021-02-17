package ISM.project.helpers;

import ISM.project.pages.ActivePartHotSpotChangeValuePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Optional;

public class ActivePartHotSpotChangeValueHelper extends ActivePartHotSpotChangeValuePage {

    public void hotSpotChangeValue(){
        WebElement dropDown = driver.findElement(By.cssSelector(".dropdown"));
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
    }
    public Integer getNumberRowsWithMeasurement(){
        WebElement tableElement = driver.findElement(By.cssSelector("#tableBodyContainer"));
        List<WebElement> rowElements = tableElement.findElements(By.cssSelector(".tabhierarchy-0"));
        return rowElements.size();
    }

     public Integer getNumberRowsWithCalculation(){
        WebElement tableElement = driver.findElement(By.cssSelector("#tableBodyContainer"));
        List<WebElement> rowElements = tableElement.findElements(By.cssSelector(".tabhierarchy-0"));
        return rowElements.size();
    }
}
