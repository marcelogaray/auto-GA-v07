package testingui.diplomadoumss.org.manageloadpage;

import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

public class LoadPage {

    public static Login loadPHPTravels() {
        WebDriver webDriver = DriverManager.getInstance().getWebDriver();
        webDriver.get(PropertyAccesor.getInstance().getURL()); //URL

        return new Login();
    }

    public static Dashboard loadNASApage() {
        WebDriver webDriver = DriverManager.getInstance().getWebDriver();
        webDriver.get(PropertyAccesor.getInstance().getURL());

        return new Dashboard();
    }
}
