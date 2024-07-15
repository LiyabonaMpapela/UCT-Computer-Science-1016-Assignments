public class Screen extends Parts
{
 //instance variales
 public int size;
 
 public Screen(Screen original)
 {
  this(original.serial, original.manufacturer, original.colour, original.size);
 }
 
 public Screen(String serial, String manufacturer, String colour, int size)
 {
  super(serial, manufacturer, colour);
  this.size = size;
  }
 
 public int getSize()
 {
  return size;
 }
 
  public void setSize(int size)
 {
  this.size= size;
 }


 public String toString()
 {
  return ("Screen: "+ super.getSerial()+", "+ super.getColour()+", "+ super.getManufacturer()+", "+size);
 }













}