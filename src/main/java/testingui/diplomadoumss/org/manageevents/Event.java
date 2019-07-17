package testingui.diplomadoumss.org.manageevents;

import org.openqa.selenium.WebElement;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class Event {

    public static void clickWebElement(WebElement element) {
        element.click();
    }

    public static void fieldWebElement(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
}
