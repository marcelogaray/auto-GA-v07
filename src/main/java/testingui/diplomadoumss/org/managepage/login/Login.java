package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;



/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login extends BasePage {

    public void initBrowser(){
        webDriver.get(PropertyAccesor.getInstance().getURL());
    }

    @FindBy(xpath = "//input[@name='email' and @type='text']")
    private WebElement emailTextField;

    @FindBy(xpath = "//input[@name='password' and @type='password']")
    private WebElement passwordTextField;

    @FindBy(css = ".btn-primary.btn-block")
    private WebElement buttonLogin;

    public Login setEmail(String email){
        Event.fillWebElement(emailTextField,email);
        return this;
    }

    public Login setPassword(String password){
        Event.fillWebElement(passwordTextField,password);
        return  this;
    }


    public Dashboard clickButtonLogin(){
        Event.clickWebElement(buttonLogin);
        return new Dashboard();
    }

    public Dashboard setCredentials() {

        return setEmail(PropertyAccesor.getInstance().getEmail()).
                setPassword(PropertyAccesor.getInstance().getPassword()).
                clickButtonLogin();
    }
}
