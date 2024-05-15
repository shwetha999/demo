package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Google {
    public static void main(String[] args) {
        WebDriver d = new EdgeDriver();
        d.get("https://www.google.com");
       d.findElement(By.name("q")).sendKeys("testing");
d.findElement(By.name("btnK")).click();
    }
}
