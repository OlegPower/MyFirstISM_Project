package ISM.project.tests;

import ISM.project.helpers.*;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SystemLinkOutputsChangeValueTest extends BaseTest{
    @Test
    public void test(){
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().openParametersPage();
        new SystemOfParametersExpandListHelper().expandSystemList();
        new SystemLinkOutputsOpenPageHelper().openPage();
        SystemLinkOutputsChangeValueHelper systemLinkOutputsChangeValueHelper2 = new SystemLinkOutputsChangeValueHelper();
        systemLinkOutputsChangeValueHelper2.changeValue();
        new ParametersReturnToListHelper().parametersInBreadCrumbs();
        SystemLinkOutputsCheckTextHelper systemLinkOutputsCheckTextHelper = new SystemLinkOutputsCheckTextHelper();
        systemLinkOutputsCheckTextHelper.openLinkOutputsPage();

        String nameOfText = systemLinkOutputsCheckTextHelper.getNameOfText();
        assertTrue(nameOfText.contains("Generic digital output 1"), "Current text on the page:  Generic digital output 1 ");
        System.out.println(nameOfText);

        new ParametersReturnToListHelper().parametersInBreadCrumbs();
    }
}
