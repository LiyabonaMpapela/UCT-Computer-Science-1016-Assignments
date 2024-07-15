// Testing shopping cart
// Name: Liyabona Mpapela
// Student Number: MPPLIY002
// Date: 15 August 2023

import java.util.Scanner;
public class TestShoppingCart
{
 public static void main(String[] args)
 {
  Scanner input= new Scanner(System.in);
  System.out.println("How many items would you like to add to your Shopping Cart?:");
  int noItems=input.nextInt();
  input.nextLine();
  
  if (noItems==0){
   System.out.println("Your Shopping Cart is empty.");
   System.exit(0);//exit the program
  }
  
  ShoppingCart cart = new ShoppingCart();
  //receive information of the products being ordered 
  for (int i=0; i < noItems; i++)
  {
   System.out.println("Enter the Product Name:");
   String product = input.nextLine();
   
   System.out.println("Enter the Quantity:");
   int quantity=input.nextInt();
   input.nextLine();
   
   System.out.println("Enter the Unit Cost:");
   double unitCost = input.nextDouble();
   input.nextLine();

   
   Item item = new Item(product,quantity,unitCost);
   
   //print output
   cart.addItems(item);
  }
  
  
   System.out.println("The Shopping Cart has the following items:");
   cart.queryCart();
     
   System.out.println("--- Shopping Cart with all items ---");
   cart.getDiscount("WELCOME20");
   cart.printInvoice();
   
 
 }
}



