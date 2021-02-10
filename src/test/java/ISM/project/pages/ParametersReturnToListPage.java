package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParametersReturnToListPage extends BasePage {
    @FindBy(css = "#NavigationButton_2")
    protected WebElement parameterInBreadCrumbs;

    public ParametersReturnToListPage() {
        driver.switchTo().defaultContent().switchTo().frame("id_frameMenu_myframe");
        PageFactory.initElements(driver, this);
    }
}
