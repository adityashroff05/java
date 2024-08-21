//Question: Take positive integer input and tell if it is divisible by 5 or 3 but not divisible by 15.
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            if(n%15!=0){
                System.out.println("This number is divisible by 5 or 3 but not with 15");
            }
            else{
                System.out.println("Not divisible");
            }
            }
            sc.close();
        }
    }

