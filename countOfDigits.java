import java.util.Scanner;
class Count_of_Digits
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc= new Scanner (Sysutem.in);
        System.out.print("Enter the Number:");
        int num=sc.nextInt();
        while(num>0)
        {
        num=num/10;
        count= count++;
        }
        System.out.println(num);



    }
}
