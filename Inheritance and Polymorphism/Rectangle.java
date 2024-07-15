public class Rectangle extends VectorObject
{
 //instance variales
 private int xLength, yLength;
 
 public Rectangle(int anId, int ax, int ay, int xLength, int yLength)
 {
  super(anId, ax, ay);
  this.xLength=xLength;
  this.yLength=yLength;
 }

 public Rectangle(Rectangle original)
 {
  this(original.id, original.x, original.y, original.xLength, original.yLength);
 }

 public int getxLength()
 {
  return xLength;
 }

 public int getyLength()
 {
  return yLength;
 }

 public void setxLength(int length)
 {
  xLength=length;
 }

  public void setyLength(int length)
 {
  yLength=length;
 }

  //public abstract void draw ( char [][] matrix );



}