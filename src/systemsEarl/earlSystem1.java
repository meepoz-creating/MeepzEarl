package systemsEarl;

import java.util.Scanner;
import banking.bankingSystem;

public class earlSystem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bankingSystem bc = new bankingSystem();

                System.out.println("Enter your Account No: ");
                int accountNo = sc.nextInt();

                System.out.println("Enter your Pin: ");
                int pin = sc.nextInt();

                if (bc.verifyAccount(accountNo, pin)) {
                    System.out.println("LOGIN SUCCESS");
                } else {
                    System.out.println("INVALID ACCOUNT OR PIN!");

                    int tries = 2;
                    System.out.println("attempts remaining = 3");
                    int x;
                    for (x = 0; x <= tries; x++) {
                        System.out.print("Enter your Account No: ");
                        accountNo = sc.nextInt();
                        System.out.print("Enter your Pin: ");
                        pin = sc.nextInt();

                        if (bc.verifyAccount(accountNo, pin)) {
                            System.out.println("LOGIN SUCCESS");
                            break;
                        } else {
                            System.out.println("INVALID ACCOUNT OR PIN");
                            System.out.println("attempts remaining = " + (tries - x));
                        }
                    }
                    if (((tries - x) == 0) && (!bc.verifyAccount(accountNo, pin))) {
                        System.out.println("ZERO TRIES REMAINING. TRY AGAIN LATER");
                    }
                }
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid Selection!");
        }

        sc.close();
    }
}
