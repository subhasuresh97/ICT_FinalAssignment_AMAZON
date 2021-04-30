package TS;

import Dp.DpLogin;
import POM.Search;
import POM.SearchBook;
import org.testng.annotations.Test;
import webdriver.Common;

public class SearchBookTs extends Common {

  @Test(dataProvider = "sbook",dataProviderClass = DpLogin.class)
  public void searchbk(String b) throws InterruptedException {

        SearchBook sb=new SearchBook(driver);
        sb.book(b);
        Thread.sleep(4000);
    }
}
