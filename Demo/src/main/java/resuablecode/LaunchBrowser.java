package resuablecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LaunchBrowser {
   public static WebDriver driver;
    public static void launchUrl() throws IOException {

        File file = new File("src/main/resources/configuration/frameworkconfig.properties");
        FileInputStream fis = new FileInputStream(file);
        Properties p = new Properties();
        p.load(fis);
        driver = new ChromeDriver();
        driver.get(p.getProperty("url"));
    }
}
