public class Ticket{
//instance variables
private String id;
private Time issueTime;

//gets the values of the instance variables and sets the values to the instance variables
public Ticket(Time currentTime, String ID){
 this.issueTime= currentTime;
 this.id=ID;
} 

//returns the ID
public String ID(){
 return this.id;
}

//Calculates how long has the driver been parking 
public Duration age(Time currentTime){
 Duration age= currentTime.subtract(issueTime);//subtracts the time of when ticket was issued from the current time
 return age;
}

//returns output in the required form
public String toString(){
 return "Ticket[id="+id+", time="+issueTime+"]";
}
}