package ISM.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DIOConfigurationPageAcceptPage {
    @FindBy(xpath = "//*[@class='th-select-content tabhierarchy-2 th-selectable th-path-1-90-2']")
    private WebElement dropDown;

    @FindBy(css = ".btn-accept")
    private WebElement acceptButton;

    @FindBy(css = ".th-path-1-88")
    private WebElement dioConfigurationRow;

    public DIOConfigurationPageAcceptPage(WebDriver driver) {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);

        new Actions(driver)
                .moveToElement(dioConfigurationRow)
                .sendKeys(Keys.DOWN)
                .build()
                .perform();
    }

    public void toggleValueInDropdown() {
        WebElement dropdown = dioConfigurationRow.findElement(By.cssSelector(".th-path-1-88-2"));
        dropdown.findElement()
     /*   dropDown.click();

        clickAcceptButton.click();*/
    }
}
