package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

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

    @FindBy(xpath = "//div[@class='xcrud-top-actions']//div[@class='btn-group pull-right']//a[contains(., ' Export into CSV')]")
    private WebElement exportIntoCsvClicked;

    @FindBy(xpath = "//div[@class='xcrud-nav']//div//button[@type='button' and @data-limit='all' and contains(text(), 'All')]")
    private WebElement allClicked;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.ai_first_name']")
    private WebElement clickDescOrderFirstNameColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.ai_first_name']")
    private WebElement clickAscOrderFirstNameColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.ai_last_name']")
    private WebElement clickDescOrderLastNameColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.ai_last_name']")
    private WebElement clickAscOrderLastNameColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_email']")
    private WebElement clickDescOrderEmailColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_email']")
    private WebElement clickAscOrderEmailColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_status']")
    private WebElement clickDescOrderActiveColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_status']")
    private WebElement clickAscOrderActiveColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_last_login']")
    private WebElement clickDescOrderLastLoginColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_last_login']")
    private WebElement clickAscOrderLastLoginColumn;

    @FindBy(xpath = "//td//span[@class='btn-group']//a[@title='Edit' and @href='https://www.phptravels.net/admin/accounts/admins/edit/39']")
    private WebElement editClicked;

    @FindBy(xpath = "//td//span[@class='btn-group']//a[@title='DELETE' and @id='39']")
    private WebElement deleteClicked;

    @FindBy(xpath = "//button[@class='btn btn-success' and @type='submit' and contains(text(), 'Add')]")
    private WebElement addClicked;

    @FindBy(xpath = "//div[@class='xcrud-nav']//div//button[@type='button' and @data-limit='10' and contains(text(), '10')]")
    private WebElement number10Clicked;

    @FindBy(xpath = "//div[@class='xcrud-nav']//div//button[@type='button' and @data-limit='25' and contains(text(), '25')]")
    private WebElement number25Clicked;

    @FindBy(xpath = "//div[@class='xcrud-nav']//div//button[@type='button' and @data-limit='50' and contains(text(), '50')]")
    private WebElement number50Clicked;

    @FindBy(xpath = "//div[@class='xcrud-nav']//div//button[@type='button' and @data-limit='100' and contains(text(), '100')]")
    private WebElement number100Clicked;

    @FindBy(xpath = "//div[@class='xcrud-nav']//a[@class='xcrud-search-toggle btn btn-default' and contains(text(), 'Search')]")
    private WebElement searchClicked;

    @FindBy(xpath = "//input[@name='phrase' and @type='text']")
    private WebElement phraseTextField;

    @FindBy(xpath = "//span[@class='btn-group']//a[@data-search='1' and contains(text(), 'Go')]")
    private WebElement goClicked;

    @FindBy(xpath = "//span[@class='btn-group']//a[@data-search='0' and contains(text(), 'Reset')]")
    private WebElement resetClicked;

    @FindBy(xpath = "//a/strong[contains(text(), 'Logout')]")
    private WebElement logautLink;

    public void logoutLink() {
        clickWebElement(logautLink);
        avoidToSecond(4);
    }

    public Dashboard() {
        //isWebElementVisible(bookingLink);
        avoidToSecond(3);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(By.xpath(String.format(PANEL_LEFT_OPTION,"Hotels", "Rooms")));
        //clickWebElement(carsExpand);
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

    public Dashboard clickExportIntoCsvOption() {
        clickWebElement(exportIntoCsvClicked);
        return this;
    }

    public Dashboard clickAllOption() {
        clickWebElement(allClicked);
        return this;
    }

    public Dashboard clickDescOrderFirstNameColumnOption() {
        clickWebElement(clickDescOrderFirstNameColumn);
        return this;
    }

    public Dashboard clickAscOrderFirstNameColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickAscOrderFirstNameColumn);
        return this;
    }

    public Dashboard clickDescOrderLastNameColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickDescOrderLastNameColumn);
        return this;
    }

    public Dashboard clickAscOrderLastNameColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickAscOrderLastNameColumn);
        return this;
    }

    public Dashboard clickDescOrderEmailColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickDescOrderEmailColumn);
        return this;
    }

    public Dashboard clickAscOrderEmailColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickAscOrderEmailColumn);
        return this;
    }

    public Dashboard clickDescOrderActiveColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickDescOrderActiveColumn);
        return this;
    }

    public Dashboard clickAscOrderActiveColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickAscOrderActiveColumn);
        return this;
    }

    public Dashboard clickDescOrderLastLoginColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickDescOrderLastLoginColumn);
        return this;
    }

    public Dashboard clickAscOrderLastLoginColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickAscOrderLastLoginColumn);
        return this;
    }

    public Dashboard clickEditOption(Boolean status) {
        if (status) {
            clickWebElement(editClicked);
        }
        return this;
    }

    public Dashboard clickDeleteOption(Boolean status) {
        if (status) {
            clickWebElement(deleteClicked);
        }
        return this;
    }

    public Dashboard clickAddOption() {
        clickWebElement(addClicked);
        return this;
    }

    public Dashboard clickNumber10Option() {
        clickWebElement(number10Clicked);
        return this;
    }

    public Dashboard clickNumber25Option() {
        clickWebElement(number25Clicked);
        return this;
    }

    public Dashboard clickNumber50Option() {
        clickWebElement(number50Clicked);
        return this;
    }

    public Dashboard clickNumber100Option() {
        clickWebElement(number100Clicked);
        return this;
    }

    public Dashboard clickSearchOption() {
        clickWebElement(searchClicked);
        return this;
    }

    public Dashboard setPhrase(String phrase) {
        fielWebElement(phraseTextField, phrase);
        return this;
    }

    public Dashboard clickGoOption() {
        clickWebElement(goClicked);
        return this;
    }

    public Dashboard clickResetOption() {
        clickWebElement(resetClicked);
        return this;
    }
}
