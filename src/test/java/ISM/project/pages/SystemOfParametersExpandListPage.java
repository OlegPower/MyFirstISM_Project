package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemOfParametersExpandListPage extends IdAngularIFrame{
    @FindBy(css="#CLUSTER_SYSTEM")
    protected WebElement systemList;
}

