package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.adminsmanagement.AdminsManagement;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.header.Header;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.managepage.nasapage.NasaPage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToSecond;

public class LoginStepdefs {

    private Login login;

    private Dashboard dashboard;

    private AdminsManagement adminsManagement;

    private NasaPage nasaPage;

    private Header header;

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

    @And("^fill \"([^\"]*)\" email field on 'Login' page$")
    public void fillEmailFieldOnLoginPage(String email) throws Throwable {
        login.setEmail(email);
    }

    @And("^fill \"([^\"]*)\" password field on 'Login' page$")
    public void fillPasswordFieldOnLoginPage(String password) throws Throwable {
        login.setPassword(password);
    }

    @Then("^verify the \"([^\"]*)\" label button is displayed on 'Login' page$")
    public void verifyTheLabelButtonIsDisplayedOnLoginPage(String loginLabelButton) throws Throwable {
        String loginLabelButtonCurrent = login.getLoginLabelButton();

        Assert.assertEquals(loginLabelButtonCurrent, loginLabelButton, "Login page is verifying the 'LOGIN' label button.");
    }

    @And("^Click 'All' button to display all admins$")
    public void clickCheckAllCheckboxOnHeaderList() {
        dashboard.clickAllOption();
    }

    @And("^Click 'EXPORT INTO CSV' button on 'admin management' page$")
    public void clickEXPORTINTOCSVButtonOnAdminManagementPage() {
        dashboard.clickExportIntoCsvOption();
    }

    @And("^Click 'First Name' column on header list to 'desc' order$")
    public void clickFirstNameColumnOnHeaderListToDescOrder() {
        dashboard.clickDescOrderFirstNameColumnOption();
    }

    @And("^Click 'First Name' column on header list to 'asc' order$")
    public void clickFirstNameColumnOnHeaderListToAscOrder() {
        dashboard.clickAscOrderFirstNameColumnOption();
    }

    @And("^Click 'Last Name' column on header list to 'desc' order$")
    public void clickLastNameColumnOnHeaderListToDescOrder() throws Throwable {
        dashboard.clickAscOrderLastNameColumnOption();
    }

    @And("^Click 'Last Name' column on header list to 'asc' order$")
    public void clickLastNameColumnOnHeaderListToAscOrder() throws Throwable {
        dashboard.clickDescOrderLastNameColumnOption();
    }

    @And("^Click 'Email' column on header list to 'desc' order$")
    public void clickEmailColumnOnHeaderListToDescOrder() throws Throwable {
        dashboard.clickAscOrderEmailColumnOption();
    }

    @And("^Click 'Email' column on header list to 'asc' order$")
    public void clickEmailColumnOnHeaderListToAscOrder() throws Throwable {
        dashboard.clickDescOrderEmailColumnOption();
    }

    @And("^Click 'Active' column on header list to 'desc' order$")
    public void clickActiveColumnOnHeaderListToDescOrder() throws Throwable {
        dashboard.clickAscOrderActiveColumnOption();
    }

    @And("^Click 'Active' column on header list to 'asc' order$")
    public void clickActiveColumnOnHeaderListToAscOrder() throws Throwable {
        dashboard.clickDescOrderActiveColumnOption();
    }

    @And("^Click 'Last Login' column on header list to 'desc' order$")
    public void clickLastLoginColumnOnHeaderListToDescOrder() throws Throwable {
        dashboard.clickAscOrderLastLoginColumnOption();
    }

    @And("^Click 'Last Login' column on header list to 'asc' order$")
    public void clickLastLoginColumnOnHeaderListToAscOrder() throws Throwable {
        dashboard.clickDescOrderLastLoginColumnOption();
    }

    @And("^Click 'EDIT' button on 'admin management' page$")
    public void clickEDITButtonOnAdminManagementPage() throws Throwable {
        dashboard.clickEditOption(false);
    }

    @And("^Click 'DELETE' button on 'admin management' page$")
    public void clickDELETEButtonOnAdminManagementPage() throws Throwable {
        dashboard.clickDeleteOption(false);
    }

    @And("^Click 'ADD' button on 'admin management' page$")
    public void clickADDButtonOnAdminManagementPage() throws Throwable {
        dashboard.clickAddOption();
    }

    @Given("^I load API NASA Page$")
    public void iLoadAPINASAPage() {
        nasaPage = LoadPage.loadApiNasa();
    }

    @And("^Click NASA API Listing$")
    public void clickNASAAPIListing() {
        nasaPage.clickNasaApiListingOption();
    }

    @And("^Click NASA API Listing One More$")
    public void clickNASAAPIListingOneMore() {
        avoidToSecond(3);
        nasaPage.clickNasaApiListingOption();
    }

    @And("^click Earth Option on Left Panel$")
    public void clickEarthOptionOnLeftPanel() {
        avoidToSecond(3);
        nasaPage.clickEarthOption();
    }

    @And("^click Imagery Option On Sub Menu$")
    public void clickImageryOptionOnSubMenu() {
        nasaPage.clickImageryOption();
    }

    @And("^Click '10' button to display the list on 10 to 10$")
    public void click10ButtonToDisplayTheListOn10To10() {
        dashboard.clickNumber10Option();
    }

    @And("^Click '25' button to display the list on 25 to 25$")
    public void click25ButtonToDisplayTheListOn25To25() {
        avoidToSecond(3);
        dashboard.clickNumber25Option();
    }

    @And("^Click '50' button to display the list on 50 to 50$")
    public void click50ButtonToDisplayTheListOn50To50() {
        avoidToSecond(3);
        dashboard.clickNumber50Option();
    }

    @And("^Click '100' button to display the list on 100 to 100$")
    public void click100ButtonToDisplayTheListOn100To100() {
        avoidToSecond(3);
        dashboard.clickNumber100Option();
    }

    @And("^Click 'SEARCH' button to display the SEARCH form$")
    public void clickSEARCHButtonToDisplayTheSEARCHForm() {
        dashboard.clickSearchOption();
    }

    @And("^Set parameters on 'SEARCH' form$")
    public void setParametersOnSEARCHForm() {
        avoidToSecond(2);
        dashboard.setPhrase("Raul");

    }

    @And("^Click 'GO' button to search$")
    public void clickGOButtonToSearch() {
        avoidToSecond(2);
        dashboard.clickGoOption();
        avoidToSecond(3);
        dashboard.clickResetOption();
    }

    @And("^Click 'Logout' button on 'Header' page$")
    public void clickLogoutButtonOnHeaderPage() {
        dashboard.logoutLink();
    }
}
