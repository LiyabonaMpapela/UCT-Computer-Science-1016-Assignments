public class Shape{

 //instance varialbles
 public String name;
 public String colour;
 
 //create a shape object
 public Shape(Shape other)
 {
  this(other.name, other.colour);
 }
 
 public Shape (String name,String colour)
 {
  this.name=name;
  this.colour=colour;
 }

 public String toString()
 {
  return( name+" "+colour);
 }
 















}