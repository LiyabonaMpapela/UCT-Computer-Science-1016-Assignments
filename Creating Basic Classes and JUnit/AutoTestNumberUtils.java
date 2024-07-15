public class AutoTestNumberUtils{

//A private, empty bodied constructor prevents NumberUtil objects from being created
private AutoTestNumberUtils(){}

//given a number that is n digits in length, maps the digits to an array of length n
public static int[] toArray(int number)
{
 String numString= Integer.toString(number);
 
 int length= numString.length();
 int[] digitsArr= new int[length];
 for (int i=0; i<length; i++)
 {
  char digit= numString.charAt(i);
  digitsArr[i]= Integer.parseInt(String.valueOf(digit));
 }
 return digitsArr;
}

//count the quantity of matching digits with the same value and position in two numbers
public static int countMatches( int numberA, int numberB)
{
 int match=0;
 String numA = Integer.toString(numberA);
 String numB = Integer.toString(numberB);
 int length = numA.length();
 for (int i=0; i<length; i++)
 {
  char digitA = numA.charAt(i);
  char digitB = numB.charAt(i);
  if (digitA == digitB)
  {
   match++;
  }
 }
 return match;
}

//count the quantity of matching digits with the same value in two numbers
public static int counterIntersect( int numberA, int numberB)
{
 int match=0;
 String numA = Integer.toString(numberA);
 String numB = Integer.toString(numberB);
 int length = numA.length();
 for (int i=0; i<length; i++)
 {
  for (int j=0; j<length; j++)
  {
   char digitA = numA.charAt(i);
   char digitB = numB.charAt(j);
   if (digitA == digitB)
   {
    match++;
   }
  }
 }
 return match;
}


}