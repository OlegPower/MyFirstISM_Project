package ISM.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Optional;

public class DioConfigurationAcceptPage extends BasePage {

    @FindBy(css = ".th-path-1-88")
    private WebElement dioConfigurationRow;

    @FindBy(css = ".btn-accept")
    private WebElement acceptButton;

    @FindBy(css = "bottom-buttons.white .btn-accept")
    private WebElement acceptConfirmationButton;


    public DioConfigurationAcceptPage() {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);

        new Actions(driver)
                .moveToElement(dioConfigurationRow)
                .sendKeys(Keys.DOWN)
                .build()
                .perform();
    }

    public void toggleValueInDropdown() {
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
