//Question: Take positive integer input and tell if it is  a three digit number or not
import java.util.Scanner;
public class using{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a digit : ");
            int n = sc.nextInt();
            if(n>99 && n<1000){
                  System.out.println("this is 3 digit number");
            }
            else{
                  System.out.println("this is not a thre digit number");
            }
            sc.close();
      }
}
