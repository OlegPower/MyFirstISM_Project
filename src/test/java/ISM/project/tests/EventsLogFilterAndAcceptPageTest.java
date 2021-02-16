package ISM.project.tests;

import ISM.project.helpers.EventsLogFilterAndAcceptHelper;
import ISM.project.helpers.EventsOpenHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class EventsLogFilterAndAcceptPageTest extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        new EventsOpenHelper().openEventsPage();
        EventsLogFilterAndAcceptHelper eventsLogAcceptHelper = new EventsLogFilterAndAcceptHelper();
        eventsLogAcceptHelper.openLogPage();
        eventsLogAcceptHelper.filterEventsInLog(LocalDate.of(2020, 2,12), LocalDate.of(2021, 1, 20));

        Thread.sleep(2_000);

        Integer eventsCount = eventsLogAcceptHelper.getEventsCount();
        Assert.assertTrue(eventsCount > 0, "Table must contain rows after filtering!");
        Integer errorEventsCount = eventsLogAcceptHelper.getErrorEventsCount();
        Assert.assertEquals(eventsCount, errorEventsCount, "All Events must be only ERROR");
    }
}
