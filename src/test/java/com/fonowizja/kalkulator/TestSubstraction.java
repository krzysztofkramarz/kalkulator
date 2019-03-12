package com.fonowizja.kalkulator;

import org.testng.annotations.Test;

/**
 * @author krzysztof.kramarz
 */
public class TestSubstraction
{
   @Test
   public void testsubstractPositive()
   {
      int firtsNumber = 1;
      int seconfNummber = 1;
      String expect = "0";

      Calculator calculator = new Calculator();
      String result = calculator.substract(firtsNumber, seconfNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testsubstractPositive2()
   {
      int firtsNumber = -10;
      int secondNummber = 10;
      String expect = "-20";

      Calculator calculator = new Calculator();
      String result = calculator.substract(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testsubstractPositive3()
   {
      int firtsNumber = -10;
      int secondNummber = -10;
      String expect = "0";

      Calculator calculator = new Calculator();
      String result = calculator.substract(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testsubstractPositive4()
   {
      int firtsNumber = -10;
      int secondNummber = 15;
      String expect = "-25";

      Calculator calculator = new Calculator();
      String result = calculator.substract(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testsubstractPositiveBigNumber()
   {
      Integer firtsNumber = 2147483647;
      Integer  secondNummber = -10;
      String expect = "2147483657";

      Calculator calculator = new Calculator();
      String result = calculator.substract(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testsubstractPositiveBigNumberMinus()
   {
      Integer firtsNumber = -2147483648;
      Integer  secondNummber = 10;
      String expect = "-2147483658";

      Calculator calculator = new Calculator();
      String result = calculator.substract(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }


   @Test
   public void testsubstractNull()
   {
      Integer firtsNumber = null;
      Integer secondNummber = null;
      String expect = null;

      Calculator calculator = new Calculator();
      try
      {
         String result = calculator.substract(firtsNumber, secondNummber);

      }
      catch (IllegalArgumentException e)
      {

         assert (null == expect) : "wynik dodawania 1 + 1 powinien byc 2 ";
      }
   }

   @Test
   public void testsubstractNegative()
   {
      int firtsNumber = 1;
      int seconfNummber = 1;
      String expect = "3";

      Calculator calculator = new Calculator();
      String result = calculator.substract(firtsNumber, seconfNummber);
      assert (!result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testsubstractNegative2()
   {
      int firtsNumber = 2147483647;
      int seconfNummber = 8888;
      String expect = "-21474836472147483647";

      Calculator calculator = new Calculator();
      String result = calculator.substract(firtsNumber, seconfNummber);
      assert (!result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }
}
