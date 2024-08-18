//Question: Take a three digit positive integer and tell if it is divisible by 5 and 3?
//package Multiple Condition;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int x = sc.nextInt();
        if(x%5==0  && x%3==0){
            System.out.println("This Number is Divisible by 5 and 3");
        }
        else{
            System.out.println("not divisible");
        }
        sc.close();
    }
}
