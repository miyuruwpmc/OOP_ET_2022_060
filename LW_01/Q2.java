import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input Your First Name : ");
        String fName=scanner.next();

        System.out.println("Input Your Middle Name : ");
        String mName=scanner.next();

        System.out.println("Input Your Last Name : ");
        String lName=scanner.next();

        System.out.println(lName+","+fName+" "+mName.charAt(0)+".");



    }
}
