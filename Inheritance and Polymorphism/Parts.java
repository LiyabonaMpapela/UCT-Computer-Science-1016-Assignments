public class Parts
{
//instance variales
 public String serial;
 public String manufacturer;
 public String colour;
 
 public Parts(String serial, String manufacturer, String colour)
 {
  this.serial = serial;
  this.manufacturer = manufacturer;
  this. colour = colour;
 }

 public Parts(Parts original)
 {
  this(original.serial, original.manufacturer, original.colour);
 }
 
 public String getSerial()
 {
  return serial;
 }

 public String getManufacturer()
 {
  return manufacturer;
 }

 public String getColour()
 {
  return colour;
 }

 public void setSerial(String serial)
 {
  this.serial=serial;
 }
 
 public void setManufacturer(String manufacturer)
 {
  this.manufacturer=manufacturer;
 }
 
  public void setColour(String Colour)
 {
  this.colour=colour;
 }

 public String toString()
 {
  return serial+", "+manufacturer+", "+ colour;
 }















}