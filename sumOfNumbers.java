import java.util.Scanner;
class SUM
{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            sum=sum+i;
            
        }
        System.out.println("the Entered number is:"+n+"The sum is :"+sum);
    }
}
