package meepzEarl;
import java.util.Scanner;
public class Activity3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        
        if(num == 0) {
            System.out.println("Inputted number is Zero");
        }else if(num >= 1) {
            System.out.println(num + " is a positive number");
        }else{
            System.out.println(num + " is a negative number");
        }
    }
}
