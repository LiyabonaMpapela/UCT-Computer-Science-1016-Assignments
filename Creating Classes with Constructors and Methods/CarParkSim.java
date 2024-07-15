import java.util.Scanner;
/**
 * The CarParkSim class contains the main car park simulation method.
 * It creates and manipulates the main objects, and handles user I/O.
 *
 * @author Stephan Jamieson and ...
 * @version 14/7/2019
 */
public class CarParkSim {
        
    public static void main(final String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        // YOUR CODE HERE.
        // Declare variables to store a Clock and a Register object, create the relevant objects and assign them. 
        Clock clock= new Clock(new Time("00:00"));//instantiates a clock object
        Register register = new Register();//instantiates a register object
        TariffTable table = new TarrifTable(100);

        
        System.out.println("Car Park Simulator");
        // YOUR CODE HERE.
        // Print current time.
        System.out.println("The current time is "+clock.examine()+".");//Prints current time
        
        System.out.println("Commands: advance {minutes}, arrive, depart, quit.");
        System.out.print(">");
        String input = keyboard.next().toLowerCase();
        while (!input.equals("quit")) {
            if (input.equals("advance")) {
                // YOUR CODE HERE.
                // Advance the clock, print the current time.
                int minutes = keyboard.nextInt();// reads the minutes entered by user after the word advance
                keyboard.nextLine();//reads new line after from the minutes in scanner
                clock.advance( new Duration("minutes",minutes));//converts the integer minutes to duration and advances it on clock
                System.out.println("The current time is "+clock.examine()+".");
                
                
                
                
            }
            else if (input.equals("arrive")) {
                // YOUR CODE HERE.
                // Create a new ticket, add it to the register, print details of ticket issued.
              keyboard.nextLine();
              String UID = UIDGenerator.makeUID();//creates a unique ID for the ticket of a driver that just arrived
              Ticket ticket = new Ticket(clock.examine(), UID);//creates a new ticket using the current time and the unique ID generated
              register.add(ticket);// adss the ticket to register   
              System.out.println("Ticket issued: "+ ticket.toString()+".");//prints output
               
               
            }
            else if (input.equals("depart")) {
                // YOUR CODE HERE.
                // Determine if ticket is valid, i.e. in the register.
                // If not, print error message.
                // If yes, retreive it, calculate duration of stay and print it.
                String ID=keyboard.next();
                keyboard.nextLine();
                
            

                if ( register.contains(ID)==true){//checks if register contains the ID provided by the user
                
                  Ticket r= register.retrieve(ID); //retrieves the ticket with the ID provided                 
                  System.out.println("Ticket details: "+ r.toString()+".");                    
                  System.out.println("Current time: "+clock.examine()+".");
                  Duration  diff= ( r.age(clock.examine()));//Calculates how long has the driver been parking 
                  String ans= Duration.format( diff, "minute");//changes the format of the time that the driver has been parking
                  System.out.println("Duration of stay: "+ ans +".");
                  System.out.println("Cost of stay :"+table.getTariff(diff));
                  }
                  
                  
                else{
                 System.out.println("Invalid ticket ID.");//if register does not contains the ID provided by the user it prints that the ID provided is invalid
 
                }
                
            }
            
            else if (input.equals("tariffs")) {
            
             System.out.println(table.toString);
            
            }
            else {
                System.out.println("That command is not recognised.");
                System.out.println("Commands: advance <minutes>, arrive, depart, quit.");
            }            
            System.out.print(">");
            input = keyboard.next().toLowerCase();
        }            
        System.out.println("Goodbye.");
    }

}
