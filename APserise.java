import java.util.Scanner;
class A.P_serise
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Values of A,D and the Number of digits:");
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        int term=a;
        for(int i=0;i<n;i++)
        {
            System.out.print(term +",");
            term=term+d;
        }
    }
    
}
