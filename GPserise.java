import java.util.Scanner;
class G.P_serise
{
    public static void main (String[] args)
    {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter the vaules of A,R and N");
    int a= sc.nextInt();
    int r=sc.nextInt();
    int n=sc.nextInt();
    int term=a;
    for (int i=0;i<n;i++)
    {
        System.out.print(term + ",");
        term =term*r;
    }
    }

}
