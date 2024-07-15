//Assignment 6, exercise 1: Craete duration range
//Name: Liyabona Mpapela
//Student number: MPPLIY002
//Date: 2 August 2023

public class TimePeriod{
//create instance variables
 private Duration lowerBound;
 private Duration upperBound;
 
 // Create a TimePeriod with the given inclusive lower bound and exclusive upper bound
 public TimePeriod(Duration lowerBound, Duration upperBound)
 {
  this.lowerBound= lowerBound;
  this.upperBound = upperBound;
 }
 
 // Obtain the lower bound for this time period
 public Duration lowerBound()
 { 
  return lowerBound;
 }
 
 // Obtain the upper bound for this time period.
 public Duration upperBound()
 {
  return upperBound;
 }
  
 // Determine whether the given duration falls within this time period
 public boolean includes(Duration duration)
 {
   return ((lowerBound().compareTo(duration)<=0)&& (duration.compareTo(upperBound())<0 ));
 }
 
 // Determine whether this time period precedes the other time period 
 public boolean precedes(TimePeriod other)
 
 {
   return (this.upperBound().compareTo(other.lowerBound())<0)||this.upperBound().compareTo(other.lowerBound())==0;
  
 }
 
 // Determine whether this time period is adjacent to the other time period
 public boolean adjacent(TimePeriod other)
 {
  if (this.upperBound().compareTo(other.lowerBound())==0 || this.lowerBound().compareTo(other.upperBound())==0)
  {
   return true;
  }
 
  return false;
  

 }
 
 //Obtain the string representation of this TimePeriod object
 public String toString()
 {
  return "["+Duration.format(lowerBound,"minute")+" .. "+Duration.format(upperBound,"minute")+"]";
 }

}