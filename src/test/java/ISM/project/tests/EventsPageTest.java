package ISM.project.tests;

import ISM.project.helpers.*;
import org.testng.annotations.Test;

public class EventsPageTest extends BaseTest{
    @Test
    public void test(){
        new EventsOpenHelper().openEventsPage();
        new EventsAcceptHelper().mainTest();
    }
}
