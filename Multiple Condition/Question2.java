// Question: Take positive integer input and tell if it is divisible by 5 or 3?
//package Multiple Condition;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int x = sc.nextInt();
        if(x%5==0 || x%3==0){
            System.out.println("Number is Divisible by 5 & divisible with 3");
        }
        else{
            System.out.println("Not divisible by 3 & 5");
        }
        sc.close();
    }
}
