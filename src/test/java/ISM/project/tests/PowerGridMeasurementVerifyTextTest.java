package ISM.project.tests;

import ISM.project.helpers.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PowerGridMeasurementVerifyTextTest extends BaseTest{

    @Test
    public void test() throws InterruptedException {
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().openParametersPage();
        new ParameterListHelper().selectParameter("Power grid", "Measurement");

        String nameOfFirstRow = new PowerGridMeasurementVerifyTextHelper().getNameOfFirstRow();
        assertTrue(nameOfFirstRow.contains("Regulation mode"), "Check possibility to open the page");

        new ParametersReturnToListHelper().parametersInBreadCrumbs();
    }
}
