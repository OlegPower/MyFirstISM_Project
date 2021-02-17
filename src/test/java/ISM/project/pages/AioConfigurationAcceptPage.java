package ISM.project.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AioConfigurationAcceptPage extends IdAngularIFrame {
    @FindBy(css = ".th-path-0-1")
    protected WebElement sortTableBySignalTypeUp;

    @FindBy(css = ".th-path-1-108-3")
    protected WebElement configurationButton;

    @FindBy(css = "[name=\"factorAio0\"]")
    protected WebElement correctionFactorField;

    @FindBy(css = ".th-path-5")
    protected WebElement acceptConfigurationModalButton;

    @FindBy(css = "#buttonRight")
    protected WebElement acceptAioConfigurationFormButton;

    @FindBy(css = "bottom-buttons.white .th-path-1")
    protected WebElement acceptAioConfigurationPageButton;
}
