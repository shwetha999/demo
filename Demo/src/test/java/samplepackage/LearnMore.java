package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMore {
    public static void main(String[] args) {
        WebDriver d = new ChromeDriver();
        d.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
        d.findElement(By.id("username")).sendKeys("learnmore");
        d.findElement(By.id("password")).sendKeys("learnmore@123");

    }
}
