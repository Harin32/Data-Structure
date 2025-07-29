import java.util.Scanner;
class menudriven
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("===");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DUV");

        System.out.println("Enter 2 numbers");
        int a= sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter option in words");
        String opt=sc.nextLine();
        switch (opt) {
            case "ADD":System.out.println("sum is :"+ (a+b));
                
                break;
            case "SUB": System.out.println("diff is:"+ (a-b));
                break;
            case "MUL": System.out.println("prduct is:"+(a*b));
                break;
            case "DIV": System.out.println("Div is :"+(a/b));
                break;
            default:System.out.println("Invaild");
                break;
        }

    }
}
