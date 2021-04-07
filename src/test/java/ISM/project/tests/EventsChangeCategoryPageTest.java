package ISM.project.tests;

import ISM.project.helpers.EventsChangeCategoryHelper;
import ISM.project.helpers.EventsOpenHelper;
import ISM.project.helpers.ParameterListHelper;
import org.testng.annotations.Test;

import static ISM.project.helpers.EventsChangeCategoryHelper.ERROR_CATEGORY;
import static ISM.project.helpers.EventsChangeCategoryHelper.WARNING_CATEGORY;
import static org.testng.Assert.*;

public class EventsChangeCategoryPageTest extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        new EventsOpenHelper().openEventsPage();
        EventsChangeCategoryHelper eventsChangeCategoryHelper = new EventsChangeCategoryHelper();

        String eventId = "1003";
        String currentCategory = eventsChangeCategoryHelper.getCategoryOfEvent(eventId);
        eventsChangeCategoryHelper.changeCategoryToAnyOpposite(eventId, currentCategory);

        String updatedCategory = eventsChangeCategoryHelper.getCategoryOfEvent(eventId);
        if (ERROR_CATEGORY.equals(currentCategory)){
            assertEquals(updatedCategory, WARNING_CATEGORY);
        }else {
            assertEquals(updatedCategory, ERROR_CATEGORY);
        }

        String rowElement = eventsChangeCategoryHelper.getTabHandlerPosition();
        assertTrue(rowElement.contains("focus"), "TabHandler doesn't set in header of the table: " + rowElement);
    }
}
