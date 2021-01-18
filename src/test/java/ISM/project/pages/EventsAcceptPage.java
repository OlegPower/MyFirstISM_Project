package ISM.project.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsAcceptPage extends BasePage {
    @FindBy(css = ".th-path-0-2")
    private WebElement sortTableByCategory;

    @FindBy(css = ".th-path-1-49-1")
    private WebElement configurationButtonForErrorCategory;

    @FindBy(css = ".dpdwn-bgrnd")
    private WebElement expandDropdown;

    @FindBy(css = ".th-path-3-1")
    private WebElement selectWarningValue;

    @FindBy(css = "#buttonRight")
    private WebElement acceptConfiguration;

    @FindBy(css = ".th-path-1-16-1")
    private WebElement configurationButtonForWarningCategory;

    @FindBy(css = ".th-path-3-0")
    private WebElement selectErrorValue;

    public EventsAcceptPage() {
        driver.switchTo().defaultContent().switchTo().frame("idAngularIframe");
        PageFactory.initElements(driver, this);
    }

    public void mainTest(){
        sortTableByCategory.click();
        new Actions(driver)
                .moveToElement(configurationButtonForErrorCategory)
                .sendKeys(Keys.DOWN)
                .build()
                .perform();
        configurationButtonForErrorCategory.click();
        expandDropdown.click();
        selectWarningValue.click();
        acceptConfiguration.click();
        new Actions(driver)
                .moveToElement(configurationButtonForWarningCategory)
                .sendKeys(Keys.UP)
                .build()
                .perform();
        configurationButtonForWarningCategory.click();
        expandDropdown.click();
        selectErrorValue.click();
        acceptConfiguration.click();
        sortTableByCategory.click();
    }
}
