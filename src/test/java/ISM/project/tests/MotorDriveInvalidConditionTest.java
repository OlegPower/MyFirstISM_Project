package ISM.project.tests;

import ISM.project.helpers.*;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.testng.annotations.Test;

public class MotorDriveInvalidConditionTest extends BaseTest {

    @Test
    public void test() {
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().openParametersPage();
//        new PowerGridOfParametersExpandListHelper().powerGridExpandListIfNeeded();
        new PowerGridPowerFlowMonitoringChangeValueHelper().powerFlowMonitoringOpen();
        new PowerGridPowerFlowMonitoringChangeValueHelper().selectSpecificPowerFlow("off");
        new SettingsPanelHelper().openSettingsPanel();
        new MotorDriveOpenHelper().motorDriveMonitoringOpenPage();

        String currentGaugeText = new MotorDriveTapPositionGaugeInvalidTestHelper().getCurrentErrorGaugeText();
        Assert.assertThat(currentGaugeText, CoreMatchers.containsString("Invalid tap position"));

        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().openParametersPage();
        new PowerGridPowerFlowMonitoringChangeValueHelper().powerFlowMonitoringOpen();
        new PowerGridPowerFlowMonitoringChangeValueHelper().selectSpecificPowerFlow("Target tap position");
    }
}
