public class CowsAndBulls{

//instance variables

public final static int NUM_DIGITS = 4;
public final static int MAX_VALUE = 9876;
public final static int MIN_VALUE = 1234;
public final static int MAX_GUESSES = 10;
private int guesses;
private int seed;
private int mysteryNum;
private boolean guessed=false;
boolean over= false;

// Create a CowsandBulls game using the given randomisation see value to generate a mystery number
public CowsAndBulls(int seed)
{
 this.seed= seed;
 this.mysteryNum=0;
 guesses= MAX_GUESSES;
 NumberPicker numPicker= new NumberPicker(seed,1,9);
  for (int i=0; i< NUM_DIGITS; i++)
 {
  this.mysteryNum= (this.mysteryNum*10)+ numPicker.nextInt();
 }

}


//Obtain the number of guesses remaining
public int guessesRemaining()
{
 return guesses;
}

//Evaluate a guess that the mystery number is guessNumber, returning the outcome in the form of a Result object
public Result guess(int guessNumber)
{
 if (guesses==0)
 {
   over=true;
  throw new RuntimeException("CowsAndBulls : guess :game over");
 }
 else
 {
    int cows;
    int bulls;
    
    cows= NumberUtils.countIntersect(guessNumber, mysteryNum);
    bulls = NumberUtils.countMatches(guessNumber, mysteryNum);
    cows = cows - bulls;
    guesses= guesses-1;
    
    if (guessNumber== this.mysteryNum)
    {
     over = true;
    }
    
    Result result = new Result(cows, bulls);
    return result;
   }
  }
   
   //End the game and return the secretNumber
   public int giveUp()
   {
    over=true;
    return this.mysteryNum;
   }


//return true if the secrete number has been guessed or there are no more guesses
public boolean gameOver()
{
  
 return over;
}









}