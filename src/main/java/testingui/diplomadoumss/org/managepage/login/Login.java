package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;
import static testingui.diplomadoumss.org.manageevents.Event.fieldWebElement;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login extends BasePage {

    @FindBy(xpath = "//input[@name='email' and @type='text']")
    private WebElement emailTextField;

    @FindBy(xpath = "//input[@name='password' and @type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonField;

    public Dashboard setCredentials() throws InterruptedException {
        return setEmail(PropertyAccesor.getInstance().getEmail()).
                setPassword(PropertyAccesor.getInstance().getPassword()).
                clickLoginButton();
    }

    public Login setEmail(String email) {
        fieldWebElement(emailTextField, email);
        return this;
    }

    public Login setPassword(String password) {
        fieldWebElement(passwordField, password);
        return this;
    }

    public Dashboard clickLoginButton() {
        clickWebElement(buttonField);
        return new Dashboard();
    }

}
