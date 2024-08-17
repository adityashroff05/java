//Question: If cost price and selling price of an item is input through the keyboard, write a program to determine wheater the seller has made profit or incurred loss.Also determine hoe much profit or loss does seller has made
import java.util.Scanner;
public class Question4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter your Cost price of goods: ");
    int CP = sc.nextInt();
    System.out.println("Enter your selling price of goods: ");
    int SP = sc.nextInt();
    
    if(SP>CP){
        System.out.print("Your profit is: ");
        System.out.print(SP-CP);
    }
    else{
        System.out.print("Your loss is: ");
        System.out.print(CP-SP);
    }
        sc.close();
   } 
}
