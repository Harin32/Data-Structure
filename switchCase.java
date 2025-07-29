import java.util.*;
class work1 //switch Case
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number upto 6:");
        int day = sc.nextInt();
        
        if ( day == 1)
        {
            System.out.println("Mon");
        }
        else if( day == 2)
        {
             System.out.println("thu");
        }
        else if( day == 3)
        {
            System.out.println("wed");
        }
        else if( day == 4)
        {
            System.out.println("thr");
        }
        else if( day==5)
        {
            System.out.println("Fri");
        }
        else if( day == 6)
        {
            System.out.println("sat");
        }
        else
        {
            System.out.println("sunday");
        }
    }
}
