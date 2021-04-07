package ISM.project.tests;

import ISM.project.helpers.ParameterListHelper;
import ISM.project.helpers.ParametersOpenHelper;
import ISM.project.helpers.SettingsPanelHelper;
import org.testng.annotations.Test;

public class MotorDriveSseElementTest extends BaseTest{
    @Test
    public void test(){
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().openParametersPage();
        new ParameterListHelper().selectParameter("System", "General");
    }
}
