package ISM.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivePartHotSpotOpenPage extends IdAngularIFrame{

    @FindBy(css="#HotSpot")
    protected WebElement hotSpotOpenPage;

    @FindBy(css="#SwitchHotSpotCalc")
    protected WebElement hotSpotDeterminationPage;
}
