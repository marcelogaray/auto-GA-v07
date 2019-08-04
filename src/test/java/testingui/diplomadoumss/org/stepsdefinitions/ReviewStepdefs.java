/**
 * @author: jricaldi
 */

package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import testingui.diplomadoumss.org.core.InjectionContext;
import testingui.diplomadoumss.org.managepage.dashboard.ReviewsManagement;

public class ReviewStepdefs {

    InjectionContext context;
    ReviewsManagement reviewsManagement;

    public ReviewStepdefs(InjectionContext context) {
        this.context = context;
        reviewsManagement = context.getPageObjectManager().getReviewsManagePage();
    }

    @And("^Click 'Tours' link on 'Left Panel' Page$")
    public void clickToursLinkOnLeftPanelPage() {
        reviewsManagement.clickReviewManageBoard();
    }

}