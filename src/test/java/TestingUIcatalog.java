import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import items.Actionsheet;
import items.Activityindicators;
import items.Alertviews;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestingUIcatalog {

    @Test
    public void capabilities() throws MalformedURLException, InterruptedException {


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "12.2");
        capabilities.setCapability("deviceName", "iPhone 8");
        capabilities.setCapability("automationName", AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability("app", "/Users/ssatyam/Desktop/UICatalog.app");
        IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        Actionsheet ac = new Actionsheet(driver);
        ac.actionSheetPage();

        Activityindicators ai = new Activityindicators(driver);
        ai.activityIndicatorsPage();

        Alertviews av = new Alertviews(driver);
        av.alertViewsPage();

    }


}

