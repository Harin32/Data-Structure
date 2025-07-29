import java.util.Scanner;
class factorial
{
    public static void main(String[] args)
    {
        long fact = 1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
         System.out.println("The Factorial of the Number:"+ n +" is :" + fact);
    }
}
