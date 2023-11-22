package day02;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class C02_DifferentDrivers {
    // If we only test on the Android apps, it is suggested to use AndroidDriver
    // If we test Android and IOS apps we should use AppiumDriver
    // If you not has IOS apps no need to use Ap[iumDriver

    AppiumDriver<MobileElement> appiumDriver;

    DesiredCapabilities capabilities=new DesiredCapabilities();

    @Test
    public void isCalculatorAppInstalled() throws MalformedURLException {
        capabilities.setCapability("deviceName","Pixel 7 API 30");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","11.0");
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability("app",System.getProperty("user.dir")+"app/Calculator.apk");
        appiumDriver=new AppiumDriver<MobileElement>(new URL("hptt://127.0.0.1:4723"),capabilities);
        //to test for isAppInstalled we should find the bundled id of the application
        //downland Apk info from the apk pure website
        Assert.assertTrue(appiumDriver.isAppInstalled("com.google.android.calculator"));

    }
    @Test
    public void capabilityTypes() throws MalformedURLException {
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 7 API 30");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ("user.dir")+"app/Calculator.apk");
        capabilities.setCapability(MobileCapabilityType.APP,"UiAutomator2");
        appiumDriver=new AppiumDriver<MobileElement>(new URL("hptt://127.0.0.1:4723"),capabilities);


    }






}
