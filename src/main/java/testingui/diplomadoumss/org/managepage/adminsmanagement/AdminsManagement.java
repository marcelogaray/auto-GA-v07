package testingui.diplomadoumss.org.managepage.adminsmanagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToSecond;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

public class AdminsManagement extends BasePage {

    @FindBy(xpath = "//div[@class='xcrud-top-actions']//div[@class='btn-group pull-right']//a[contains(., 'Print')]")
    private WebElement printClicked;

    public AdminsManagement() {
        avoidToSecond(4);
    }

    public AdminsManagement clickPrintOption() {
        clickWebElement(printClicked);
        return this;
    }
}
