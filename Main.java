import java.util.Scanner; 
class Main
{
  public static void main(String[] args)
  {
    Scanner Obj = new Scanner(System.in); 
    double f, c, d;

    d = 0.56;
    System.out.println("F C");
    for(f =- 450; f <= 136; f++)
    {
      c = d*(f - 32);
      System.out.println(f + " " + c);
    }
  }
}