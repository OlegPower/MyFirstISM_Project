package ISM.project.tests;

import ISM.project.helpers.*;
import com.google.common.collect.ImmutableSet;
import org.testng.annotations.Test;
import static ISM.project.helpers.ActivePartTemperatureMonitoringChangeValueHelper.MINUS_ONE_HUNDRED_TWENTY_EIGHT;
import static ISM.project.helpers.ActivePartTemperatureMonitoringChangeValueHelper.ONE_HUNDRED_TWENTY_EIGHT;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MotorDriveArrowDirectionTest extends BaseTest {
    @Test
    public void test() {
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().openParametersPage();
//        new ActivePartOfParametersExpandListHelper().activePartExpandList();
        String updatedValue = new ActivePartTemperatureMonitoringChangeValueHelper().temperatureMonitoringChangeValue();
        assertTrue(ImmutableSet.of(ONE_HUNDRED_TWENTY_EIGHT, MINUS_ONE_HUNDRED_TWENTY_EIGHT).contains(updatedValue));
        new SettingsPanelHelper().openSettingsPanel();
        new MotorDriveOpenHelper().motorDriveMonitoringOpenPage();
        String currentGaugeValue = new MotorDriveTapPositionGaugeCurrentValueTestHelper().getCurrentGaugeValue();
        assertEquals(currentGaugeValue, updatedValue);
    }
}
