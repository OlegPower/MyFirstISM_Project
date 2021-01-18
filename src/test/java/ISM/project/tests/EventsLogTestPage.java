package ISM.project.tests;

import ISM.project.helpers.EventsLogAcceptHelper;
import ISM.project.helpers.EventsOpenHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class EventsLogTestPage extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        new EventsOpenHelper().openEventsPage();
        EventsLogAcceptHelper eventsLogAcceptHelper = new EventsLogAcceptHelper();
        eventsLogAcceptHelper.openLogPage();
        eventsLogAcceptHelper.openFilterModal();
        eventsLogAcceptHelper.setDateFrom(LocalDate.of(2020, 3, 2));
        eventsLogAcceptHelper.setDateTo(LocalDate.of(2020, 3, 2));
        eventsLogAcceptHelper.searchFilterParameters();

        Thread.sleep(2_000);

        Integer eventsCount = eventsLogAcceptHelper.getEventsCount();
        Assert.assertTrue(eventsCount > 0, "Table must contain rows after filtering!");
        Integer errorEventsCount = eventsLogAcceptHelper.getErrorEventsCount();
        Assert.assertEquals(eventsCount, errorEventsCount, "All logs must be only ERROR");
    }

}
