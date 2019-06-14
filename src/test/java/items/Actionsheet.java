package items;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Actionsheet {

    private final IOSDriver driver;

    @iOSFindBy(accessibility = "Action Sheets")
    private IOSElement actionSheets;

    @iOSFindBy(accessibility = "Okay / Cancel")
    private IOSElement okayOrCancel;

    @iOSFindBy(accessibility = "OK")
    private IOSElement ok;

    public Actionsheet(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void actionSheetPage() {

        //driver.findElementByAccessibilityId("Action Sheets").click();
        //driver.findElementByAccessibilityId("Okay / Cancel").click();
        //driver.findElementByAccessibilityId("OK").click();

        actionSheets.click();
        okayOrCancel.click();
        ok.click();

        driver.navigate().back();
    }


}
