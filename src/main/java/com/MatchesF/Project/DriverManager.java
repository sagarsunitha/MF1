package com.MatchesF.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by NSAI on 18/05/2016.
 */
public class DriverManager {

   public DriverManager(){

        PageFactory.initElements(driver,this);
    }

    public static WebDriver driver;
    public void openBrowser()throws IOException{

    Properties properties = new Properties();
    FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\config.properties");
    properties.load(fis);
    String browser =  properties.getProperty("browser");
    String url = properties.getProperty("url");

        if(browser.equalsIgnoreCase("Firefox"))
            driver=new FirefoxDriver();
        else if(browser.equalsIgnoreCase("chrome"))
            driver=new ChromeDriver();
        else if (browser.equalsIgnoreCase("ie"))
            driver = new InternetExplorerDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBrowser(){driver.quit();

}
