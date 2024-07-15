public class Car extends Vehicle
{
 //instance variables
 private double weight;
 private int capacity;
 
  //Constructor to instantiate Car object
 Car(int numCylinder, String maker, Student owner,int passengers, double carWeight)
 {
  super(numCylinder, maker, owner);
  weight= carWeight;
  capacity= passengers;
 }
 
 //Copy constructor
 Car(Car original)
 {
  this(original.cylinders, original.manufacturer, original.owner, original.capacity, original.weight);
 }

//return details about the car
public String toString()
{
 return (super.toString() +  "\n" +"The car is a "+capacity+ "-seater weighing "+ weight+" kg");
 
}



}