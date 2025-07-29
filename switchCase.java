import java.util.Scanner;
class work4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URL of the website :");
        String url= sc.nextLine();
        String ext =url.substring(url.lastIndexOf(".")+1);
        switch (ext) {
            case "com":System.out.println("commercial");
                break;
            case "gov":System.out.println("Government");
                break;
            case "org":System.out.println("Organization");
                break;
            case "net": System.out.println("Network");
                break;
            default:System.out.println("invalid");
                break;
        }
    }
}
