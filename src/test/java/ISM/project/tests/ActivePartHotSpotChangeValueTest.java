package ISM.project.tests;

import ISM.project.helpers.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActivePartHotSpotChangeValueTest extends BaseTest {

    @Test
    public void test() throws InterruptedException {
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().OpenParametersPage();
        new ActivePartOfParametersExpandListHelper().activePartExpandList();
        new ActivePartHotSpotOpenPageHelper().hotSpotOpenPage();
        ActivePartHotSpotChangeValueHelper hotSpotChangeValueHelper = new ActivePartHotSpotChangeValueHelper();

        Thread.sleep(5_000);

        hotSpotChangeValueHelper.hotSpotChangeValue();

        Integer rowsCountWithMeasurement = hotSpotChangeValueHelper.getNumberRowsWithMeasurement();
        Assert.assertTrue(rowsCountWithMeasurement == 10, "Table must contain 10 rows. Recheck it manually");

        Integer rowsCountWithCalculation = hotSpotChangeValueHelper.getNumberRowsWithCalculation();
        Assert.assertTrue(rowsCountWithCalculation == 16, "Table must contain 16 rows. Recheck it manually");
    }
}
