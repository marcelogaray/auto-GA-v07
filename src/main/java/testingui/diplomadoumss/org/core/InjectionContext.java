/**
 * @author: jricaldi
 */

package testingui.diplomadoumss.org.core;

public class InjectionContext {

    private PageObjectManager pageObjectManager;

    public InjectionContext() {
        pageObjectManager = new PageObjectManager(DriverManager.getInstance().getWebDriver());
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

}