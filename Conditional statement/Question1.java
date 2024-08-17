import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Entre a Value: ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("The Number you entered is divisible by 5");
        }
        else{
            System.out.println("the number you enetered is not dividible by 5");
        }
        sc.close();
    }
}
