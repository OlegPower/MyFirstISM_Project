package ISM.project.helpers;

import ISM.project.pages.SystemOfParametersExpandListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SystemOfParametersExpandListHelper extends SystemOfParametersExpandListPage {

	public void expandSystemList(){
		WebElement row = driver.findElement(By.cssSelector("#CLUSTER_SYSTEM"));
		new Actions(driver)
				.moveToElement(row)
				.build()
				.perform();
		systemList.click();
	}
}
