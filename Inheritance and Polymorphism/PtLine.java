public class PtLine extends VectorObject
{
 //instance variales
 private int x1, y1;
 
 public PtLine(int anId, int ax, int ay, int x1, int y1)
 {
  super(anId, ax, ay);
  this.x1=x1;
  this.y1=y1;
 }

 public PtLine(PtLine original)
 {
  this(original.id, original.x, original.y, original.x1, original.y1);
 }

 public int getx1()
 {
  return x1;
 }

 public int gety1()
 {
  return y1;
 }

 public void setx1(int x)
 {
  x1=x;
 }

  public void sety1(int y)
 {
  y1=y;
 }












}