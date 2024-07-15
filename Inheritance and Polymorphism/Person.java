public class Person
{
 //instance variables
 public String name;
 public int age;
 public String gender;
 
 //Copy constructor pf person object
 public Person(Person original)
 {
  this(original.name, original.age, original.gender);
 }

  //Constructor to instatntiate the Person object
 public Person (String name, int age, String gender)
 {
  this.name= name;
  this.age= age;
  this.gender= gender;
 }

 //accessor method to accsess the name of the person
 public String getName()
 {
  return this.name;
 }
 
 //accessor method to access age of the person
  public int getAge()
 {
  return this.age;
 }
 
 //accessor method to access gender of the person
  public String getGender()
 {
  return this.gender;
 }
 
 //nutator method to change nsme of the person
  public void setName(String name)
 {
  this.name=name;
 }
 
 //nutator method to change age of the person
  public void setAge(int age)
 {
  this.age=age;
 }

 //nutator method to change gender of the peron
  public void setGender(String gender)
 {
  this.gender= gender;
 }

}
