package pattern;
import java.util.*;
public class Numbertriangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int count=1;
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int m = n;
        for(int i=0; i<m; i++)
        {
          for(int k=n; k>0; k--)
          {
            System.out.print("     ");
          }
          for(int j=0; j<=i; j++)
          {
            System.out.print( "   "+count+"      ");
            count++;
          }
          n--;
         System.out.println();
        }  
        sc.close();
    }
}