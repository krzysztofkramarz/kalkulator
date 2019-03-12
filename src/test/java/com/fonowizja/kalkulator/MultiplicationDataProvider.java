package com.fonowizja.kalkulator;

import org.testng.annotations.DataProvider;

/**
 * @author krzysztof.kramarz
 */

public class MultiplicationDataProvider
{
   @DataProvider
   public Object[][] multiplicationDataProvider()
   {

      return new Object[][] {
            { 0, 0, "0" },
            { 0, 1, "0" },
            { 1, 0, "0" },
            { 1, 1, "1" },
            { 1, 2, "2" },
            { 2, 1, "2" },
            { 2, 2, "4" },
            { 10, 10, "100" },
            { -1, 0, "0" },
            { 0, -1, "0" },
            { -1, -1, "1" },
            { 1, -1, "-1" },
            { -1, 1, "-1" },
            { 7, 7, "49" },
            { -7, 7, "-49" },
            { Integer.MAX_VALUE, 10, "21474836470" }

      };
   }

}

