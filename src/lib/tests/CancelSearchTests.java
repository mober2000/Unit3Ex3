package lib.tests;

import lib.CoreTestCase;
import lib.ui.CancelSearch;
import org.junit.Test;

public class CancelSearchTests extends CoreTestCase {

    @Test
    public void testCancelSearch() {

        CancelSearch CancelSearch = new CancelSearch(driver);

        CancelSearch.initSearchInput();
        CancelSearch.typeSearchLine();
        CancelSearch.FindListElementTitle();
        CancelSearch.clickCloseButton();
        CancelSearch.makeSureCloseTitles();



    }
}
