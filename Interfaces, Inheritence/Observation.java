public class Observation implements Comparable<Observation>
{
 //instance variables
 Registration registration;
 Time time;
 
 //new Observation recording the observation of the vehicle with the given registration at the given time
 public Observation( final Registration registration, final Time time)
 {
  this.registration = registration;
  this.time=time;
 }
 
 //get the time at which the observation was made
 public Time getTime()
 {
  return time;
 }
 
 //get the registration identifier of the vehicle observed
 public Registration getIdentifier()
 {
  return registration;

 }

 //Returns true if this observation is of the vehicle with the given identifier
 public boolean isFor(final Registration identifier)
 {
  return ( this.registration.equals(identifier));
 }

 // Returns true if this observation was made between times s and e inclusive
 public boolean inPeriod(final Time s, final Time e)
 {
  return (time.compareTo(s)>=0 && time.compareTo(e)<=0);
    
 }

 // Returns true if o is an Observation and the registration and time match this observation,otherwise returns false
 public boolean equals(Object o)
 {
  if(o instanceof Observation)
  {
    Observation other = (Observation)o;
    return (this.time.equals(other.getTime()) && this.registration.equals(other.getIdentifier()));
  }
  return false;
 }

// Compares this observation to the other observation on the basis of time
public int compareTo(Observation other)
{
 int ans = this.time.compareTo(other.getTime());
 if (ans<0)
 {
  return -1;
 }
 
 if (ans>0)
 {
  return 1;
 }
 
 if (ans==0)
 {
  return 0;
 }

 return -1;
}

//returns a string of the observation instance variables
public String toString()
{
 return ("["+time+", "+registration+"]");  
 
}

}