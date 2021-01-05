package ISM.project;

import ISM.project.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MyTest {
    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capabilities.setCapability("acceptInsecureCerts", true);
        capabilities.setCapability("INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS", true);
        capabilities.setCapability("IntroduceInstabilityByIgnoringProtectedModeSettings", true);
        WebDriver driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://192.168.165.1/?defaultdisplay=Default_org");
        driver.manage().window().maximize();
        SettingButtonsPanel settingButtonsPanel = new SettingButtonsPanel(driver);
        settingButtonsPanel.openSettingPanel();

        new DIOConfigurationPage(driver).openDIOConfigurationPage();

        DIOConfigurationPageAcceptPage dioConfigurationPageScrollToElemement = new DIOConfigurationPageAcceptPage(driver);
        dioConfigurationPageScrollToElemement.toggleValueInDropdown();
        /*AIOConfigurationPage aioConfigurationPage = new AIOConfigurationPage(driver);
        aioConfigurationPage.openAIOConfigurationPage();
        AIOConfigurationPageAcceptPage aioConfigurationPageAcceptPage = new AIOConfigurationPageAcceptPage(driver);
        aioConfigurationPageAcceptPage.sortTable();*/
//        driver.quit();
    }
}
