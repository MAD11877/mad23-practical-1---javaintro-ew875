import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), c;
    int [] a = new int[n];
    int [] b = new int[n];
    double sum = 0;
    for(int i=0;i<n;i++)
    {
      a[i] = in.nextInt();
    }
    {
      for(int i=0;i<n;i++)
      {
        c=1;
        if(a[i]==-1)
          b[i]=0;
        else
        {
          for(int j=i+1;j<n;j++)
          {
            if(a[i]==a[j])
            {
              c++;
              a[j]=-1;
            }
          }
          b[i]=c;
        }
      }
      int m=b[0];
      for(int i=1;i<n;i++)
      {
        if(b[i]>=m)
          m=b[i];
      }
      for(int i=0;i<n;i++)
      {
        if(b[i]==m)
          System.out.println(a[i]);
      }
    }
  }
}
