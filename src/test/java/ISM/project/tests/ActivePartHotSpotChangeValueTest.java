package ISM.project.tests;

import ISM.project.helpers.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ActivePartHotSpotChangeValueTest extends BaseTest {

    @Test
    public void test() throws InterruptedException {
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().openParametersPage();
        new ParameterListHelper().selectParameter("Active part", "Hot-spot");
        new ActivePartHotSpotOpenPageHelper().hotSpotDeterminationPage();
        ActivePartHotSpotChangeValueHelper hotSpotChangeValueHelper = new ActivePartHotSpotChangeValueHelper();
        String newTypeOfMetrics = hotSpotChangeValueHelper.hotSpotChangeValue();

        int expectedRowsCount = "Measurement".equalsIgnoreCase(newTypeOfMetrics) ? 10 : 16;

        int actualRowsCount = hotSpotChangeValueHelper.getCurrentCountOfRows();

        assertEquals(actualRowsCount, expectedRowsCount);

        new ParametersReturnToListHelper().parametersInBreadCrumbs();
    }
}
