//Assignment 6, exercise 3: records parking tariffs for a pay-to-stay car park
//Name: Liyabona Mpapela
//Student number: MPPLIY002
//Date: 2 August 2023

public class TariffTable{

 private ParkingTariff[] parkingTariffs;
 private int nextFree ;//next empty space of the array

// Create a TariffTable with the given number of entries and initialise numTariff to 0
 public TariffTable(int maxSize){
  parkingTariffs = new ParkingTariff[maxSize];
  nextFree=0;
 }

 public void addTariff(TimePeriod period, Money tariff){
  ParkingTariff parkingtariff = new ParkingTariff(period, tariff);//instanciates the ParkingTarrif object
  
 // TimePeriod lastperiod= table[numTariff-1].getPeriod();//gets the last period on the array
  //checks if its the first entry of the parking tarrif or if the the period provided is adjacent to the previous added period and if it follows the previous period 
  if ((nextFree==0)|| ((period.adjacent(parkingTariffs[nextFree-1].getPeriod())) && ((parkingTariffs[nextFree-1].getPeriod()).precedes(period))))
  {
   parkingTariffs[nextFree]=  parkingtariff;//add tariff for given period to table
   nextFree = nextFree+1;//increase numTarrif
  }
  else
  {
   throw new IllegalArgumentException("Tariff periods must be adjacent."); 
  }
  
 }
 
 //Obtain tariff for the given length of stay
 public Money getTariff( Duration lengthOfStay){
  
 for (int i=0; i<nextFree; i++) //loops through the indexes of the array that have 
 {
  if (parkingTariffs[i].getPeriod().includes(lengthOfStay))//checks if the period includes the length of dtay provided by thr user
  {
   return parkingTariffs[i].getCost(); //returns the tarrif of that time period 
  }
 }
 return null ;//return nothing
 }
 
 //Obtain a String representation of this tariffTable
 public String toString(){      
 String out="";//creates an empty string
 if (nextFree == 0) {
        return "";
    }
  for (int i=0 ; i<nextFree-1; i++)//loops through the indexes of the array that have
  {
   out=out+ parkingTariffs[i].getPeriod().toString()+" : "+parkingTariffs[i].getCost().toString()+"\n";
  }
  out=out+ parkingTariffs[nextFree-1].getPeriod().toString()+" : "+parkingTariffs[nextFree-1].getCost().toString();
  return out;
 }
 
 
}