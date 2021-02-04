package ISM.project.helpers;

import ISM.project.pages.EventsChangeCategoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EventsChangeCategoryHelper extends EventsChangeCategoryPage {

    public static final String ERROR_CATEGORY = "red";
    public static final String WARNING_CATEGORY = "yellow";
    public static final String INFO_CATEGORY = "grey";

    public String getCategoryOfEvent(String eventId){
        WebElement rowElement = getEventRowById(eventId);
        WebElement categoryCellElement = rowElement.findElement(By.cssSelector("td:nth-child(3) svg"));
        String cssClasses = categoryCellElement.getAttribute("class");
        if (cssClasses.contains(ERROR_CATEGORY)){
            return ERROR_CATEGORY;
        }
        if (cssClasses.contains(WARNING_CATEGORY)){
            return WARNING_CATEGORY;
        }
        return INFO_CATEGORY;
    }


    public void changeCategoryToAnyOpposite(String eventId, String currentCategory){
        WebElement rowElement = getEventRowById(eventId);
        WebElement eventConfigurationButton = rowElement.findElement(By.cssSelector("td:nth-child(6) button"));
        eventConfigurationButton.click();
        expandDropdown.click();
        if (ERROR_CATEGORY.equals(currentCategory)){
            selectWarningValue.click();
        }else {
            selectErrorValue.click();
        }
        acceptConfiguration.click();
    }

    private WebElement getEventRowById(String eventId) {
        WebElement row = driver.findElement(By.id(eventId));
        new Actions(driver)
                .moveToElement(row)
                .build()
                .perform();
        return row;
    }

    public String getTabHandlerPosition() {
        WebElement rowElement = driver.findElement(By.cssSelector(".th-path-0"));
        return rowElement.getAttribute("class");
    }
}