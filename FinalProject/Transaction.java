import java.util.Scanner;
public class Transaction {
    int balance = 0;
    int amount = 0;
    int transaction;

    void menu(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Please choose your transaction:");
        System.out.println("a: Check Balance");
        System.out.println("b: Deposit Amount");
        System.out.println("c: Withdraw Amount");
        System.out.println("d: Previous Transaction");
        System.out.println("e: Exit Program");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    void input(char input){
        Scanner in = new Scanner(System.in);

        switch (input) {
            case 'a':
                System.out.print("Your current Balance is: ");
                check();
                System.out.println();
                break;

            case 'b':
                System.out.println("Input the amount you wish to Deposit:");
                amount = in.nextInt();
                deposit(amount);
                System.out.println();
                break;

            case 'c':
                System.out.println("Input the amount you wish to Withdraw:");
                amount = in.nextInt();
                withdraw(amount);
                System.out.println();
                break;

            case 'd':
                System.out.println("This is your Last Transaction:");
                last();
                System.out.println();
                break;

            default:
                System.out.println("Invalid option");
        }
    }

    void check(){
        transaction = 0;
        System.out.println(balance);
    }

    void deposit(int amount){
        if(amount > 0){
            balance += amount;
            transaction = 1;
        }
        else System.out.println("Invalid amount");
    }

    int withdraw(int amount){
        if(amount >= 0 && amount <= balance) {
            balance -= amount;
            transaction = -1;
        }
        else System.out.println("Insufficient Amount");
        return amount;
    }

    void last(){
        if(transaction == 0) System.out.println("Check Balance");
        else if (transaction > 1) System.out.println("Deposit Amount");
        else System.out.println("Withdraw Amount");
    }

    boolean isvalid(char ch){
        if (ch != 'a' & ch != 'b' & ch != 'c' & ch != 'd' & ch != 'e') return false;
        else return true;
    }
}
