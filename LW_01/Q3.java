package LW_01;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the value in centimeters: ");

        double cvalue=scanner.nextDouble();
        double ivalue=cvalue/2.54;
        double fvalue=cvalue*0.0328;

        System.out.println("Value in inches "+ivalue);
        System.out.println("Value in feet "+fvalue);
    }
}
