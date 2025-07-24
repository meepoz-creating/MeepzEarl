
package meepzearl;

import java.util.Scanner;

public class MeepzEarl {

   
   
        
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter marks in Science: ");
            int science = sc.nextInt();
            
            System.out.print("Enter marks in History: ");
            int history = sc.nextInt();
            
            System.out.print("Enter marks in Math: ");
            int math = sc.nextInt();
            
            System.out.print("Enter marks in Soc: ");
            int soc = sc.nextInt();
            
            System.out.print("Enter marks in Arts: ");
            int arts = sc.nextInt();
            
            int total = science + history + math + soc + arts;
            double percentage = total / 5.0;
            
            System.out.println("\nTotal Marks: " + total);
            System.out.printf("Total Percentage: %.2f\n", percentage);
            
            String remarks;
            
            if (percentage < 70) {
                remarks = "Fail";
                System.out.println("Remarks: " + remarks);
                System.out.println("Try Again " + name);
            } else if (percentage <= 75) {
                remarks = "Poor";
            } else if (percentage <= 80) {
                remarks = "Fair";
            } else if (percentage <= 85) {
                remarks = "Good";
            } else if (percentage <= 90) {
                remarks = "Very Good";
            } else {
                remarks = "Excellent";
            }
            
            if (percentage >= 70) {
                System.out.println("Remarks: " + remarks);
                System.out.println("Congrats " + name + ", you Passed.");
            }
        }
    }
        
}
