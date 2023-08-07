import java.awt.*;
import java.io.IOException;
import java.util.Scanner;
public class Banking {

    public static void main(String args[]) throws IOException {
        char choice;
        Transaction tran = new Transaction();

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the bank");
        System.out.println("Please input your name:");
        in.next();
        System.out.println("Please input your pin");
        in.next();

        for(;;){
            do{
                tran.menu();
                do{
                    choice = (char) System.in.read();
                } while(choice == '\n' | choice == '\r');
            } while(!tran.isvalid(choice));

            if(choice == 'e') break;
            System.out.println("\n");
            tran.input(choice);
        }
    }
}
