package ISM.project.tests;

import ISM.project.helpers.ParametersOpenHelper;
import ISM.project.helpers.SettingsPanelHelper;
import ISM.project.helpers.SystemNamePlateChangeValueHelper;
import ISM.project.helpers.SystemOfParametersExpandHelper;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SystemNamePlateChangeValueTest extends BaseTest{
    @Test
    public void test(){
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().OpenParametersPage();
        new SystemOfParametersExpandHelper().expandSystemList();
        SystemNamePlateChangeValueHelper systemNamePlateCheckHelper = new SystemNamePlateChangeValueHelper();
        systemNamePlateCheckHelper.openNamePlatePage();

        String currentValue = systemNamePlateCheckHelper.getCurrentTxTypeValue();
        assertTrue(currentValue.contains("15"), "TxType value = 15");

        String currentTabHandlerPosition = systemNamePlateCheckHelper.getTabHandlerPosition();
        assertTrue(currentTabHandlerPosition.contains("focus"), "TabHandler doesn't set on TxType row");
    }
}
