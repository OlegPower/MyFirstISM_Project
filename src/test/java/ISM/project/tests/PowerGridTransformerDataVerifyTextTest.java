package ISM.project.tests;

import ISM.project.helpers.ParametersReturnToListHelper;
import ISM.project.helpers.PowerGridOfParametersExpandListHelper;
import ISM.project.helpers.PowerGridTransformerDataVerifyTextHelper;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PowerGridTransformerDataVerifyTextTest extends BaseTest {
    @Test
    public void test() {
        new PowerGridTransformerDataVerifyTextHelper().transformerDataOpenPage();

        String nameOfFirstRow = new PowerGridTransformerDataVerifyTextHelper().getNameOfFirstRow();
        assertTrue(nameOfFirstRow.contains("Primary transformer voltage"), "Check possibility to open the page");

        new ParametersReturnToListHelper().parametersInBreadCrumbs();
    }
}
