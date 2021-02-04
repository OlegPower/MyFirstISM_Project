package ISM.project.tests;

import ISM.project.helpers.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class EventsSortPageTest extends BaseTest{
    @Test
    public void test(){
        new EventsOpenHelper().openEventsPage();
        EventsSortHelper eventsSortHelper = new EventsSortHelper();

        String ledColor = eventsSortHelper.getLedColor();
        assertTrue(ledColor.contains("red"), "Expected classes to contain class `red` but was: " + ledColor);

        eventsSortHelper.eventsSort();

        String ledColorAfterSortingTable = eventsSortHelper.getLedColorAfterSorting();
        assertTrue(ledColorAfterSortingTable.contains("grey"), "Expected classes to contain class `grey` but was: " + ledColorAfterSortingTable);

        new SettingsPanelHelper().openSettingsPanel();
    }
}
