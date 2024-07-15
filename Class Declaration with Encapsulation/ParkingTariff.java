 //Assignment 6, exercise 2: Develop a TariffTable
//Name: Liyabona Mpapela
//Student number: MPPLIY002
//Date: 2 August 2023

public class ParkingTariff{

 //craete instance variables
 private TimePeriod period;
 private Money cost;
 
 //Create a TimePeriod with the given inclusive lower bound and exclusive upper bound
 public ParkingTariff(TimePeriod period, Money cost)
  {
   this.period=period;
   this.cost=cost;
  }

//get method to access the cost
 public Money getCost() {
  return this.cost;
 }
//get method to access the period 
 public TimePeriod getPeriod(){
  return this.period;
 }

//accessor method to update the cost 
 public void setCost(Money cost){
  this.cost=cost;
 
 }
 
 //accessor method to update the period
 public void setPeriod(TimePeriod period){
  this.period=period;
 
 }
 
 //Obtain String representation of this ParkingTarrif object
 public String toString(){
  return period.toString()+":"+cost.toString();
 
 }
 
}
