//// Student class
// Name: Liyabona Mpapela
// Student Number: MPPLIY002
// Date: 14 August 2023

public class Student
{
 private String firstName;
 private String middleName;
 private String lastName;
 
 public void setNames(String first, String second, String third)
 {
  // Set the first, middle and last names of this Student object.
  firstName=first;
  middleName=second;
  lastName=third;
 }
 
 //Get full name of the student
 public String getFullName()
 {
  String full=firstName+" "+middleName.charAt(0)+". "+lastName;
  return full ;
 }
 
}