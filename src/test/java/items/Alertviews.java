package items;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Alertviews {

    private final  IOSDriver driver;

    @iOSFindBy(accessibility ="Alert Views")
    private IOSElement alertViews;

    @iOSFindBy(accessibility = "Simple")
    private IOSElement simple;

    @iOSFindBy(accessibility ="OK")
    private IOSElement ok;

    @iOSFindBy(accessibility = "Okay / Cancel")
    private IOSElement okayCancel;

    @iOSFindBy(accessibility = "OK")
     private IOSElement ok2;

    @iOSFindBy(accessibility = "Other")
    private IOSElement other;

    @iOSFindBy(accessibility = "Choice One")
    private IOSElement choiceOne;

    @iOSFindBy(accessibility = "Text Entry")
    private IOSElement textEntry;

    @iOSFindBy(xpath = "//XCUIElementTypeAlert[@name=\"A Short Title Is Best\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private IOSElement aShortTitle1;

    @iOSFindBy(accessibility = "OK")
    private IOSElement ok3;

    @iOSFindBy(accessibility = "Secure Text Entry")
    private IOSElement secureText;

    @iOSFindBy(xpath = "//XCUIElementTypeAlert[@name=\"A Short Title Is Best\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField")
    private IOSElement aShortTitle2;

    @iOSFindBy(accessibility = "OK")
    private IOSElement ok4;

    public Alertviews(IOSDriver driver){
        this.driver=driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }



    public void alertViewsPage() throws InterruptedException {

       // driver.findElementByAccessibilityId("Alert Views").click();
        alertViews.click();
        //driver.findElementByAccessibilityId("Simple").click();
        simple.click();
       // driver.findElementByAccessibilityId("OK").click();
        ok.click();
        //driver.findElementByAccessibilityId("Okay / Cancel").click();
        okayCancel.click();
        //driver.findElementByAccessibilityId("OK").click();
        ok2.click();
       // driver.findElementByAccessibilityId("Other").click();
        other.click();
        //driver.findElementByAccessibilityId("Choice One").click();
        choiceOne.click();
       // driver.findElementByAccessibilityId("Text Entry").click();
        textEntry.click();
        aShortTitle1.click();
        driver.getKeyboard().sendKeys("Hello world");
        //driver.findElementByAccessibilityId("OK").click();
        ok3.click();
       // driver.findElementByAccessibilityId("Secure Text Entry").click();
        secureText.click();
        //driver.findElementByXPath("//XCUIElementTypeAlert[@name=\"A Short Title Is Best\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField\n").sendKeys("password");
        aShortTitle2.click();
        driver.getKeyboard().sendKeys("password");
       // driver.findElementByAccessibilityId("OK").click();
        ok4.click();
        driver.navigate().back();




    }
}
