//Question: 
import java.util.Scanner;
public class Question4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter age of Ram : ");
    int Ram = sc.nextInt();
    System.out.println("Enter age of Shyam : ");
    int Shyam = sc.nextInt();
    System.out.println("Enter age of Ajay : ");
    int Ajay =sc.nextInt();
    if(Ram<Shyam){
        if(Ram<Ajay){
            System.out.println(Ram+"is Youngest");
        }
        else{
            System.out.println(Ajay+"is Youngest and smart");
        }
    }
    else{
        if(Shyam<Ajay){
            System.out.println(Shyam + "is youngest");
        }
        else{
            System.out.println(Ajay+"is youngest");
        }
    }
    sc.close();
   } 
}
