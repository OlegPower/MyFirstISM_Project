package ISM.project.tests;

import ISM.project.helpers.SettingsPanelHelper;
import ISM.project.pages.DioConfigurationAcceptPage;
import ISM.project.pages.DioConfigurationOpenPage;
import org.testng.annotations.Test;

public class DioConfigurationPageTest extends BaseTest {
    @Test
    public void test() {
        new SettingsPanelHelper().openSettingsPanel();
        new DioConfigurationOpenPage().openDioConfigurationPage();
        new DioConfigurationAcceptPage().toggleValueInDropdown();
    }
}
