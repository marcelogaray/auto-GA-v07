package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.leftPanel.NasaApiListing;
import testingui.diplomadoumss.org.managepage.leftPanel.hotels.reviews.Hotels;
import testingui.diplomadoumss.org.managepage.login.Login;

public class LoginStepDef {

    private Login login;
    private Dashboard dashboard;

    private NasaApiListing nasaApiListing;


    @Given("^I load First Page$")
    public void iLoadNASAPage() {
        dashboard = LoadPage.loadNASAPage();
    }

    @And("^click NASA API Listing$")
    public void clickNasaApiListing() {
        nasaApiListing = dashboard.setLeftNasaPanel();
    }

    @And("^click NASA API Again$")
    public void clickNasaApiAgain() {
        nasaApiListing = dashboard.clickNasaApiAgain();
    }

    @And("$click on Earth^")
    public void clickOnEarth() {

    }
}
