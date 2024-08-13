import java.util.Scanner;
public class sumof2number {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter value of x: ");
       int x = sc.nextInt();
       System.out.print("enter value of y: ");
       int y = sc.nextInt();

       int sum = x+y;
       System.out.println(sum);
        sc.close();
    }
}
