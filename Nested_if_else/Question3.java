//Question: Take 3 positive integer input and print the greatest of them.
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of b :");
        int b = sc.nextInt();
        System.out.println("Enter Value of c : ");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+"is largest");

            }
            else{
                System.out.println(c+"is largest");
            }
        }
        else{
            if(b>c){
            System.out.println(b+"is largest");
            }
            else{
                System.out.println(c+"is largest");
            }
        
        }
        sc.close();
    }
}
