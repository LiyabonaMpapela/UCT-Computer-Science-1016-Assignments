public class Circle extends Shape{
 //instance variables
  double radius;
  
   //create a circle object 
   public Circle(Circle other)
   {
    this(other.name, other.colour, other.radius);
   }
   
   public Circle(String name, String colour, double radius)
   {
    super(name, colour);
    this.radius= radius;
   }
   
   
   public String toString()
   {
    return(super.toString()+ " Radius " +radius);
   }












}