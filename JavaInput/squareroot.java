//package JavaInput;
import java.util.Scanner;
public class squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("value of Square root is: ");
        int x = sc.nextInt();
        int y = x*x*x*x;
        System.out.println(y);
        sc.close();
    }
}

