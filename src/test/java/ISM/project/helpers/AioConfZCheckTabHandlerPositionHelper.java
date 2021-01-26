package ISM.project.helpers;

import ISM.project.pages.AioConfZCheckTabHandlerPositionPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AioConfZCheckTabHandlerPositionHelper extends AioConfZCheckTabHandlerPositionPage {

    public String getTabHandlerPosition() {
        WebElement rowElement = driver.findElement(By.cssSelector(".th-path-1-108"));
        WebElement tabHandlerPosition = rowElement.findElement(By.cssSelector(".th-path-1-108-3"));
        return tabHandlerPosition.getAttribute("class");
    }

    public void closeAioConfigurationPage(){
        cancelButton.click();
    }
}
