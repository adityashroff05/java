//package Multiple Condition;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER value of a : ");
        int a = sc.nextInt();
        
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();
        
        System.out.println("enter the vlaue of c : ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+"is largest");
        }
        else if(b>a && b>c){
            System.out.println(b+"is largest");
        }
        else if(c>a && c>b){
            System.out.println(c+"is largest");
        }
        sc.close();
        
    }
}
