import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){

            // first print empty spaces
            for(int j=0;j<3-i;j++){
                System.out.print(" ");
            }
            //then print starts
            for (int k=0;k<2*i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
