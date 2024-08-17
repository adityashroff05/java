//Question: Any year is input through the keyboard.Write a program to determinr wheather the year is a leap or not.
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a year: ");
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println("This is a leap yera");
        }
        else{
            System.out.println("The year is not a leap year");
        }

        sc.close();

    }
}
