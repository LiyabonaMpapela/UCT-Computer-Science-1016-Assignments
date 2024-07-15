public class Accessory extends Parts

{
 public Accessory(Accessory original)
 {
  this(original.serial, original.manufacturer, original.colour);
 }
 
 public Accessory(String serial, String manufacturer, String colour)
 {
  super(serial, manufacturer, colour);
 }

 public String toString()
 {
  return ("Accessories: "+ super.toString());
 }



}