package testingui.diplomadoumss.org.stepsdefinitions;

import org.openqa.selenium.By;

public class Test2 {
    public static void main(String[] args) {
        String xpathDynamic = "//ul[@id='%s']/li/a[text()='%s']";
        System.out.println(String.format(xpathDynamic,"Hotels", "Rooms"));

        By rooms = By.xpath(String.format(xpathDynamic,"Hotels", "Rooms"));

    }
}
