public class Box extends Parts
{
 //instance variales
 public int memory;
 
 public Box (Box original)
 {
  this(original.serial, original.manufacturer, original.colour, original.memory);
 }
 
 public Box(String serial, String manufacturer, String colour, int memory)
 {
  super(serial, manufacturer, colour);
  this.memory = memory;
  }
 
 public int getMemory()
 {
  return memory;
 }
 
  public void setMemory(int memory)
 {
  this.memory= memory;
 }

 public String toString()
 {
  return ("Box: "+ super.toString()+", "+memory);
 }





}