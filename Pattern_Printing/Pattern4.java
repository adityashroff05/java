import java.util.Scanner;
public class Pattern4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            if(i+j>=3){
                System.out.print("* ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    sc.close();
   } 
}
