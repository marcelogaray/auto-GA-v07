package testingui.diplomadoumss.org.manageevents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testingui.diplomadoumss.org.core.DriverManager;

public class Event {

    public static void clickWebElement(WebElement element){
//        isWebElementClickable(element);
        element.click();
    }

    public static void fillWebElement(WebElement element,String value){
//        isWebElementVisible(element);
        element.clear();
        element.sendKeys(value);
    }

    public static void isWebElementVisible(WebElement element){
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    public static void isWebElementClickable(WebElement element){
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void avoidToUse(int second){
        try{
            Thread.sleep(second);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
