package ISM.project.helpers;

import ISM.project.pages.ControlParametersPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ControlParametersHelper extends ControlParametersPage {

    public void openTimeResponsePage(){
        timeResponseButton.click();
        cancelButton.click();
    }

    public String getSvgOnThePage(){
        WebElement svgOnThePage = driver.findElement(By.id("svg54"));
        return svgOnThePage.getText();
    }

    public String getTabHandlerPosition(){
        WebElement tabHandlerPosition = driver.findElement(By.cssSelector(".th-path-0-3"));
        return tabHandlerPosition.getAttribute("class");
    }
}
