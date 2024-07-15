import java.util.*; //import the java util 
public class Employee{
 
 //instance variables
 private String name;
 private String uid;
 
 private CalendarTime start;
 private CalendarTime finish;
 private Shift[] shiftList= new Shift[1000];
 int next=0;
 private boolean present;

 //Create an Employee representing the employee with the given bane and UID 
 public Employee(String name, String uid)
 {
  this.name= name;
  this.uid= uid;
 }
 
 //Obtain this employee's name
 public String name()
 {
  return this.name;
 }
 
 
 
 public String UID()
 {
  return this.uid;
 }
 
 //record that this employee has begun a shift on the given date and time
 public void signIn(Date d, Time t)
 {
  start= new CalendarTime(d,t);
  present = true;
 }
 
 //record that this employee has completed a shift on a given date and at the given date and time
 public void signOut(Date d, Time t)
 {
  finish = new CalendarTime(d,t);
  Shift shift = new Shift(start, finish);
  present = false;
  shiftList[next]=shift;
  next++;
 }

 //Determine whether this employee is present 
 public boolean present()
 {
  if (present==true)
  {
   return true;
  }
 return false;
 
 }
 
 //Determine whether this employee worked a shift that at least partly occured on the given date 
 public boolean worked(Date d)
 {
  for (int i=0; i<next; i++)
  {
    if (shiftList[i].includesDate(d))
    {
     return true;
    }
  }
 return false;
 }

 //Determine whether this employee worked at least one shift during the given week
 public boolean worked (Week w)
 {
  for (int i=0; i<next; i++)
  {
    if (shiftList[i].inWeek(w))
    {
     return true;
    }
  }
 return false;
 }

//Obtain the shifts worked by this employee that at least partly occurred on the given date
public List<Shift> get(Date d)
{
 List<Shift> dateList = new ArrayList<Shift>(); 

 for (int i=0; i<next; i++)
  {
    if (shiftList[i].includesDate(d))
    {
     dateList.add(shiftList[i]);
    }
  }
 return dateList;

}

//Obtain a list of the shifts worked by this employee during the given week
public List<Shift> get(Week w)
{
 List<Shift> weekList = new ArrayList<Shift>(); 
  for (int i=0; i<next; i++)
  {
    if (shiftList[i].inWeek(w))
    {
     weekList.add(shiftList[i]);
    }
  }
 return weekList;
 
}

//Returns the total time worked during the given week
public Duration hours(Week w)
{
 List<Shift> weekList= get(w);
 Duration numHours = new Duration(0);
  for(Shift shift:weekList)
  {
   Duration hours= new Duration(shift.length());
   numHours=numHours.add(shift.length());
  } 
 
 return numHours;
}

}