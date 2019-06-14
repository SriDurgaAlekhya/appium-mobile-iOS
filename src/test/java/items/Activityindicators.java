package items;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class Activityindicators {

    private final  IOSDriver driver;

    @iOSFindBy(accessibility = "Activity Indicators")
    private IOSElement activityIndicators;

    public  Activityindicators(IOSDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void activityIndicatorsPage(){
        activityIndicators.click();

        //driver.findElementByAccessibilityId("Activity Indicators").click();
        driver.navigate().back();

    }
}
