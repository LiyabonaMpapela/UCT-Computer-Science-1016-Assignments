public class ParkingTarrif{
 TimePeriod period;
 Money cost;
 
 ParkingTarrif(TimePeriod period, Money cost)
 {
  this.period=period;
  this.cost=cost;
 }

 public Money getcost() {
  return this.cost;
 }
 
 public TimePeriod getperiod(){
  return this.period;
 }
}