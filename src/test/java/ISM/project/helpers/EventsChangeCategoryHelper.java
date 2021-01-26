package ISM.project.helpers;

import ISM.project.pages.EventsChangeCategoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EventsChangeCategoryHelper extends EventsChangeCategoryPage {

    public String getLedColor(String id) {
        WebElement rowElement = driver.findElement(By.id(id));
        WebElement categoryCellElement = rowElement.findElement(By.cssSelector("td:nth-child(3) svg"));
        return categoryCellElement.getAttribute("class");
    }

    public void changeEventsCategoryOnWarning() {
        configurationButtonForErrorCategory.click();
        expandDropdown.click();
        selectWarningValue.click();
        acceptConfiguration.click();
    }

    public void scrollTableToEvent(){
        new Actions(driver)
                .moveToElement(configurationButtonForWarningCategory)
                .sendKeys(Keys.UP)
                .build()
                .perform();
    }

    public String getLedColorAfterChangingCategory(String id) {
        WebElement rowElement = driver.findElement(By.id(id));
        WebElement categoryCellElementAfterChangingCategory = rowElement.findElement(By.cssSelector("td:nth-child(3) svg"));
        return categoryCellElementAfterChangingCategory.getAttribute("class");
    }

    public void changeEventsCategoryOnError() {
        configurationButtonForWarningCategory.click();
        expandDropdown.click();
        selectErrorValue.click();
        acceptConfiguration.click();
    }

    public String getLedColorAfterChangingCategoryBack(String id) {
        WebElement rowElement = driver.findElement(By.id(id));
        WebElement categoryCellElementAfterChangingCategoryBack = rowElement.findElement(By.cssSelector("td:nth-child(3) svg"));
        return categoryCellElementAfterChangingCategoryBack.getAttribute("class");
    }
}