import java.io.File;
import java.io.FileNotFoundException;
//
import java.util.Scanner;
/**
 * See Assignment II Question II
 *
 * @author Stephan Jamieson
 * @version 26/7/2019
 */
public class MarketPlace {
    
    private MarketPlace() {}
    
    private final static Currency RAND = new Currency("R", "ZAR", 100);
    
    
    // Create an instance of Seller with attributes ID, name, location, product, 
    // unit_price and number_of_units
    private static Seller makeSeller(final String data) { 
        final Scanner scanner = new Scanner(data.trim());
        scanner.useDelimiter("\\s*,\\s*");
        
        // Add your code here
        String ID=scanner.next();
        String name=scanner.next();
        String location=scanner.next();
        String product=scanner.next();
        Money unit_price= new Money(scanner.next(),RAND);
        int number_of_units=scanner.nextInt();
        
        Seller mySeller = new Seller(); 
         mySeller.Id=ID; 
         mySeller.Name=name;
         mySeller.Location=location;
         mySeller.Product=product;
         mySeller.Price=unit_price;
         mySeller.Units=number_of_units;
      
                
        return mySeller;
    }
    
    // Read the contents of CSV file into an array.
    // See the Appendix on page 4 of the Assignment sheet.
    private static Seller[] parseFile(final String fileName) throws FileNotFoundException {
        final Scanner inFile = new Scanner(new File(fileName));
        Seller[] sellers = null;
    
        if (inFile.hasNextLine()) {
            sellers = new Seller[Integer.parseInt(inFile.nextLine().trim())];
            for (int index=0; index<sellers.length; index++) {
                sellers[index] = makeSeller(inFile.nextLine());
            }
        }
        inFile.close();
        return sellers;
    }
    
    public static void main(final String[] args) throws FileNotFoundException {
        final Scanner inKey = new Scanner(System.in);
        System.out.println("Enter the name of a \"Comma Separated Values\" (CSV) file:");
        final Seller[] sellers = parseFile(inKey.nextLine());
                 
                
        
        // Your Code here
               
         if ((sellers== null) || (sellers.length==0))
        {
         System.out.println("The file contains no seller data.");
         System.exit(0);
        }

        System.out.println("Enter the name of a product:");
        String product=inKey.nextLine();
        System.out.println("Enter the number of units required:");
        int number_of_units=inKey.nextInt();
        inKey.nextLine();
        System.out.println("Enter the maximum unit price:");
        Money unit_price= new Money(inKey.nextLine(),RAND);
               
        int count=0;
        for (int i = 0; i < sellers.length; i++)
        {
         if ((sellers[i].Product.equals(product)) & (sellers[i].Units>=number_of_units) & (sellers[i].Price.compareTo(unit_price)<=0))
         {
          System.out.println(sellers[i].Id+" : "+ sellers[i].Name+" in "+ sellers[i].Location+" has "+sellers[i].Units+" "+ sellers[i].Product+" for "+ sellers[i].Price+" each.") ;  
          count++;    
         }
         
        }
        if (count==0)
        {
         System.out.println("None found." ) ;
        }
        
        
        

        
    }
}

