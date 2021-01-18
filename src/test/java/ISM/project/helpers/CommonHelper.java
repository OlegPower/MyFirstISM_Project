package ISM.project.helpers;
import ISM.project.pages.BasePage;

public class CommonHelper extends BasePage {
    public void close(){
        driver.quit();
    }
}
