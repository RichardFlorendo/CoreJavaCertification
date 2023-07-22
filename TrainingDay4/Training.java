import java.io.IOException;
import java.util.Scanner;

public class Training {

    public static void main(String args[]) throws IOException {
        //NoBody();
        //Factorial();
        //WhileLoop1();
        //Powers();
        //WhileLoop2();
        //WhileLoop3();
        //WhileFactorial();
        //DoWhile();
        //DoWhile2();
        //DoWhile3();
        //GuessingGame();
        //HelpSystem();
        HelpSystemDoWhile();
    }

    static void HelpSystemDoWhile() throws IOException {
        char help;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("This program will help you remember the formats of some functions");
            System.out.println("Which would you want help with?");
            System.out.println("1: If");
            System.out.println("2: Switch");
            System.out.println("3: For");
            System.out.println("4: While");
            System.out.println("5: Do-While");
            System.out.print("Input your choice: ");

            do {
                help = (char) System.in.read();
            } while (help == '\n' | help == '\r');
        } while (help < '1' | help > '5');

        System.out.println();
        switch(help){
            case '1':
                System.out.println("If Help: \n if(condition){ \n Statements...; \n } \n else{ \n Statements...; \n }" );
                break;

            case '2':
                System.out.println("Switch Help: \n switch(case){ \n Statements...; \n break; \n //... \n }" );
                break;

            case '3':
                System.out.println("For Help: \n for(initialize; end condition; iteration){ \n Statements...; \n }" );
                break;

            case '4':
                System.out.println("While Help: \n while(condition){ \n Statements...; \n }" );
                break;

            case '5':
                System.out.println("Do-While Help: \n do{ \n Statements...; \n } while(condition);" );
                break;

            default:
                System.out.println("Invalid selection");

        }
    }

    static void HelpSystem() throws IOException {
        char help;

        Scanner input = new Scanner(System.in);

        System.out.println("This program will help you remember the formats of some functions");
        System.out.println("Which would you want help with?");
        System.out.println("1: If");
        System.out.println("2: Switch");
        System.out.println("3: For");
        System.out.println("4: While");
        System.out.println("5: Do-While");
        System.out.print("Input your choice: ");

        help = (char) System.in.read();

        switch(help){
            case '1':
                System.out.println("If Help: \n if(condition){ \n Statements...; \n } \n else{ \n Statements...; \n }" );
                break;

            case '2':
                System.out.println("Switch Help: \n switch(case){ \n Statements...; \n break; \n //... \n }" );
                break;

            case '3':
                System.out.println("For Help: \n for(initialize; end condition; iteration){ \n Statements...; \n }" );
                break;

            case '4':
                System.out.println("While Help: \n while(condition){ \n Statements...; \n }" );
                break;

            case '5':
                System.out.println("Do-While Help: \n do{ \n Statements...; \n } while(condition);" );
                break;

            default:
                System.out.println("Invalid selection");

        }
    }

    static void GuessingGame() throws IOException {
        char ch, answer = 'K';

        do{
            System.out.println("I'm thinking of a letter between A to Z");
            System.out.print("Can you guess which it is: ");

            do{
                ch = (char) System.in.read();
            }
            while (ch == '\n' | ch == '\r');

            if(ch == answer) System.out.println("!-- You got it --!");
            else {
                System.out.print("Sorry, you're ");
                if (ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again! \n");
            }
        }
        while (answer != ch);
    }

    static void DoWhile3(){
        int sum = 0, fact = 1, i = 1, a = 5;

        do{
            sum += i;
            fact *= i;
            i++;
        }
        while (i <= 5);
        System.out.println("The Sum of 5 is " + sum);
        System.out.println("The Factorial of 5 is " + fact);
    }

    static void DoWhile2(){
        int i = 1, j = 10;

        do{
            System.out.println("The values of i and j are " + i + " " + j);
            i++;
            j--;
        }
        while(i <= j);
    }

    static void DoWhile() throws IOException {
        char ch;
        do{
            System.out.println("Press a key followed by ENTER: ");
            ch = (char) System.in.read();
        }
        while(ch != 'q');
    }

    static void WhileFactorial(){
        int i = 1;
        int a, fact = 1, sum = 0;

        System.out.println("Input a number to see its Sum total and Factorial value");

        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        while(i <= a){
            fact *= i;
            sum += i;
            i++;
        }
        System.out.println("The Sum is " + sum);
        System.out.println("The Factorial is " + fact);
    }

    static void WhileLoop3() throws IOException {
        int i = 1;

        System.out.println("Type and Enter any key to progress. Send 'S' to stop");
    while((char)System.in.read() != 'S'){
            System.out.println("Pass #: " + i);
            i++;
        }
    }

    static void WhileLoop2(){
        int i = 0, j = 10;

        while(i < j){
            System.out.println("The values of i and j are " + i + " " + j);
            i++;
            j--;
        }
    }

    static void Powers(){
        int e, result;

        for(int i = 0; i < 10; i++){
            result = 1;
            e = i;
            while(e > 0){
                result *= 2;
                e--;
            }
            System.out.println("2 to the power of " + i + " is " + result);
        }
    }

    static void WhileLoop1(){
        char ch = 'a';

        while(ch <= 'z'){
            System.out.println(ch);
            ch++;
        }
    }

    static void NoBody(){
        int i, a;

        int sum = 0;

        System.out.println("Input a number then this program will count up all the numbers from one until it");

        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        for (i = 1; i <= a; sum += i++);
        System.out.println("Sum is " + sum);
    }

    static void Factorial(){
        int a;
        int sum = 0;
        int fact = 1;

        System.out.println("Input a number then this program will count up all the numbers from one until it, as well as its Factorial");

        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        for(int i = 1; i <= a; i++){
            sum += i;
            fact *= i;
        }
        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
    }


}
