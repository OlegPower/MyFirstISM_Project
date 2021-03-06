package ISM.project.tests;

import ISM.project.helpers.*;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.containsString;

public class MotorDriveCheckValidConditionTest extends BaseTest {
    @Test
    public void test() {
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().openParametersPage();
        new PowerGridOfParametersExpandListHelper().powerGridExpandListIfNeeded();
        new PowerGridPowerFlowMonitoringChangeValueHelper().powerFlowMonitoringOpen();
        new PowerGridPowerFlowMonitoringChangeValueHelper().selectSpecificPowerFlow("Target tap position");
        new SettingsPanelHelper().openSettingsPanel();
        new MotorDriveOpenHelper().motorDriveMonitoringOpenPage();

        MotorDriveTapPositionGaugeInvalidTestHelper motorHelper = new MotorDriveTapPositionGaugeInvalidTestHelper();
        String currentTapPositionColor = motorHelper.getTapPositionColor();

        Assert.assertFalse(motorHelper.isErrorMessagePresent());
        Assert.assertThat(currentTapPositionColor, CoreMatchers.not(containsString("blue")));
    }
}
