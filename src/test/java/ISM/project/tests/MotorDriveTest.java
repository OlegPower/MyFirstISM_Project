package ISM.project.tests;

import ISM.project.helpers.MotorDriveOpenHelper;
import ISM.project.helpers.SettingsPanelHelper;
import org.testng.annotations.Test;

public class MotorDriveTest extends BaseTest{
    @Test
    public void test(){
        new SettingsPanelHelper().openSettingsPanel();
        new MotorDriveOpenHelper().motorDriveMonitoringOpenPage();
    }
}
