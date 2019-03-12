package com.fonowizja.kalkulator;

import java.math.BigInteger;

/**
 * @author krzysztof.kramarz
 */
class Calculator
{
   public String sum(Integer firtsNumber, Integer secondNumber) throws IllegalArgumentException
   {
      if (firtsNumber != null && secondNumber != null)
      {
         BigInteger bigInteger1 = BigInteger.valueOf(firtsNumber);
         BigInteger bigInteger2 = BigInteger.valueOf(secondNumber);
         return String.valueOf(bigInteger1.add(bigInteger2));
      }
      else
      {
         throw new IllegalArgumentException("Argument mustn't be know");
      }
   }

   public String substract(Integer firtsNumber, Integer secondNumber) throws IllegalArgumentException
   {
      if (firtsNumber != null && secondNumber != null)
      {
         BigInteger bigInteger1 = BigInteger.valueOf(firtsNumber);
         BigInteger bigInteger2 = BigInteger.valueOf(secondNumber);
         return String.valueOf(bigInteger1.subtract(bigInteger2));
      }
      else
      {
         throw new IllegalArgumentException("Argument mustn't be know");
      }
   }

   public String multiplication(Integer firtsNumber, Integer secondNumber)
   {
      if (firtsNumber != null && secondNumber != null)
      {
         BigInteger bigInteger1 = BigInteger.valueOf(firtsNumber);
         BigInteger bigInteger2 = BigInteger.valueOf(secondNumber);
         return String.valueOf(bigInteger1.multiply(bigInteger2));
      }
      else
      {
         throw new IllegalArgumentException("Argument mustn't be know");
      }
   }
}
