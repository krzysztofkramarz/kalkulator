package com.fonowizja.kalkulator;

import org.testng.annotations.Test;

/**
 * @author krzysztof.kramarz
 */
public class TestMultiplication
{

   @Test(dataProviderClass =MultiplicationDataProvider.class , dataProvider = "multiplicationDataProvider")
   public void testParametrized(Integer firtsNumber, Integer secondNummber, String expect){

      Calculator calculator = new Calculator();
      String result = calculator.multiplication(firtsNumber, secondNummber);

      assert (result.equals(expect)) : String.format("wynik mnożenia jest niewłasciwy, %d razy %d powinien być %s, a jest %s", firtsNumber, secondNummber, expect, result ) ;
   }


   @Test
   public void testMultiplicationPositive()
   {
      int firtsNumber = 1;
      int seconfNummber = 1;
      String expect = "1";

      Calculator calculator = new Calculator();
      String result = calculator.multiplication(firtsNumber, seconfNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testMultiplicationPositive2()
   {
      int firtsNumber = 1;
      int secondNummber = 0;
      String expect = "0";

      Calculator calculator = new Calculator();
      String result = calculator.multiplication(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testMultiplicationPositive5()
   {
      int firtsNumber = 1;
      int secondNummber = 2;
      String expect = "2";

      Calculator calculator = new Calculator();
      String result = calculator.multiplication(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }
   @Test
   public void testMultiplicationPositive6()
   {
      int firtsNumber = 0;
      int secondNummber = 2;
      String expect = "0";

      Calculator calculator = new Calculator();
      String result = calculator.multiplication(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testMultiplicationPositive3()
   {
      int firtsNumber = -10;
      int secondNummber = -20;
      String expect = "200";

      Calculator calculator = new Calculator();
      String result = calculator.multiplication(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testMultiplicationPositive4()
   {
      int firtsNumber = 0;
      int secondNummber = 0;
      String expect = "0";

      Calculator calculator = new Calculator();
      String result = calculator.multiplication(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testMultiplicationPositiveBigNumber()
   {
      Integer firtsNumber = 2147483647;
      Integer  secondNummber = 10;
      String expect = "21474836470";

      Calculator calculator = new Calculator();
      String result = calculator.multiplication(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testMultiplicationPositiveBigNumberMinus()
   {
      Integer firtsNumber = -2147483648;
      Integer  secondNummber = -10;
      String expect = "21474836480";

      Calculator calculator = new Calculator();
      String result = calculator.multiplication(firtsNumber, secondNummber);
      assert (result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }


   @Test
   public void testMultiplicationNull()
   {
      Integer firtsNumber = null;
      Integer secondNummber = null;
      String expect = null;

      Calculator calculator = new Calculator();
      try
      {
         String result = calculator.multiplication(firtsNumber, secondNummber);

      }
      catch (IllegalArgumentException e)
      {

         assert (null == expect) : "wynik dodawania 1 + 1 powinien byc 2 ";
      }
   }

   @Test
   public void testMultiplicationNegative()
   {
      int firtsNumber = 1;
      int seconfNummber = 1;
      String expect = "3";

      Calculator calculator = new Calculator();
      String result = calculator.multiplication(firtsNumber, seconfNummber);
      assert (!result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testMultiplicationNegative3()
   {
      int firtsNumber = 1;
      int seconfNummber = 27;
      String expect = "29";

      Calculator calculator = new Calculator();
      String result = calculator.multiplication(firtsNumber, seconfNummber);
      assert (!result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testMultiplicationNegative4()
   {
      int firtsNumber = -3;
      int seconfNummber = 4;
      String expect = "12";

      Calculator calculator = new Calculator();
      String result = calculator.multiplication(firtsNumber, seconfNummber);
      assert (!result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

   @Test
   public void testMultiplicationNegative2()
   {
      int firtsNumber = 2147483647;
      int seconfNummber = 8888;
      String expect = "-21474836472147483647";

      Calculator calculator = new Calculator();
      String result = calculator.multiplication(firtsNumber, seconfNummber);
      assert (!result.equals(expect)) : "wynik dodawania 1 + 1 powinien byc 2 ";
   }

}
