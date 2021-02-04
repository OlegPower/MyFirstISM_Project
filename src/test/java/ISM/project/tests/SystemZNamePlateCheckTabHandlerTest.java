package ISM.project.tests;

import ISM.project.helpers.ParametersOpenHelper;
import ISM.project.helpers.SettingsPanelHelper;
import ISM.project.helpers.SystemNamePlateCheckTabHandlerHelper;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SystemZNamePlateCheckTabHandlerTest extends BaseTest {
    @Test
    public void test() {
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().OpenParametersPage();
        SystemNamePlateCheckTabHandlerHelper systemNamePlateCheckTabHandlerHelper = new SystemNamePlateCheckTabHandlerHelper();
        systemNamePlateCheckTabHandlerHelper.getTabHandlerPosition();

        String currentTabHandlerPosition = systemNamePlateCheckTabHandlerHelper.getTabHandlerPosition();
        assertTrue(currentTabHandlerPosition.contains("focus"), "TabHandler doesn't set on Name Plate button");
    }
}
