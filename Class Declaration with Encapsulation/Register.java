public class Register
{
   //instance variables
   public Ticket[] tickets;
   public int numTickets;
   
    public Register()
    {
     tickets= new Ticket[100];//creates an aray with a length of 100
     numTickets=0;//sets numTickets to 0
    }
    
    //adss ticket to the array
    public void add(Ticket ticket)
    {
     tickets[numTickets]=ticket;//adds ticket to the tickets array on the position of numTickets
     numTickets++;//increases numTickets by 1
     
    }
     
    //checks if the ticket of the ticket ID provided by user exists
    public boolean contains(String ticketID)
    {
     
     for (int i=0; i< numTickets; i++)//loops where i starts from zero, it continues looping while i is less than the number before the length of numTickets, i increases by one after every loop
     {
      if (tickets[i].ID().equals(ticketID))//checks if the the ID in the ticket array is the same as the one provided by the user
      {
       return true;
      }
    } 
    return false;
   }
   
  // retrieves the ticket of the ID provided
  public Ticket retrieve(String ticketID){
   for (int i=0; i< numTickets; i++)//loops where i starts from zero, it continues looping while i is less than the number before the length of numTickets, i increases by one after every loop
     {
     if (tickets[i].ID().equals(ticketID))//checks if the the ID in the ticket array is the same as the one provided by the user
      {
      return tickets[i];// prints what is in position of i in the array tickets
      }
     }
    return null;
  }
 
}