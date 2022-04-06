package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class CancelSearch extends MainPageObject {

    public CancelSearch(AppiumDriver driver)
    {
        super(driver);
    }

    private static final String

            SEARCH_INIT_ELEMENT = "org.wikipedia:id/search_container",
            SEARCH_INPUT = "//*[contains(@text,'Search…')]",
            FIND_TITLE = "org.wikipedia:id/page_list_item_title",
            CLICK_CLOSE_BUTTON = "org.wikipedia:id/search_close_btn",
            MAKE_SURE_MESSAGE = "org.wikipedia:id/search_empty_message";

    public void initSearchInput()
    {
        this.waitForElementAndClick(By.id(SEARCH_INIT_ELEMENT), "Cannot find 'Search Wikipedia' input", 5);
    }

    public void typeSearchLine()
    {
        this.waitForElementAndSendKeys(By.xpath(SEARCH_INPUT), "Russia", "Cannot find search input", 5);
    }

    public void FindListElementTitle()
    {
        this.waitForElementAndFind(By.id(FIND_TITLE), "Cannot find 'Articles'", 15);
    }

    public void clickCloseButton()
    {
        this.waitForElementAndClick(By.id(CLICK_CLOSE_BUTTON), "Cannot find X to cancel search", 5);
    }

    public void makeSureCloseTitles()
    {
        this.waitForElementPresent(By.id(MAKE_SURE_MESSAGE), "Result search is not lost", 5);
    }

}
