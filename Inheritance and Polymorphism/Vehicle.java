public class Vehicle
{
 //instance variables
 public int cylinders;
 public String manufacturer;
 public Student owner;

  //Constructor to instantiate a the Vehicle object
 public Vehicle(int numCylinder, String maker, Student owner)
 {
  cylinders = numCylinder;
  manufacturer= maker;
  this.owner= owner;
 }
 
 //Copy constructor
 public Vehicle(Vehicle original)
 {
  this(original.cylinders, original.manufacturer, original.owner);
 }

 //Return deatils about the vehicle
 public String toString()
 {
  String output=manufacturer+", "+ cylinders+" cylinders, owned by "+ owner.getName()+", a "+owner.getAge()+"-year old "+owner.getGender()+" studying "+owner.getProgramOfStudy()+" at "+owner.getNameOfInstitution()+". "+owner.getName()+" likes "+owner.getHobbies()+".";
  return output;
 }
 
}