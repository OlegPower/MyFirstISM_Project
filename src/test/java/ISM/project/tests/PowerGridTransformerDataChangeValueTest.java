package ISM.project.tests;

import ISM.project.helpers.PowerGridOfParametersExpandListHelper;
import ISM.project.helpers.PowerGridTransformerDataChangeValueHelper;
import org.testng.annotations.Test;

public class PowerGridTransformerDataChangeValueTest extends BaseTest {
    @Test
    public void test() {
        new PowerGridOfParametersExpandListHelper().powerGridExpandList();
        new PowerGridTransformerDataChangeValueHelper().transformerDataChangeValue();
    }
}
