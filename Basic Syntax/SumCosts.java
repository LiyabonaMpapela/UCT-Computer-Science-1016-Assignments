//Adds up amounts entered by user
// Name: Liyabona Mpapela
// Student Number: MPPLIY002
// Date: 3 October 2023

import java.util.Scanner;
public class SumCosts
{
 public static void main (String[] args)
 {
  Scanner keyboard = new Scanner(System.in);
   String amount="0";
  Currency rand = new Currency("R", "ZAR", 100);
  Money total = new Money("R0.00",rand);
 char firstChar= amount.charAt(0);
  while (((firstChar+"").equalsIgnoreCase("D"))==false) 
  {
   System.out.println("Enter an amount or '[D]one' to print the sum and quit:");
   amount=keyboard.nextLine();
   if ((amount.charAt(0)+"").equalsIgnoreCase("D")==true)
   {
    break;
   }
   Money money = new Money(amount,rand);
   total=total.add(money);
  
   
   }
  System.out.println("Total: "+total);
 }
}
