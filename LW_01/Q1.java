package LW_01;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Word");
        String word=scanner.next();
        int length=word.length();
        System.out.println(word.substring(length/2,(length/2)+1));
        System.out.println(word.charAt(length/2));

    }
}
