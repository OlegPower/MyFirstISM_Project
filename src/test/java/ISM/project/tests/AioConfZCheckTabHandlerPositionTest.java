package ISM.project.tests;

import ISM.project.helpers.AioConfZCheckTabHandlerPositionHelper;
import ISM.project.helpers.AioConfigurationOpenHelper;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AioConfZCheckTabHandlerPositionTest extends BaseTest{

    @Test
    public void test(){
        new AioConfigurationOpenHelper().openAioConfigurationPage();

        AioConfZCheckTabHandlerPositionHelper aioConfZCheckTabHandlerPositionHelper = new AioConfZCheckTabHandlerPositionHelper();

        String tabHandlerPosition = aioConfZCheckTabHandlerPositionHelper.getTabHandlerPosition();
        assertTrue(tabHandlerPosition.contains("focus"), "TabHandler doesn't set on this button: " + tabHandlerPosition);

        aioConfZCheckTabHandlerPositionHelper.closeAioConfigurationPage();
    }
}
