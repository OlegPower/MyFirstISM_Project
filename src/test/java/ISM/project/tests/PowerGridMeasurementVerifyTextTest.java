package ISM.project.tests;

import ISM.project.helpers.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PowerGridMeasurementVerifyTextTest extends BaseTest{

    @Test
    public void test(){
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().openParametersPage();
        new PowerGridOfParametersExpandListHelper().powerGridExpandListIfNeeded();
        new PowerGridMeasurementVerifyTextHelper().openMeasurementPage();

        String nameOfFirstRow = new PowerGridMeasurementVerifyTextHelper().getNameOfFirstRow();
        assertTrue(nameOfFirstRow.contains("Regulation mode"), "Check possibility to open the page");

        new ParametersReturnToListHelper().parametersInBreadCrumbs();
    }
}
