package ISM.project.tests;

import ISM.project.helpers.EventsChangeCategoryHelper;
import ISM.project.helpers.EventsOpenHelper;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class EventsChangeCategoryPageTest extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        new EventsOpenHelper().openEventsPage();
        EventsChangeCategoryHelper eventsChangeCategoryHelper = new EventsChangeCategoryHelper();

        String ledColor = eventsChangeCategoryHelper.getLedColor("1101");
        assertTrue(ledColor.contains("red"), "Expected classes to contain class `red` but was: " + ledColor);

        eventsChangeCategoryHelper.changeEventsCategoryOnWarning();
        eventsChangeCategoryHelper.scrollTableToEvent();

        String ledColorAfterChangingCategory = eventsChangeCategoryHelper.getLedColorAfterChangingCategory("1101");
        assertTrue(ledColorAfterChangingCategory.contains("yellow"), "Expected classes to contain class `yellow` but was: " + ledColorAfterChangingCategory);

        eventsChangeCategoryHelper.changeEventsCategoryOnError();

        String ledColorAfterChangingCategoryBack = eventsChangeCategoryHelper.getLedColorAfterChangingCategoryBack("1101");
            assertTrue(ledColorAfterChangingCategoryBack.contains("red"), "Expected classes to contain class `red` but was: " + ledColorAfterChangingCategoryBack);
    }
}
