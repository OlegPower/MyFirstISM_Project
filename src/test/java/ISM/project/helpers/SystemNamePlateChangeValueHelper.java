package ISM.project.helpers;

import ISM.project.pages.SystemNamePlateChangeValuePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SystemNamePlateChangeValueHelper extends SystemNamePlateChangeValuePage {

    public void namePlateChangeValue(){
        txTypeRow.click();
        valueOfTxType.click();
        valueOfTxType.clear();
        valueOfTxType.sendKeys("15");
        acceptButton.click();
    }

    public String getCurrentTxTypeValue(){
        WebElement rowElement = driver.findElement(By.cssSelector("#Tx_Type"));
        WebElement currentValue = rowElement.findElement(By.cssSelector("#Tx_Type > td:nth-child(2) > div > span"));
        return currentValue.getText();
    }
    public String getTabHandlerPosition(){
        WebElement currentTabHandlerPosition = driver.findElement(By.cssSelector("#Tx_Type"));
        return currentTabHandlerPosition.getAttribute("class");
    }
}
