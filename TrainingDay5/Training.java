import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;

public class Training {

    public static void main(String args[]) throws IOException {
//        LabelBreak();
//        Continue();
//        ContinueLabel();
//        HelpSystemBreak();
//        PrimeNumbers();
//        Factorial();
//        Ticket();
    }

    static void Ticket(){
        char ch;
        int age, total = 0;
        String temp;

        JOptionPane.showMessageDialog(null, "This application will calculate your total ticket price based on the ages you input");
        try {
            while (true) {
                temp = JOptionPane.showInputDialog(null, "Input the ages below (Or input 'q' to exit): ");
                if (temp == "q") break;
                age = Integer.parseInt(temp);

                if (age < 11) total += 0;
                else if (age >= 11 && age < 20) total += 10;
                else if (age >= 20 && age <= 59) total += 20;
                else total += 0;
            }
        }
        catch (NumberFormatException exception){

        }
        JOptionPane.showMessageDialog(null, "Your total ticket price is: " + total + " Dirhams.");
    }

    static void Factorial(){
        int a, b, i;

        System.out.println("Input a number and this application will show you its Factorial value (n!)");

        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        i = a - 1;
        b = a;

        do {
            a += i;
            b *= i;
            i--;
        } while (i > 0);
        System.out.println("The Sum of " + a + " is: ");
        System.out.println(a);

        System.out.println("The Factorial of " + a + " is: ");
        System.out.println(b);
    }

    static void PrimeNumbers(){
        System.out.println("Here are a list of Prime Numbers fromm 1 - 100");
        for (int i = 2; i <= 100; i++){
            int a = 0;
            for (int j = 1; j < i; j++){
                if ((i % j) == 0) a++;
            }
            if (a <= 1) System.out.println(i);
        }
    }

    static void LabelBreak(){
        int x, y;
        stop1: for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++){
                if (y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();

        for (x = 0; x < 5; x++){
            stop2: {
                for (y = 0; y < 5; y++){
                    if (y == 2) break stop2;
                    System.out.println("x2 and y2: " + x + " " + y);
                }
            }
        }
    }

    static void Continue(){
        int i;
        for (i = 0; i <= 100; i++){
            if (i % 2 != 0) continue;
            System.out.println(i);
        }
    }

    static void ContinueLabel(){
        outerloop:
            for (int i = 1; i < 10; i++){
                System.out.print("\n Outer loop pass " + i + ", Inner loop: ");
                for (int j = 1; j < 10; j++){
                    if (j == 5) continue outerloop;
                    System.out.print(j);
                }
            }
    }

    static void HelpSystemBreak() throws IOException {
        char help;

        Scanner input = new Scanner(System.in);
        for(;;){
            do {
                System.out.println("This program will help you remember the formats of some functions");
                System.out.println("Which would you want help with?");
                System.out.println("1: If");
                System.out.println("2: Switch");
                System.out.println("3: For");
                System.out.println("4: While");
                System.out.println("5: Do-While");
                System.out.println("6: Break");
                System.out.println("7: Continue");
                System.out.print("Input your choice or 'q' to quit: ");

                do {
                    help = (char) System.in.read();
                } while (help == '\n' | help == '\r');
            } while (help < '1' | help > '7' & help != 'q');
            if (help == 'q') break;

            System.out.println("\n");
            switch (help) {
                case '1':
                    System.out.println("If Help: \n if(condition){ \n Statements...; \n } \n else{ \n Statements...; \n }");
                    break;

                case '2':
                    System.out.println("Switch Help: \n switch(case){ \n Statements...; \n break; \n //... \n }");
                    break;

                case '3':
                    System.out.println("For Help: \n for(initialize; end condition; iteration){ \n Statements...; \n }");
                    break;

                case '4':
                    System.out.println("While Help: \n while(condition){ \n Statements...; \n }");
                    break;

                case '5':
                    System.out.println("Do-While Help: \n do{ \n Statements...; \n } while(condition);");
                    break;

                case '6':
                    System.out.println("Break: \n break; or break label;");
                    break;

                case '7':
                    System.out.println("Continue: \n continue; or continue label;");
                    break;

                default:
                    System.out.println("Invalid selection");

            }
        System.out.println("\n");
        }
    }
}
