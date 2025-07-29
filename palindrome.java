import java.util.Scanner;
class palindrome_Numbers
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number to be Reversed:");
        int n=sc.nextInt();
        int reverse =0;
        int m=n;
        while (n>0)
        {
            int r=n%10;
            reverse = reverse*10+r;
            n=n/10;
        }
        if (reverse==m)
        {
            System.out.println("Its a palindrome Number");

        }
        else{
            System.out.println("Its not a palindrome Number");
        }
    }
}
