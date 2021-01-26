package ISM.project.tests;

import ISM.project.helpers.AioConfigurationAcceptHelper;
import ISM.project.helpers.AioConfigurationOpenHelper;
import ISM.project.helpers.SettingsPanelHelper;
import org.testng.annotations.Test;

public class AioConfigurationPageTest extends BaseTest{
    @Test
    public void test() {
        new SettingsPanelHelper().openSettingsPanel();
        new AioConfigurationOpenHelper().openAioConfigurationPage();
        AioConfigurationAcceptHelper aioConfigurationAcceptHelper = new AioConfigurationAcceptHelper();
        aioConfigurationAcceptHelper.sortTable();
        aioConfigurationAcceptHelper.changeValueInConfiguration();
    }
}
