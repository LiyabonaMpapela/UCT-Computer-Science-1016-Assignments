public class Student extends Person
{
 //instance variables
 private String nameOfInstitution;
 private String programOfStudy;
 private int yearOfStudy;
 private String hobbies;
 
 //Copy constructor 
 Student(Student original)
 {
  this(original.name, original.age, original.gender, original.nameOfInstitution, original.programOfStudy, original.yearOfStudy, original.hobbies);
 }

 //Constructor to intstiate a student object
 Student (String name, int age, String gender, String nameOfInstitution, String programOfStudy, int yearOfStudy, String hobbies)
 {
  super(name, age, gender);
  this.nameOfInstitution= nameOfInstitution;
  this.programOfStudy = programOfStudy;
  this.yearOfStudy= yearOfStudy;
  this.hobbies= hobbies;
 } 

 //Accessor method to access the name of institution of the Student
 public String getNameOfInstitution()
 {
  return this.nameOfInstitution;
 } 

 //Accessor method to access the programme of study of the Student
 public String getProgramOfStudy()
 {
  return this.programOfStudy;
 } 
 
 //Accessor method to access the year of study of the Student
 public int getYearOfStudy()
 {
  return this.yearOfStudy;
 } 

 //Accessor method to access the hobbies of the Student
 public String getHobbies()
 {
  return this.hobbies;
 } 
 
 //Mutator method for the name of the institution of the Student
 public void setNameOfInstitution(String nameOfInstitution)
 {
  this.nameOfInstitution= nameOfInstitution;
 }
 
 
 //Mutator method too change the programme of study of the Student
 public void setProgramOfStudy(String programOfStudy)
 {
  this.programOfStudy = programOfStudy;
 } 
 
 
 //Mutator method too change the year of Study of the Student
 public void setYearOfStudy(int yearOfStudy)
 {
  this.yearOfStudy= yearOfStudy ;
 } 

 
 //Mutator method too change hobbies of the Student
  public void setHobbies(String hobbies)
 {
  this.hobbies= hobbies;
 } 
}