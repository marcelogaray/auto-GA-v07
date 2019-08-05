/**
 * @author: jricaldi
 */

package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testingui.diplomadoumss.org.manageevents.Event;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class ReviewsManagement {

    WebDriver webDriver;

    @FindBy(xpath = "//*[@href='#Tours']")
    private WebElement clickReviewsSelected;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin/tours/reviews']")
    private WebElement clickReviews;

    public ReviewsManagement(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void clickReviewManageBoard() {
        avoidToUse(4);
        clickWebElement(clickReviewsSelected);
        avoidToUse(3);
        clickWebElement(clickReviews);
    }

}