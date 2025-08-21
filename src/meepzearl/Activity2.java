package meepzEarl;
import java.util.Scanner;
public class Activity2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        
        if(num == 0) {
            System.out.println("Inputted number is Zero"); 
        }else if(num%2 == 0) {
            System.out.println("Inputted number is even");
        }else{
            System.out.println("Inputted number is odd");
        }
    }
}
