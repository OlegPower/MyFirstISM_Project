package ISM.project.helpers;

import ISM.project.pages.MotorDriveTapPositionGaugeInvalidTestPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MotorDriveTapPositionGaugeInvalidTestHelper extends MotorDriveTapPositionGaugeInvalidTestPage {

    private final By errorTextElementSelector = By.cssSelector("g:nth-child(6) > svg > text");

    public String getCurrentErrorGaugeText() {
        WebElement textElement = driver.findElement(errorTextElementSelector);
        String currentText = textElement.getText();
        System.out.println("current gauge text : " + currentText);
        return currentText;
    }

    public boolean isErrorMessagePresent() {
        List<WebElement> elements = driver.findElements(errorTextElementSelector);
        return elements.size() > 0;
    }

    public String getTapPositionColor() {
        WebElement tapPositionColor = driver.findElement(By.cssSelector("text[fill]"));
        String redColor = tapPositionColor.getAttribute("fill");
        System.out.println("current tap position color : " + redColor);
        return redColor;
    }
}
