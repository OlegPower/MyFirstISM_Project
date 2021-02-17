package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DioConfigurationAcceptPage extends IdAngularIFrame {

    @FindBy(css = ".th-path-1-88")
    protected WebElement dioConfigurationRow;

    @FindBy(css = ".btn-accept")
    protected WebElement acceptButton;

    @FindBy(css = "bottom-buttons.white .btn-accept")
    protected WebElement acceptConfirmationButton;
}
