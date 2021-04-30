package Dp;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.DataProvider;

public class DpLogin
{


    @DataProvider(name = "validpincode")
    public static Object[][] dpvalidpincode()
    {
        return new Object[][]
                {

                        {"695011"}
                };

    }


    @DataProvider(name = "Invalidpincode")
    public static Object[][] dpInvalidpincode()
    {
        return new Object[][]
                {

                        {"1234"}
                };

    }





    @DataProvider(name = "ValidLogin")
    public static Object[][] dpvalidlogin()
    {
        return new Object[][]
                {

                        {"8086350911","subha@96"}
                };

    }


    @DataProvider(name = "searchitem")
    public static Object[][] dpsearch()
    {
        return new Object[][]
                {

                        {"iphone12"}
                };

    }

    @DataProvider(name = "addtocart")
    public static Object[][] dpaddtocart()
    {
        return new Object[][]
                {

                        {"iphone 12"}
                };

    }

    @DataProvider(name = "filter")
    public static Object[][] dpfilter()
    {
        return new Object[][]
                {

                        {"pendrive"}
                };

    }


    @DataProvider(name = "sbook")
    public static Object[][] dpsearchbook()
    {
        return new Object[][]
                {

                        {"Da Vinci code"}
                };

    }



}
