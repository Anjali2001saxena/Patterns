package pattern;
import java.util.*;
public class Rightlowertriangle 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i=n; i>0; i--)
        {
            count++;
            for(int j=0; j<i; j++)
            {
                System.out.print("  ");
            }
            for(int k=0; k<count; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }   
    
}