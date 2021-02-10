package ISM.project.tests;

import ISM.project.helpers.AioConfZCheckTabHandlerPositionHelper;
import ISM.project.helpers.AioConfigurationAcceptHelper;
import ISM.project.helpers.AioConfigurationOpenHelper;
import ISM.project.helpers.SettingsPanelHelper;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AioConfigurationPageTest extends BaseTest{
    @Test
    public void test() {
        new SettingsPanelHelper().openSettingsPanel();
        new AioConfigurationOpenHelper().openAioConfigurationPage();
        AioConfigurationAcceptHelper aioConfigurationAcceptHelper = new AioConfigurationAcceptHelper();
        aioConfigurationAcceptHelper.sortTable();
        aioConfigurationAcceptHelper.changeValueInConfiguration();

        new AioConfigurationOpenHelper().openAioConfigurationPage();

        AioConfZCheckTabHandlerPositionHelper aioConfZCheckTabHandlerPositionHelper = new AioConfZCheckTabHandlerPositionHelper();

        String tabHandlerPosition = aioConfZCheckTabHandlerPositionHelper.getTabHandlerPosition();
        assertTrue(tabHandlerPosition.contains("focus"), "TabHandler doesn't set on this button: " + tabHandlerPosition);

        aioConfZCheckTabHandlerPositionHelper.closeAioConfigurationPage();
    }
}
