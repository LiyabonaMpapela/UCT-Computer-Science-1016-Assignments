// Model Shops
// Name: Liyabona Mpapela
// Student Number: MPPLIY002
// Date: 5 August 2023

import java.util.Scanner;
public class TestSeller
{
 public static void main (String[] args)
 {
  String id,name, location, product;
   
  int units;
  Scanner keyboard= new Scanner(System.in);
  
  //receive input from user
  System.out.println("Please enter the details of the seller.");
  System.out.print("ID: ");
  id= keyboard.nextLine();
  System.out.print("Name: ");
  name= keyboard.nextLine();
  System.out.print("Location: ");
  location= keyboard.nextLine();
  System.out.print("Product: ");
  product= keyboard.nextLine();
  System.out.print("Price: ");
  
  Currency rand = new Currency("R", "ZAR", 100);
  Money price = new Money( keyboard.nextLine(),rand);
  
  System.out.print("Units: ");
  units= keyboard.nextInt();
  
  Seller mySeller=new Seller(  );
  mySeller.Id=id; 
  mySeller.Name=name;
  mySeller.Location=location;
  mySeller.Product=product;
  mySeller.Price=price;
  mySeller.Units=units;

  //print output
  System.out.println("The seller has been successfully created:");
  System.out.println("ID of the seller: "+ mySeller.Id);
  System.out.println("Name of the seller: "+ mySeller.Name);
  System.out.println("Location of the seller: "+ mySeller.Location);
  System.out.println("The product to sell: "+ mySeller.Product);
  System.out.println("Product unit price: "+ mySeller.Price);
  System.out.println("The number of available units: "+ mySeller.Units);



  
  
  
 }
}


  
