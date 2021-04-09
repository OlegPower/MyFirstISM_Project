package ISM.project.helpers;

import ISM.project.pages.SystemLinkOutputsCheckTextPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SystemLinkOutputsCheckTextHelper extends SystemLinkOutputsCheckTextPage {

    public String getNameOfText(){
        WebElement nameOfText = driver.findElement(By.cssSelector("td:nth-child(1) > span"));
        return nameOfText.getText();
    }
}
