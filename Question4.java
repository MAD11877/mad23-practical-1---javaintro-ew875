import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int x, y;
    for(x = base; x >= 1; x--)
    {
      for(y = x; y >= 1; y--)
      {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
