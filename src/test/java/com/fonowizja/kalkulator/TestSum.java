package com.fonowizja.kalkulator;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * @author krzysztof.kramarz
 */
@Test
public class TestSum
{

   // @BeforeSuite
   // static
   // {
   //    Calculator calculator = new Calculator();
   //
   // }
   @Test
   public void testSumPositive()
   {
      int firtsNumber = 1;
      int seconfNummber = 1;
      String expect = "2";

      Calculator calculator = new Calculator();
      String result = calculator.sum(firtsNumber, seconfNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testSumNegative()
   {
      int firtsNumber = 1;
      int seconfNummber = 1;
      String expect = "3";

      Calculator calculator = new Calculator();
      String result = calculator.sum(firtsNumber, seconfNummber);
      assert (!result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testSubstractionPositive()
   {
      int firtsNumber = 1;
      int seconfNummber = 1;
      String expect = "0";

      Calculator calculator = new Calculator();
      String result = calculator.substract(firtsNumber, seconfNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 0 ";
   }

}

