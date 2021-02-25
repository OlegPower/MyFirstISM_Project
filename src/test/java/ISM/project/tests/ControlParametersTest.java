package ISM.project.tests;

import ISM.project.helpers.ControlParametersHelper;
import ISM.project.helpers.ControlParametersOpenHelper;
import ISM.project.helpers.SettingsPanelHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ControlParametersTest extends BaseTest{
    @Test
    public void test(){
        new SettingsPanelHelper().openSettingsPanel();
        new ControlParametersOpenHelper().controlParametersOpenPage();
        ControlParametersHelper controlParametersHelper = new ControlParametersHelper();

        String controlParametersCheckSvg = controlParametersHelper.getSvgOnThePage();
        assertTrue(controlParametersCheckSvg.contains("Control variable"), "Check manually an opportunity to open the page");

        controlParametersHelper.openTimeResponsePage();
        new SettingsPanelHelper().openSettingsPanel();
        new ControlParametersOpenHelper().controlParametersOpenPage();

        String checkTabHandlerPosition = new ControlParametersHelper().getTabHandlerPosition();
        assertTrue(checkTabHandlerPosition.contains("focus"), "Tab handler set another position");

        new SettingsPanelHelper().openSettingsPanel();
    }
}
