//Calculate difference in time
// Name: Liyabona Mpapela
// Student Number: MPPLIY002
// Date: 3 October 2023

import java.util.Scanner;
public class CalculateDuration
{
 public static void main (String[] args)
 {
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Enter time A:");
  String timeA=keyboard.nextLine();
  System.out.println("Enter time B:");
  
  String timeB=keyboard.nextLine();
  
  Time tA = new Time(timeA);
  Time tB = new Time(timeB);
  Duration difference = tB.subtract(tA);
  
  System.out.println("The time "+tB.toString()+" occurs "+ difference.intValue("minutes")+ " minutes after the time "+ tA.toString()+".");

 }
}