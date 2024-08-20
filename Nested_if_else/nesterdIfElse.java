//package Nested_if_else;
import java.util.Scanner;
public class nesterdIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        if(n%5==0){
            if(n%3==0){
                System.out.println("The number is divisible by 5 and 3 both");
            }
            else{
                System.out.println("Not Divisible");
            }
        }
        sc.close();
    }

}
