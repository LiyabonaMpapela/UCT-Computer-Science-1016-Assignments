public class Rectangle extends Shape{

//instance variables
double length;
double width;

//create a rectangle object
public Rectangle(Rectangle other)
{
 this(other.name, other.colour, other.length, other.width);
}


public Rectangle(String name, String colour, double length, double width)
{
 super(name, colour);
 this.length= length;
 this.width= width;
}


public String toString()
{
 return(super.toString()+ " Length " +length+ " Width "+width);
}








}