import java.util.Scanner;
class digits
{
    public static void main(String[] args)
    {
        int r;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the long Number:");
        int n = sc.nextInt();
        while(n>0)
        {
         r= n%10;
        n = n/10;
        System.out.println(r);
        }
    }
}
