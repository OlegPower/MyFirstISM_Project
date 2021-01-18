package ISM.project.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AioConfigurationAcceptPage extends BasePage {
    @FindBy(css = ".th-path-0-1")
    private WebElement sortTableBySignalTypeUp;

    @FindBy(css = ".th-path-1-108-3")
    private WebElement configurationButton;

    @FindBy(css = "[name=\"factorAio0\"]")
    private WebElement correctionFactorField;

    @FindBy(css = ".th-path-5")
    private WebElement acceptConfigurationModalButton;

    @FindBy(css = "#buttonRight")
    private WebElement acceptAioConfigurationFormButton;

    @FindBy(css = "bottom-buttons.white .th-path-1")
    private WebElement acceptAioConfigurationPageButton;

    public AioConfigurationAcceptPage() {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);

        WebElement verticalBar = driver.findElement(By.cssSelector(".th-path-1-108-3"));
        Actions action = new Actions(driver);
        Actions moveToElement = action.moveToElement(verticalBar);
        moveToElement.sendKeys(Keys.DOWN).build().perform();
    }

    public void mainTest() {
        sortTableBySignalTypeUp.click();
        configurationButton.click();
        correctionFactorField.clear();
        correctionFactorField.sendKeys("0.002");
        acceptConfigurationModalButton.click();
        acceptAioConfigurationFormButton.click();
        acceptAioConfigurationPageButton.click();
    }
}
