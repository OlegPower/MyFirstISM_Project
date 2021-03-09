package ISM.project.helpers;

import ISM.project.pages.MotorDriveTapPositionGaugeInvalidTestPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MotorDriveTapPositionGaugeInvalidTestHelper extends MotorDriveTapPositionGaugeInvalidTestPage {
    public String checkInvalidCondition() {
        WebElement invalidRow = driver.findElement(By.cssSelector("g:nth-child(6) > svg > text"));
        String invalidRowText = invalidRow.getText();
        System.out.println("invalid text : " + invalidRowText);
        return invalidRowText;
    }

    public String checkTapPositionColor(){
        WebElement tapPositionColor = driver.findElement(By.cssSelector("#text-tap-pos-1 > text"));
        String redColor = tapPositionColor.getAttribute("fill");
        System.out.println("current tap position color : " + redColor);
        return redColor;
    }
}
