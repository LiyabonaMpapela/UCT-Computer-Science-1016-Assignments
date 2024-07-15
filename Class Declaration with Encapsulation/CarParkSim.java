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
        // YOUR CODE HERE
        // Declare variables to store a Clock and a Register object, create the relevant objects and assign them. 
        Clock clock= new Clock(new Time("00:00"));//instantiates a clock object
        Register register = new Register();//instantiates a register object
        TariffTable table = new TariffTable(100);
        Currency rand = new Currency("R","ZAR",100);
  
        
        System.out.println("Car Park Simulator");
        // YOUR CODE HERE.
        // Print current time.
                             
         TimePeriod test1 = new  TimePeriod(new Duration("minutes",0),new Duration("minutes",30));
         table.addTariff(test1, new Money("R10",rand));

         TimePeriod test2 = new  TimePeriod(new Duration("minutes",30),new Duration("hour",1));
         table.addTariff(test2, new Money("R15",rand));

         
         TimePeriod test3 = new  TimePeriod(new Duration("hour",1),new Duration("hour",3));
         table.addTariff(test3, new Money("R20",rand));

         TimePeriod test4 = new  TimePeriod(new Duration("hour",3),new Duration("hour",4));
         table.addTariff(test4, new Money("R30",rand));

         TimePeriod test5 = new  TimePeriod(new Duration("hour",4),new Duration("hour",5));
         table.addTariff(test5, new Money("R40",rand));

         TimePeriod test6 = new  TimePeriod(new Duration("hour",5),new Duration("hour",6));
         table.addTariff(test6, new Money("R50",rand));

        TimePeriod test7 = new  TimePeriod(new Duration("hour",6),new Duration("hour",8));
        table.addTariff(test7, new Money("R60",rand));


        TimePeriod test8 = new  TimePeriod(new Duration("hour",8),new Duration("hour",10));
        table.addTariff(test8, new Money("R70",rand));

        TimePeriod test9 = new  TimePeriod(new Duration("hour",10),new Duration("hour",12));
        table.addTariff(test9, new Money("R90",rand));

         TimePeriod test10 = new  TimePeriod(new Duration("hour",12),new Duration("day",1));
        table.addTariff(test10, new Money("R100",rand));

        System.out.println("The current time is "+clock.examine()+".");//Prints current time
        
        System.out.println("Commands: tariffs, advance {minutes}, arrive, depart, quit.");
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
              //String UID = UIDGenerator.makeUID();//creates a unique ID for the ticket of a driver that just arrived
              Ticket ticket = new Ticket(clock.examine());//, UID);//creates a new ticket using the current time and the unique ID generated
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
                  System.out.println("Cost of stay : "+(table.getTariff(diff)).toString()+".");
                  }
                  
                  
                else{
                 System.out.println("Invalid ticket ID.");//if register does not contains the ID provided by the user it prints that the ID provided is invalid
 
                }
                
            }
            
            //Checks if the user entered tariffs
            else if (input.equals("tariffs")) {
            
             System.out.println(table.toString());
            
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
