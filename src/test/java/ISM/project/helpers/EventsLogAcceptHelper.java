package ISM.project.helpers;

import ISM.project.pages.EventsLogAcceptPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.LocalDate;
import java.util.List;

public class EventsLogAcceptHelper extends EventsLogAcceptPage {
    public void openLogPage(){
        openLogButton.click();
    }


    public Integer getEventsCount(){
        WebElement tableElement = driver.findElement(By.cssSelector(".mr-table"));
        List<WebElement> rowElements = tableElement.findElements(By.cssSelector("div.ps-content tr"));
        return rowElements.size();
    }

    public Integer getErrorEventsCount(){
        WebElement tableElement = driver.findElement(By.cssSelector(".mr-table"));
        List<WebElement> errorLedElements = tableElement.findElements(By.cssSelector("td:nth-child(4) svg.red"));
        return errorLedElements.size();
    }

    public void filterLogs(LocalDate fromDate) {
        filterButton.click();
        yearValueFrom.clear();
        yearValueFrom.clear();
        yearValueFrom.sendKeys(String.valueOf(fromDate.getYear()));
        monthValueFrom.clear();
        monthValueFrom.sendKeys(String.valueOf(fromDate.getMonthValue()));
        dayValueFrom.clear();
        dayValueFrom.sendKeys(String.valueOf(fromDate.getDayOfMonth()));
        warningEventsCheckbox.click();
        comingEventsCheckbox.click();
        searchButton.click();
    }
}
