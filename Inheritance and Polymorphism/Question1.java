import java.util.*;
import java.util.Scanner;
public class Question1
{
 public static void main (String[]args)
 {
  Scanner input = new Scanner(System.in);//Creates a nwe scanner object
  List<Parts> comp = new ArrayList<Parts>();//Creates an Array list of parts
  
  System.out.println("Welcome to Great International Technology");
  
  System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit"); 
  String action= input.next();
  action= action.toLowerCase();//changes the input taken from the user to lower case
  
  while ( (action.equals("q"))== false )//while the user has not enterd a q to quit
  {
     switch (action)
     {
      case "b":// when the user entered b
         System.out.println("Enter the serial number");
         String serial= input.next();
         input.nextLine();
         
         System.out.println("Enter the manufacturer");
         String manufacturer = input.nextLine();
            
         System.out.println("Enter the colour");
         String colour = input.nextLine();
         
         System.out.println("Enter the amount of memory (MB)");
         int memory = input.nextInt();
         input.nextLine();
      
         Box box = new Box(serial, manufacturer, colour, memory);//instatiates a new Box object using the information entered by the user
         comp.add(box);//adss the Box object to the array list of Parts
         System.out.println("Done");
         System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");  
         action= input.next();
         action= action.toLowerCase();
         
         break;
      
        case "s": // when the user entered s
           System.out.println("Enter the serial number");
            String serial1= input.next();
            input.nextLine();
            
            System.out.println("Enter the manufacturer");
            String manufacturer1 = input.nextLine();
               
            System.out.println("Enter the colour");
            String colour1 = input.nextLine();
            
            
            System.out.println("Enter the screen size in inches");
            int size = input.nextInt();
            input.nextLine();
   
            Screen screen = new Screen(serial1, manufacturer1, colour1, size);//instatiates a new Screen object using the information entered by the user
            comp.add(screen);//adss the Screen object to the array list of Parts
            
            System.out.println("Done");
            System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");  
            action= input.next();
            action= action.toLowerCase();
            
            break;
        
        
        case "a": // when the user entered a
           System.out.println("Enter the serial number");
           String serial2= input.next();
           input.nextLine();
            
           System.out.println("Enter the manufacturer");
           String manufacturer2 = input.nextLine();
                     
           System.out.println("Enter the colour");
           String colour2 = input.nextLine();
           
          Accessory accessory= new Accessory(serial2, manufacturer2, colour2); //instatiates a new Accesssory object using the information entered by the user
          comp.add(accessory);//adss the Accessory object to the array list of Parts
          System.out.println("Done");
          System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit"); 
          action= input.next();
          action= action.toLowerCase();
          
          break;
          
     case "d": // when the user entered d
          System.out.println("Enter the serial number");
          String serial3= input.next();
          input.nextLine();
          boolean found = false;
          
          for (int i=0; i<comp.size(); i++) //loop through the array list of parts
          {
           if ((comp.get(i).getSerial()).equals(serial3)) //Checks if the serial entered by the user matches a serial of any part that is in the array list of parts
           {
            found=true;
            comp.remove(i);//removes the part in that position from the array list of parts
            System.out.println("Done");
            
           }
          }
           
          if (found==false)// if the a part with the serial that the user entered is not found
          {
           System.out.println("Not found");
          }
          
          
          System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit"); 
          action= input.next();
          action= action.toLowerCase();
          
          break;
          
    case "l": // when the user entered l
         for (Parts i:comp)//loop throught the array list of parts
         {
          System.out.println(i);//print everything in the array list
         }
         
          System.out.println("Done");
          System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit"); 
          action= input.next();
          action= action.toLowerCase();
          
         break;
         
    case "q": // when the user entered q
        System.exit(0); //exit the programme
        break;    
   }
  
  }
 














 }

}