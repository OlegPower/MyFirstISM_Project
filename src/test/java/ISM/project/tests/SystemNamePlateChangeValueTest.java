package ISM.project.tests;

import ISM.project.helpers.*;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SystemNamePlateChangeValueTest extends BaseTest{
    @Test
    public void test(){
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().OpenParametersPage();
        SystemNamePlateChangeValueHelper systemNamePlateCheckHelper = new SystemNamePlateChangeValueHelper();
        systemNamePlateCheckHelper.namePlateChangeValue();

        String currentValue = systemNamePlateCheckHelper.getCurrentTxTypeValue();
        assertTrue(currentValue.contains("15"), "TxType value = 15");

        String currentTabHandlerPosition1 = systemNamePlateCheckHelper.getTabHandlerPosition();
        assertTrue(currentTabHandlerPosition1.contains("focus"), "TabHandler doesn't set on TxType row");

        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().OpenParametersPage();
        SystemNamePlateCheckTabHandlerHelper systemNamePlateCheckTabHandlerHelper = new SystemNamePlateCheckTabHandlerHelper();
        systemNamePlateCheckTabHandlerHelper.getTabHandlerPosition();

        String currentTabHandlerPosition = systemNamePlateCheckTabHandlerHelper.getTabHandlerPosition();
        assertTrue(currentTabHandlerPosition.contains("focus"), "TabHandler doesn't set on Name Plate button");
    }
}
