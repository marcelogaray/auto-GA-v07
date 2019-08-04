package testingui.diplomadoumss.org.managepage.nasapage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class NasaPage extends BasePage {

    @FindBy(xpath = "//ul[@class='tocify-header']//li[@class='tocify-item']//a[contains(., 'NASA API Listing')]")
    private WebElement clickNasaApiListing;

    @FindBy(xpath = "//ul[@class='tocify-header']//li[@class='tocify-item']//a[contains(., 'Earth')]")
    private WebElement clickEarth;

    @FindBy(xpath = "//ul[@class='tocify-subheader']//li[@class='tocify-item']//a[contains(., 'Imagery')]")
    private WebElement clickImagery;

    public NasaPage clickNasaApiListingOption() {
        clickWebElement(clickNasaApiListing);
        return this;
    }

    public NasaPage clickEarthOption() {
        clickWebElement(clickEarth);
        return this;
    }

    public NasaPage clickImageryOption() {
        clickWebElement(clickImagery);
        return this;
    }
}
