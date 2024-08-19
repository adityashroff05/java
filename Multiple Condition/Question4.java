//Question: Take 3 number input and tell if they can be the side of a triangle.
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of first side : ");
        int a = sc.nextInt();
        System.out.println("Enter value of Seconf side : ");
        int b = sc.nextInt();
        System.out.println("Enetr valuse of third side : ");
        int c  = sc.nextInt();
        if((a+b)>c || (b+c)>a || (a+c)>b ){
            System.out.println("This is a triangle sides");

        }
        else{
            System.out.println("not a triangle sides");
        }
        sc.close();
    }
}
