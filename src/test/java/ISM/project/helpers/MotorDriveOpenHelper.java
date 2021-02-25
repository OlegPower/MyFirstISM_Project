package ISM.project.helpers;

import ISM.project.pages.MotorDriveOpenPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MotorDriveOpenHelper extends MotorDriveOpenPage {
    public void motorDriveMonitoringOpenPage() {

        WebElement slider = driver.findElement(By.cssSelector("#id_2_slider"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, 0, 190).release().build().perform();
        slider.click();

        motorDriveRow.click();
    }
}
