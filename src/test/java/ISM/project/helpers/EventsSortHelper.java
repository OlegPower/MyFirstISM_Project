package ISM.project.helpers;

import ISM.project.pages.EventsSortPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class EventsSortHelper extends EventsSortPage {

    public String getLedColor() {
        WebElement rowElement = driver.findElement(By.cssSelector(".th-path-1-0"));
        WebElement categoryCellElement = rowElement.findElement(By.cssSelector("td:nth-child(3) svg"));
        return categoryCellElement.getAttribute("class");
    }

    public void eventsSort() {
        sortTableByCategory.click();
    }

    public String getLedColorAfterSorting() {
        WebElement rowElementAfterSortingTable = driver.findElement(By.cssSelector(".th-path-1-0"));
        WebElement categoryCellElementAfterSortingTable = rowElementAfterSortingTable.findElement(By.cssSelector("td:nth-child(3) svg"));
        return categoryCellElementAfterSortingTable.getAttribute("class");
    }
}