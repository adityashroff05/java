// Question: given th elength and breadth of  A RECTANGLE  write a program to find wheather the area of the rectangle is greater than its perimeter.
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of a Rectngle : ");
        int length = sc.nextInt();
        System.out.println("Enter breath of a rectangle : ");
        int breath = sc. nextInt();
        int area = length * breath;
        int perimeter = 2*(length+breath);
        if(area>perimeter){
            System.out.println("Area is greater");
        }
        if(area == perimeter){
            System.out.println("Both are EQUAL");
        }
        else{
            System.out.println("perimeter is greatre than area");
        }
        sc.close();
    }
}
