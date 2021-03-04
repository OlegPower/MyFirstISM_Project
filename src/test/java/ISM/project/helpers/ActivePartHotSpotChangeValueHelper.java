package ISM.project.helpers;

import ISM.project.pages.ActivePartHotSpotChangeValuePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Optional;

public class ActivePartHotSpotChangeValueHelper extends ActivePartHotSpotChangeValuePage {

    public String hotSpotChangeValue(){
        System.out.println(driver.getPageSource());
        WebElement dropDown = driver.findElement(By.cssSelector(".dropdown"));
        String currentDropdownValue = dropDown.getText();
        System.out.println("current value: " + currentDropdownValue);
        dropDown.click();
        System.out.println("before selecting options : "+driver.getPageSource());
        WebElement dropdownMenu = dropDown.findElement(By.cssSelector(".dropdown-menu"));
        List<WebElement> options = dropdownMenu.findElements(By.tagName("li"));
        Optional<WebElement> differentDropdownValue = options.stream()
                .peek(el -> System.out.println("Option : " + el.getText()))
                .filter(el -> !el.getText().equalsIgnoreCase(currentDropdownValue))
                .findFirst();
        if (!differentDropdownValue.isPresent()) {
            throw new RuntimeException("Can not find element with different value!");
        }
        WebElement differentWebElement = differentDropdownValue.get();
        String newValue = differentWebElement.getText().trim();
        System.out.println("new value : "+newValue);
        differentWebElement.click();
        acceptButton.click();
        return newValue;
    }


    public int getCurrentCountOfRows() {
        return driver.findElements(By.cssSelector("#BodyTable tbody tr"))
                .size();
    }
}
