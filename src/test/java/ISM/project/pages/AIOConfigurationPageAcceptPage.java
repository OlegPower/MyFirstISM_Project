/*
package ISM.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AIOConfigurationPageAcceptPage{
    @FindBy(xpath = "//*[@class='sortable tabhierarchy-1 ot-th-selector-2 th-selectable th-path-0-1']")
    private WebElement sortTableBySignalTypeUp;

*/
/*    @FindBy(xpath = "//*[@class='sortable tabhierarchy-1 ot-th-selector-2 th-selectable th-path-0-1 asc focus']")
    private WebElement sortTableBySignalTypeDown;*//*


    @FindBy(xpath = "//*[@class='tabhierarchy-2 th-select-content th-selectable th-path-1-108-3']")
    private WebElement configurationButton;

    @FindBy(xpath = "//*[@name='factorAio0']")
    private WebElement correctionFactorField;

    @FindBy(xpath = "//*[@class='btn tabhierarchy-0 btn-accept th-selectable th-path-5']")
    private WebElement acceptConfigurationModalButton;

    @FindBy(xpath = "//*[@class='btn tabhierarchy-0 btn-accept overlay-buttons th-selectable th-path-1']")
    private WebElement acceptAIOConfigurationFormButton;

    @FindBy(xpath = "//*[@class='btn tabhierarchy-0 btn-accept th-selectable th-path-3']")
    private WebElement acceptAIOConfigurationPageButton;

    public AIOConfigurationPageAcceptPage(WebDriver driver){
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);

        WebElement verticalBar = driver.findElement(By.xpath("//*[@class='tabhierarchy-2 th-select-content th-selectable th-path-1-108-3']"));
        Actions action = new Actions(driver);
        Actions moveToElement = action.moveToElement(verticalBar);
        moveToElement.sendKeys(Keys.DOWN).build().perform();

    }

    public void sortTable() throws InterruptedException {
        sortTableBySignalTypeUp.click();
        configurationButton.click();
        correctionFactorField.clear();
        correctionFactorField.sendKeys("0.002");
        acceptConfigurationModalButton.click();
        acceptAIOConfigurationFormButton.click();
        acceptConfigurationModalButton.click();
    }
}
*/
