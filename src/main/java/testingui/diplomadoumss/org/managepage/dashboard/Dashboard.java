package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.leftPanel.hotels.reviews.Hotels;

public class Dashboard extends BasePage {

    @FindBy(xpath = "//*[@href='#Hotels']")
    private WebElement clickReviewsSelected;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin-portal/admin/hotels/reviews']")
    private WebElement clickReviews;

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

}
