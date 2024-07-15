import java.util.Scanner;
public class Question3 
{
 public static  void main (String[] args)
 {
  Scanner input = new Scanner(System.in);//create a new Scanner object
  
  System.out.println("Enter the vehicle manufacturer:");
  String manufacturer= input.nextLine();

  System.out.println("Enter the name of the vehicle owner:");
  String name= input.nextLine();

    
  System.out.println("Enter the owner's gender:");
  String gender= input.next();
  input.nextLine();//Reads the new line in the Scanner
  
  System.out.println("Enter the owner's programme of study:");
  String programOfStudy= input.nextLine();
  
  System.out.println("Enter the owner's Institution name:");
  String institution= input.nextLine();
  
  System.out.println("Enter the owner's hobbies:");
  String hobbies= input.nextLine();
  
  
  
  
  
  System.out.println("Enter the owner's age:");
  int age= input.nextInt();
  input.nextLine();//Reads the new line in the Scanner
  
 System.out.println("Enter the number of cylinders in the engine:");
  int cylinder= input.nextInt();
  input.nextLine();//Reads the new line in the Scanner
  
  System.out.println("Enter the car seating capacity:");
  int capacity=input.nextInt();
  input.nextLine();//Reads the new line in the Scanner
  
  System.out.println("Enter the weight of the car:");
  double weight= input.nextDouble();
  input.nextLine();//Reads the new line in the Scanner
  
  Student student = new Student(name, age, gender, institution, programOfStudy, 2023, hobbies);//Creates a Student object
  Car car = new Car(cylinder, manufacturer,student, capacity, weight) ;//Creates a car object
  System.out.println(car);//Prints out the information about the car


  






















 }
}