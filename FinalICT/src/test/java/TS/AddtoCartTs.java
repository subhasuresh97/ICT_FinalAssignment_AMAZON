package TS;

import Dp.DpLogin;
import POM.AddtoCart;
import POM.Search;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.Test;
import webdriver.Common;




//public class AddCartTestScript extends Common {
//    @Test(dataProvider = "aDdToCaRt", dataProviderClass = DpLogin.class)
//    public void AddToCart(String prdt) throws InterruptedException {
//        AddtoCart addCart = new AddtoCart(driver);
//        int crtnum = addCart.cartnum();
//        Assert.assertEquals(crtnum, 0);
//        Search search = new Search(driver);
//        //searchitemfun
//        search.searchitem(prdt);
//        //resultpagefunc
//        String Srchrslt = search.CheckResultPage();
//        //verifyUsershouldbeincorrectpage
//        Assert.assertEquals(Srchrslt, prdt);
//        ProductDetails productDetails = new ProductDetails(driver);
//        //item list gettext
//        String itemlist = productDetails.itemlist();
//        //clicking in item list
//        productDetails.prdtdts();
//        //changetab
//        productDetails.changetab();
//        //getcorrectproducttext
//        String crctitm = productDetails.chkprdtitm();
//        //checkingPrdtDetailsMatchWithItemdetails
//        Assert.assertEquals(crctitm, itemlist);
//        //clickitemquantityto3
//        addCart.changequntitytothree();
//        //clickingAddtoCart
//        addCart.clickaddtocart();
//        //getupdatedquantity
//        String NAVCRTNUM = addCart.getquantity();
//        //checking3withupdatedquantity
//        Assert.assertEquals(NAVCRTNUM, "3");
//    }
//}













public class AddtoCartTs extends Common {
    @Test(dataProvider = "addtocart",dataProviderClass = DpLogin.class)
    public void addtocartitem(String Itemtocart)throws InterruptedException

    {

        AddtoCart cart=new AddtoCart(driver);
        cart.add(Itemtocart);
       int c= cart.cartnum();
        Assert.assertEquals(c,0);
    //cart.changequntitytothree();

    }

}
