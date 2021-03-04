package ISM.project.helpers;

import ISM.project.pages.MotorDriveTapPositionGaugeCurrentValueTestPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class MotorDriveTapPositionGaugeCurrentValueTestHelper extends MotorDriveTapPositionGaugeCurrentValueTestPage {

public String getCurrentGaugeValue() {
    WebElement activeClass = driver.findElement(By.cssSelector(".is-active"));
    String currentGaugeValue = activeClass.getText();
    System.out.println("current Gauge value : " + currentGaugeValue);
    return currentGaugeValue;
  }
}
