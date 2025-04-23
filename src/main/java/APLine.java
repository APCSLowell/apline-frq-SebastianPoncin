public class APLine
{
  private int a, b, c;
  public APLine(int A, int B, int C) {
    a=A;
    b=B;
    c=C;
  }
  
  public double getSlope() {
    return (double)-a/((double)b);
  }
  public boolean isOnLine(int x, int y) {
    return (a*x+b*y+c) == 0;  
  }
  
}
