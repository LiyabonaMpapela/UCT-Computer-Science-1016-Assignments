/**
 * An object of the Registration class represents a South African vehicle registration. 
 *  
 * @author Alan Berman [Adapted from Stephan Jamieson]
 * @version 14/7/15
 */
// REMOVE implements
public class Registration implements Comparable<Registration> {

    private final Province province;
    private final String identifier;
    
    /**
     * Create a Registration object from a string of suitable format.
     * @param code a String representing a vehicle registration.
     * @throws IllegalArgument exception if code does not represent a valid registration.
     */
    public Registration(final String identifier) throws IllegalArgumentException {
        this.province = Province.identifyProvince(identifier);
        this.identifier = identifier; 
        
    }
    
    public Province getProvince() { return this.province; }
    public String getIdentifier() { return this.identifier; }
    
	/**
	* Determine whether the given string is a valid registration identifier.
	*/
    public static boolean isValid(final String regIdentifier) { 
        try {
            Province province = Province.identifyProvince(regIdentifier);
            return true;
        }
        catch (IllegalArgumentException illExcep) {
            return false;   
        }
    }   
    public String toString()
    {
     return identifier;
    }
    @Override 
    public int compareTo(final Registration other)
    {

     int ans =this.getIdentifier().compareTo(other.getIdentifier());
     return ans;
    }
    
    public boolean equals(Object other)
    {
//      if(other instanceof Registration)
//      { 
//       Registration other1 = (Registration)other;
//       return (this.getIdentifier().equals(other1.getIdentifier()) && this.getProvince().equals(other1.getProvince()));
//      }
//      return false;
        if(other == null){
        return false;
        }
        Registration other1 = (Registration)other;
        return (this.compareTo(other1)==0);
        
    }  

}
