package com.fonowizja.kalkulator;

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
   public void testSumPositive2()
   {
      int firtsNumber = -10;
      int secondNummber = 10;
      String expect = "0";

      Calculator calculator = new Calculator();
      String result = calculator.sum(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testSumPositive3()
   {
      int firtsNumber = -10;
      int secondNummber = -20;
      String expect = "-30";

      Calculator calculator = new Calculator();
      String result = calculator.sum(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testSumPositive4()
   {
      int firtsNumber = -10;
      int secondNummber = -10;
      String expect = "-20";

      Calculator calculator = new Calculator();
      String result = calculator.sum(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testSumPositiveBigNumber()
   {
      Integer firtsNumber = 2147483647;
      Integer  secondNummber = 10;
      String expect = "2147483657";

      Calculator calculator = new Calculator();
      String result = calculator.sum(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testSumPositiveBigNumberMinus()
   {
      Integer firtsNumber = -2147483648;
      Integer  secondNummber = -10;
      String expect = "-2147483658";

      Calculator calculator = new Calculator();
      String result = calculator.sum(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }


   @Test
   public void testSumNull()
   {
      Integer firtsNumber = null;
      Integer secondNummber = null;
      String expect = null;

      Calculator calculator = new Calculator();
      try
      {
         String result = calculator.sum(firtsNumber, secondNummber);

      }
      catch (IllegalArgumentException e)
      {

         assert (null == expect) : "wynik dodawania 1 + 1 powinien byc 2 ";
      }
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
   public void testSumNegative2()
   {
      int firtsNumber = 2147483647;
      int seconfNummber = 8888;
      String expect = "-21474836472147483647";

      Calculator calculator = new Calculator();
      String result = calculator.sum(firtsNumber, seconfNummber);
      assert (!result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }




}

