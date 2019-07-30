package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.leftPanel.NasaApiListing;
import testingui.diplomadoumss.org.managepage.leftPanel.hotels.reviews.Hotels;

public class Dashboard extends BasePage {

    @FindBy(xpath = "//*[@href='#Hotels']")
    private WebElement clickReviewsSelected;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin-portal/admin/hotels/reviews']")
    private WebElement clickReviews;

    @FindBy(xpath = "//button[contains(text(),'Print')]")
    private WebElement clickPrinting;

    @FindBy(xpath = "//ul[@id='tocify-header1']//a[contains(text(), 'NASA API Listing')]")
    private WebElement clickApiListing;

    @FindBy(xpath = "//ul[@id='tocify-header1']//a[contains(text(), 'NASA API Listing')]")
    private WebElement clickApiAgain;

    public Dashboard(){
       Event.avoidToUse(5000);
    }

    public Hotels clickReviews() {
        Event.clickWebElement(clickReviewsSelected);
        Event.clickWebElement(clickReviews);
        return new Hotels();
    }

    public Hotels setLeftPanel() {
        return  clickReviews();
    }

    public NasaApiListing clickNasaApiListening() {
        Event.clickWebElement(clickApiListing);
        //Event.avoidToUse(2000);
        return new NasaApiListing();
    }

    public NasaApiListing setLeftNasaPanel() {
        return clickNasaApiListening();
    }

    public NasaApiListing clickNasaApiAgain() {
        Event.clickWebElement(clickApiAgain);
        return new NasaApiListing();
    }

}
