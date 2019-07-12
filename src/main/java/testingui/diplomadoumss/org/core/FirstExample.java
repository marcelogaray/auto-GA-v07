package testingui.diplomadoumss.org.core;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Thread.sleep;

public class FirstExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = DriverManager.getInstance().getWebDriver();
        webDriver.get(PropertyAccesor.getInstance().getURL());
        webDriver.findElement(By.name("email")).sendKeys("admin@phptravels.com", Keys.ENTER);
        sleep(300);
        webDriver.findElement(By.name("password")).sendKeys("demoadmin",Keys.ENTER);
        //sleep(400);
       // webDriver.quit();
    }

    public static void exampleMap(){
        Map<String, String> students = new HashMap<>();
        students.put("101", "nombre 1");
        students.put("102", "nombre 2");
        students.put("103", "nombre 3");

        System.out.println(students.get("102"));
    }
}
