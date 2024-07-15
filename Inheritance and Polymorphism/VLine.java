public class VLine extends VectorObject
{
 //instance variales
 private int yLength;
 
 public VLine(int anId, int ax, int ay, int yLength)
 {
  super(anId, ax, ay);
  this.yLength=yLength;
 }

 public VLine(VLine original)
 {
  this(original.id, original.x, original.y, original.yLength);
 }

 public int getyLength()
 {
  return yLength;
 }

 
 public void setyLength(int length)
 {
  yLength=length;
 }











}