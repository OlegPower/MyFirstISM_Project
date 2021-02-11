package ISM.project.helpers;

import ISM.project.pages.PowerGridMeasurementVerifyTextPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PowerGridMeasurementVerifyTextHelper extends PowerGridMeasurementVerifyTextPage {
    public void openMeasurementPage() {
        measurementButton.click();
    }
    public String getNameOfFirstRow(){
        WebElement nameOfFirstRow = driver.findElement(By.cssSelector("#RegMode"));
        return nameOfFirstRow.getText();
    }
}
