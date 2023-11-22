package day02;

import com.beust.ah.A;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class C01_SetUpCapabilities {
    // Set-up Appium Enviroments

    //1 st step: Create androidDriver from the AndroidDriver class

    AndroidDriver<AndroidElement> androidDriver;

    //2nd step: Create capabilities object from the Capabilities class

    DesiredCapabilities capabilities=new DesiredCapabilities();

    /*
    Why do we need to use capabilities?
    1- We should define name of the emulator, operating system, url, automation name, app name
    2- Capabilities are working as a key-value

     */

    @Test
    public void setCapabilities() throws MalformedURLException {
        capabilities.setCapability("deviceName","Pixel 2 API 30");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("dplatformVersion","11.0");
        capabilities.setCapability("automationName","UiAutomator2");
        // Downland an aplication from the apkPure
        // create a directory with name app under the project name then drag and drop the downloaded app
        capabilities.setCapability("app",System.getProperty("user.dir")+"app/Calculator.apk");
        // set-up the driver and implement the url
        androidDriver=new AndroidDriver<AndroidElement>(new URL("hptt://127.0.0.1:4723"),capabilities);

    }
}
