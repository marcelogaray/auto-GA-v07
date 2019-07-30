package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.core.BroserType;
import testingui.diplomadoumss.org.core.Browser;
import testingui.diplomadoumss.org.core.DriverFactory;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.adminsmanagement.AdminsManagement;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import java.sql.Driver;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToSecond;

public class LoginStepdefs {

    private Login login;

    private Dashboard dashboard;

    private AdminsManagement adminsManagement;

    private DriverManager driverManager;

    private WebDriver webDriver;

    @Given("^I Load PHP Travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPHPTravels();
    }

    @And("^Set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^Click 'Cars' link on 'Left Panel' Page$")
    public void clickCarsLinkOnLeftPanelPage() throws  Throwable {
        dashboard.clickCarsExpand();
    }

    @And("^Click 'Accounts' link on 'Left Panel' Page$")
    public void clickAccountsLinkOnLeftPanelPage() throws Throwable {
        dashboard.clickAccountsExpand();
    }

    @And("^Click 'Admins' link on 'Accounts Expand'$")
    public void clickAdminsLinkOnAccountsExpand() throws Throwable {
        dashboard.clickAdminsOption();
    }

    @And("^Click 'PRINT' button on 'admin management' page$")
    public void clickPRINTButtonOnAdminManagementPage() throws Throwable {
        dashboard.clickPrintOption();
    }

    @And("^Click 'Blog' link on 'Blog Categories' Page$")
    public void cliccBlogLinkOnBlogCategoriesPage() {
        dashboard.clickBlogExpand();
        dashboard.clickOnPostsOption();
        //dashboard.clickBlogCategoriesOption();
    }

    @And("^Move Down The Sidebar Menu$")
    public void moveDownTheSidebarMenu() {
        dashboard.moveTheScrollSidebarToDown();
    }

    @And("^Click 'Blog' menu$")//TesteCase 01
    public void clickBlogMenu() {
        dashboard.clickBlogExpand();
    }

    @And("^Click 'Blog' link on 'Posts' Page$") //TestCase 02
    public void clickBlogLinkOnPostsPage() {
        dashboard.clickOnPostsOption();
    }

    @And("^Click 'Posts' link on Table Header Name$")       //TestCase 03
    public void clickPostsLinkOnTableHeaderName() {
        dashboard.clickOnTableHeaderName();
    }

    @And("^Click 'Posts' link on Table Header Category$")   //TestCase 04
    public void clickPostsLinkOnTableHeaderCategory() {
        dashboard.clickOnTableHeaderCategory();
    }

    @And("^Click 'Posts' link on Table Header Date$")       //TestCase 05
    public void clickPostsLinkOnTableHeaderDate() {
        dashboard.clickOnTableHeaderDate();
    }

    @And("^Click 'Posts' link on Table Header Order$")      //TestCase 06
    public void clickPostsLinkOnTableHeaderOrder() {
        dashboard.clickOnTableHeaderOrder();
    }

    @And("^Click 'Posts' link on Table Header Status$")     //TestCase 07
    public void clickPostsLinkOnTableHeaderStatus() {
        dashboard.clickOnTableHeaderStatus();
    }

    @And("^Click 'Posts' link on Table Header Thumb$")      //TestCase 08
    public void clickPostsLinkOnTableHeaderThumb() {
        dashboard.clickOnTableHeaderThumb();
    }

    @Given("^I load NASA page$")
    public void iLoadNASAPage() throws Throwable {
        dashboard = LoadPage.loadNASApage();
    }

    @And("^Click NASA API Listing$")
    public void clickNASAAPIListing() throws Throwable {
        dashboard.clickOnNasaApiListing();
        avoidToSecond(3);
        dashboard.clickOnNasaApiListing(); //Click NASA API Listing (segunda vez)
    }

    @And("^Click on MENU Earth$")
    public void clickOnMENUEarth() {
        avoidToSecond(3);
        dashboard.clickOnMenuEarth();
    }

    //clickOnMenuEarth

}
