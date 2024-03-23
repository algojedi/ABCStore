import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        boolean loop = true;
        int myInt = 0;

        Account accountA = new Account(1, "Asher");
        Account accountC = new Account(2, "Chloe");

        while(loop) {
            try {
                System.out.print("give number: ");
                myInt = myScanner.nextInt();
                loop = false;
            }
            catch(Exception e) {
                System.out.println("Answer properly");
                myScanner.nextLine();
            }
        }

//        Account a = new Account();
//        System.out.println(a);

        System.out.println();
        System.out.println("your int is " + myInt);

    }

}