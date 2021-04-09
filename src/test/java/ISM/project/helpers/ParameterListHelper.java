package ISM.project.helpers;

import ISM.project.pages.ParameterListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ParameterListHelper extends ParameterListPage {
    public void selectParameter(String category, String parameterName) throws InterruptedException {
        WebElement foundCategoryElement = findCategory(category);
        String classes = foundCategoryElement.getAttribute("class");
        if (classes.contains("collapsed")) {
            foundCategoryElement.click();
        }
        WebElement openPage = driver.findElement(By.xpath("//ul//li//span[text()='" + parameterName + "']"));
        Thread.sleep(4000);
        new Actions(driver)
                .moveToElement(openPage)
                .build()
                .perform();
        openPage.click();
    }

    private WebElement findCategory(String category) {
        List<WebElement> categoryElements = driver.findElements(By.cssSelector("div.list-group-item-content"));
        for (int i = 1; i < categoryElements.size(); i++) {
            WebElement expandedCategory = categoryElements.get(i);
            new Actions(driver)
                    .moveToElement(expandedCategory)
                    .build()
                    .perform();
            String element = expandedCategory.getAttribute("class");
            if (!element.contains("collapsed")) {
                expandedCategory.click();
            }
        }
        for (int i = 1; i < categoryElements.size(); i++) {
            WebElement currentCategory = categoryElements.get(i);
            WebElement spanWithCategoryName = currentCategory.findElement(By.cssSelector("span:nth-child(2)"));
            String currentCategoryName = spanWithCategoryName.getText();
            if (category.equalsIgnoreCase(currentCategoryName)) {
                return currentCategory;
            }
        }
        throw new RuntimeException("Can not find category: " + category);
    }
}
