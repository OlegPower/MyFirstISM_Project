package ISM.project.helpers;

import ISM.project.pages.ParameterListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ParameterListHelper extends ParameterListPage {
    public void selectParameter(String category, String parameterName) {
        WebElement foundCategoryElement = findCategory(category);
        String classes = foundCategoryElement.getAttribute("class");
        if (classes.contains("collapsed")){
            foundCategoryElement.click();
        }
        WebElement openPage = driver.findElement(By.xpath("//ul//li//span[text()='"+parameterName+"']"));
        openPage.click();

    }

    private WebElement findCategory(String category) {
        List<WebElement> categoryElements = driver.findElements(By.cssSelector("div.list-group-item-content"));
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
