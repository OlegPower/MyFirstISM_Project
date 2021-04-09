package ISM.project.tests;

import ISM.project.helpers.*;
import org.testng.annotations.Test;

import static ISM.project.helpers.PowerGridVoltageMonitoringChangeValueHelper.ONE_HUNDRED;
import static ISM.project.helpers.PowerGridVoltageMonitoringChangeValueHelper.SIXTY;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PowerGridVoltageMonitoringChangeValueTest extends BaseTest{
    @Test
    public void test() throws InterruptedException {
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().openParametersPage();
        new ParameterListHelper().selectParameter("Power grid", "Voltage monitoring");
        new PowerGridVoltageMonitoringOpenHelper().openPercentageCell();
        String updatedValue = new PowerGridVoltageMonitoringChangeValueHelper().changeValue();
        if(ONE_HUNDRED.equals(updatedValue)){
            assertEquals(updatedValue, ONE_HUNDRED);
        }else {
            assertEquals(updatedValue, SIXTY);
        }
        System.out.println(updatedValue);
        new ParametersReturnToListHelper().parametersInBreadCrumbs();
    }
}
