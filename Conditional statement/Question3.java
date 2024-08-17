//Question: Take integer input and print the absolute valuse of tht integer.
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        if(n<0){
            n = n*(-1); // By using this you can conert any negative number in positive number.
            System.out.println("The absolute Value is: "+n);
        }
        sc.close();
    }
}
