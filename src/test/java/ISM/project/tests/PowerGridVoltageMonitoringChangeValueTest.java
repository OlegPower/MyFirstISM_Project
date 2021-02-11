package ISM.project.tests;

import ISM.project.helpers.*;
import org.testng.annotations.Test;

public class PowerGridVoltageMonitoringChangeValueTest extends BaseTest{
    @Test
    public void test(){
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().OpenParametersPage();
        new PowerGridVoltageMonitoringOpenHelper().openVoltageMonitoringPage();
        new PowerGridVoltageMonitoringChangeValueHelper().changeValue();
        new ParametersReturnToListHelper().parametersInBreadCrumbs();
    }
}
