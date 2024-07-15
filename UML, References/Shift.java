public class Shift
{
 
 private CalendarTime start;
 private CalendarTime finish;
 
 //Create aa Shift object representing a shift worked between the given date times
 public Shift (CalendarTime start, CalendarTime finish)
 {
  this.start= start;
  this.finish= finish;
 }
 //Obtain the start date and time for this shift
 public CalendarTime start()
 {
  return this.start;
 }
 
 //Obtain the end date and time for this shift
 public CalendarTime finish()
 {
  return this.finish;
 }

 //Determine whether this shift occurred within the given week
 public boolean inWeek(Week w)
 {
  return ((w.includes(start.date())) || (w.includes(finish.date())));
 }

 //Dertermines whether this shift atleast partly occured on the given date
 public boolean includesDate(Date date)
 {
  return ((start.date()).compareTo(date)<=0 && (finish.date()).compareTo(date)>=0);
 }
 
 //Obtain the length of this shift
 public Duration length()
 {
  return finish.subtract(start);
 }
 
 //Obtain a string representation of this shift 
 public String toString()
 {
  return start.date()+"%"+start.time()+" - "+finish.date()+"%"+finish.time();
 }

}