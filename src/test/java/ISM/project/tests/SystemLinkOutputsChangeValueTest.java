package ISM.project.tests;

import ISM.project.helpers.*;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SystemLinkOutputsChangeValueTest extends BaseTest{
    @Test
    public void test() throws InterruptedException {
        new SettingsPanelHelper().openSettingsPanel();
        new ParametersOpenHelper().openParametersPage();
        new ParameterListHelper().selectParameter("System", "Link outputs");
        SystemLinkOutputsChangeValueHelper systemLinkOutputsChangeValueHelper = new SystemLinkOutputsChangeValueHelper();
        systemLinkOutputsChangeValueHelper.genericDigitalOutputOpen();
        systemLinkOutputsChangeValueHelper.changeValue();
        new ParametersReturnToListHelper().parametersInBreadCrumbs();

        SystemLinkOutputsCheckTextHelper systemLinkOutputsCheckTextHelper = new SystemLinkOutputsCheckTextHelper();
        new ParameterListHelper().selectParameter("System", "Link outputs");

        String nameOfText = systemLinkOutputsCheckTextHelper.getNameOfText();
        assertTrue(nameOfText.contains("Generic digital output 1"), "Current text on the page:  Generic digital output 1 ");
        System.out.println(nameOfText);

        new ParametersReturnToListHelper().parametersInBreadCrumbs();
    }
}
