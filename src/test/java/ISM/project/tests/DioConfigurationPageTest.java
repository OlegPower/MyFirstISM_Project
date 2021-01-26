package ISM.project.tests;

import ISM.project.helpers.DioConfigurationAcceptHelper;
import ISM.project.helpers.DioConfigurationOpenHelper;
import ISM.project.helpers.SettingsPanelHelper;
import org.testng.annotations.Test;

public class DioConfigurationPageTest extends BaseTest {
    @Test
    public void test(){
        new SettingsPanelHelper().openSettingsPanel();
        new DioConfigurationOpenHelper().openDioConfigurationPage();
        DioConfigurationAcceptHelper dioConfigurationAcceptHelper = new DioConfigurationAcceptHelper();
        dioConfigurationAcceptHelper.toggleValueInDropdown();
    }
}
