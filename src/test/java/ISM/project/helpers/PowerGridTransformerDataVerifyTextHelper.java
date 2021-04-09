package ISM.project.helpers;

import ISM.project.pages.PowerGridTransformerDataVerifyTextPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PowerGridTransformerDataVerifyTextHelper extends PowerGridTransformerDataVerifyTextPage {

    public String getNameOfFirstRow() {
        WebElement nameOfFirstRow = driver.findElement(By.cssSelector("#VTPrimary"));
        return nameOfFirstRow.getText();
    }
}
