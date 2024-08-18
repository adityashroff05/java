//Question: Take input percentage of student and print the grade according to marks.
import java.util.Scanner;
//package elseif;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of student: ");
        int x = sc.nextInt();
        if(x>100){
            System.out.println("You entered a number is out of range");
        }
       else  if(x>90){
            System.out.println("Excelent");
        }
        else if(x>80){
            System.out.println("very Good");
        }
        else if(x>70){
            System.out.println("good");
        }
        else if(x>60){
            System.out.println("Can do better");
        }
        else if(x>50){
            System.out.println("Average");
        }
        else if(x>40){
            System.out.println("Bellow average");
        }
        else if(x>40){
            System.out.println("Fail");
        }
       
        sc.close();
    }
}
