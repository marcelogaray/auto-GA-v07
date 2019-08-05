/**
 * @author: jricaldi
 */

package testingui.diplomadoumss.org.core;

import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.managepage.dashboard.ReviewsManagement;
import testingui.diplomadoumss.org.managepage.login.Login;

public class PageObjectManager {

    WebDriver webDriver;
    Login login;
    ReviewsManagement reviewsManagement;

    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Login getLoginPage() {
        return (login == null) ? new Login(webDriver) : login;
    }

    public ReviewsManagement getReviewsManagePage() {
        return (reviewsManagement == null) ? new ReviewsManagement(webDriver) : reviewsManagement;
    }

}