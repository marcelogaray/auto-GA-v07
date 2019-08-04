package testingui.diplomadoumss.org.stepsdefinitions;

import org.openqa.selenium.By;

public class test {

    public static void main(String[] args) {
        String xpathDynamic = "//table//th//div[contains(normalize-space(@class), 'icheckbox_square-grey %s')]";

        System.out.println(String.format(xpathDynamic, "checked"));

        By newdynamicBy = By.xpath(String.format(xpathDynamic, "checked"));
    }
}
