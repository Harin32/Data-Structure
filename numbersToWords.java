import java.util.Scanner;
class  Numbers_in_Words
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int n= sc.nextInt();
        String str="";
        while (n>0)
        {
            int rem = n%10;
            n/=10;
            str = str+rem;
            
        }
        System.out.println(str);
        char c;
        for(int i=str.length()-1;i>=0;i--)
            {
                c= str.charAt(i);
                switch (c) {
                    case '0':System.out.print("Zero");
                        break;
                    case '1':System.out.print("One");
                        break;
                    case '2':System.out.print("Two");
                        break;
                    case '3':System.out.print("Three");
                        break;
                    case '4':System.out.print("Four");
                        break;
                    case '5':System.out.print("Five");
                        break;
                    case '6':System.out.print("six");
                        break;
                    case '7':System.out.print("Seven");
                        break;
                    case '8':System.out.print("Eight");
                        break;
                    case '9':System.out.print("Nine");
                        break;
                
                    default:System.out.println("Its not a value ");
                        break;
                }
            }
    }
}
