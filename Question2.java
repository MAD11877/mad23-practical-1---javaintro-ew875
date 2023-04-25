import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    double weight = in.nextDouble();
    double height = in.nextDouble();
    double BMI = weight / (height * height);
    System.out.print(BMI);
  }
}
