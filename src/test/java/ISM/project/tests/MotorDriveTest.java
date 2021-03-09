package ISM.project.tests;

import ISM.project.helpers.*;
import com.google.common.collect.ImmutableSet;
import org.testng.annotations.Test;

import static ISM.project.helpers.ActivePartTemperatureMonitoringChangeValueHelper.MINUS_ONE_HUNDRED_TWENTY_EIGHT;
import static ISM.project.helpers.ActivePartTemperatureMonitoringChangeValueHelper.ONE_HUNDRED_TWENTY_EIGHT;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MotorDriveTest extends BaseTest {
    @Test
    public void test() {
        /*new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().OpenParametersPage();
        new ActivePartOfParametersExpandListHelper().activePartExpandList();
        String updatedValue = new ActivePartTemperatureMonitoringChangeValueHelper().temperatureMonitoringChangeValue();
        assertTrue(ImmutableSet.of(ONE_HUNDRED_TWENTY_EIGHT, MINUS_ONE_HUNDRED_TWENTY_EIGHT).contains(updatedValue));*/

        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().OpenParametersPage();
        new PowerGridOfParametersExpandListHelper().powerGridExpandList();
        new PowerGridPowerFlowMonitoringChangeValueHelper().powerFlowMonitoringOpen();
        String rowWithValueOff = new PowerGridPowerFlowMonitoringChangeValueHelper().reversalOfPowerFlowChangeValue();

        new SettingsPanelHelper().openSettingsPanel();
        new MotorDriveOpenHelper().motorDriveMonitoringOpenPage();
        String currentGaugeValue = new MotorDriveTapPositionGaugeCurrentValueTestHelper().getCurrentGaugeValue();
//        assertEquals(currentGaugeValue, updatedValue);

        String requiredValue = "Off".equalsIgnoreCase(rowWithValueOff) ? "Off" : "Target tap position";
        if(requiredValue.contains("Off")){
            String validationText = new MotorDriveTapPositionGaugeInvalidTestHelper().checkInvalidCondition();
            String currentTapPositionColor = new MotorDriveTapPositionGaugeInvalidTestHelper().checkTapPositionColor();
            assertTrue((validationText.contains("Invalid tap position")) && currentTapPositionColor.contains("red"));

        }
    }
}
