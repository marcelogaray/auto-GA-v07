package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.BroserType;
import testingui.diplomadoumss.org.core.Browser;
import testingui.diplomadoumss.org.core.DriverFactory;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class Dashboard extends BasePage {

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Accounts') and @aria-expanded='false']")
    private WebElement accountsExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='ACCOUNTS']//a[contains(., 'Admins')]")
    private WebElement adminsClicked;

    @FindBy(xpath = "//div[@class='xcrud-top-actions']//div[@class='btn-group pull-right']//a[contains(., 'Print')]")
    private WebElement printClicked;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Blog') and @aria-expanded='false']")
    private WebElement blogExpand;

    /*@FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='Blog']//a[contains(., 'Blog Categories')]")
    private WebElement blogCategoriesClicked;*/

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='Blog']//a[contains(., 'Posts')]")
    private WebElement subMenuPosts;

    @FindBy(id = "sidebar")
    private WebElement leftPanel;

    @FindBy(xpath = "//div[@class='xcrud-list-container']/table//th[contains(text(),'Name')]")
    private WebElement tableHeaderName;

    @FindBy(xpath = "//div[@class='xcrud-list-container']/table//th[contains(text(),'Category')]")
    private WebElement tableHeaderCategory;

    @FindBy(xpath = "//div[@class='xcrud-list-container']/table//th[contains(text(),'Date')]")
    private WebElement tableHeaderDate;

    @FindBy(xpath = "//div[@class='xcrud-list-container']/table//th[contains(text(),'Order')]")
    private WebElement tableHeaderOrder;

    @FindBy(xpath = "//div[@class='xcrud-list-container']/table//th[contains(text(),'Status')]")
    private WebElement tableHeaderStatus;

    @FindBy(xpath = "//div[@class='xcrud-list-container']/table//th[contains(text(),'Thumb')]")
    private WebElement tableHeaderThumb;

    @FindBy(xpath = "//div[@id='content']/div[@class='panel panel-default']/div/div/div/div/div/div/a[contains(text(),'Print')]")
    private WebElement buttonPrint;

    @FindBy(xpath = "//div[@class='tocify-wrapper']/div[@id='toc']/ul[@id='tocify-header1']/li/a[contains(., 'NASA API Listing')]")
    private WebElement menuNasaApiListing;

    @FindBy(xpath = "//div[@class='tocify-wrapper']/div[@id='toc']/ul[@id='tocify-header8']/li/a[contains(., 'Earth')]")
    private WebElement menuEarth;

    public Dashboard() {
        avoidToSecond(3);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(carsExpand);
        return this;
    }

    public Dashboard clickAccountsExpand() {
        clickWebElement(accountsExpand);
        return this;
    }

    public Dashboard clickAdminsOption() {
        clickWebElement(adminsClicked);
        return this;
    }

    public Dashboard clickPrintOption() {
        clickWebElement(printClicked);
        return this;
    }

    public Dashboard clickBlogExpand() {
        clickWebElement(blogExpand);
        return this;
    }

    /*public Dashboard clickBlogCategoriesOption() {
        clickWebElement(blogCategoriesClicked);
        return this;
    }*/

    public Dashboard clickOnPostsOption() {
        clickWebElement(subMenuPosts);
        return this;
    }

    public void moveTheScrollSidebarToDown() {
        moveToDown(leftPanel);
    }

    public void clickOnTableHeaderName() {
        clickWebElement(tableHeaderName);
    }

    public void clickOnTableHeaderCategory() {
        avoidToSecond(3);
        clickWebElement(tableHeaderCategory);
    }

    public void clickOnTableHeaderDate() {
        clickWebElement(tableHeaderDate);
    }

    public void clickOnTableHeaderOrder() {
        clickWebElement(tableHeaderOrder);
    }

    public void clickOnTableHeaderStatus() {
        clickWebElement(tableHeaderStatus);
    }

    public void clickOnTableHeaderThumb() {
        clickWebElement(tableHeaderThumb);
    }

    public void clickOnNasaApiListing() {
        clickWebElement(menuNasaApiListing);
    }

    public void clickOnMenuEarth() {
        clickWebElement(menuEarth);
    }
}
