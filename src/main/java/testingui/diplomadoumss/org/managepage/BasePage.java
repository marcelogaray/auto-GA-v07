package testingui.diplomadoumss.org.managepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import testingui.diplomadoumss.org.core.DriverManager;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class BasePage {
    protected WebDriver webDriver;

    protected final String PANEL_LEFT_OPTION = "//ul[@id='%s']/li/a[text()='%s']";

    public BasePage() {
        this.webDriver = DriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
    }
}
