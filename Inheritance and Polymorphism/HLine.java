public class HLine extends VectorObject
{
 //instance variales
 private int xLength;
 
 public HLine(int anId, int ax, int ay, int xLength)
 {
  super(anId, ax, ay);
  this.xLength=xLength;
 }

 public HLine(HLine original)
 {
  this(original.id, original.x, original.y, original.xLength);
 }

 public int getxLength()
 {
  return xLength;
 }

 
 public void setxLength(int length)
 {
  xLength=length;
 }












}