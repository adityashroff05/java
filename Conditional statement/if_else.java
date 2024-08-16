//package Conditional statement;
import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Number: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
        //System.out.println(n);
        sc.close();
    }
}
