package JavaInput;
import java.util.Scanner;
public class takingInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int radius = sc.nextInt();
            double pi = 3.1415;
            double area = pi*radius*radius;
            System.out.println("the area of circle is: "+area);
        }
    }
}
