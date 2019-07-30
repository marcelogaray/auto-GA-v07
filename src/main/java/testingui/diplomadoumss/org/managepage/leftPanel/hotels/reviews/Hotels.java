/**
 * @author: jricaldi
 */

package testingui.diplomadoumss.org.managepage.leftPanel.hotels.reviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;

public class Hotels {

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnAddReviews;


    public Hotels btnAddReviews(){
        Event.clickWebElement(btnAddReviews);
        return new Hotels();
    }

    public Hotels addBtn() {
        return  btnAddReviews();
    }

}