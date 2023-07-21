import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;

public class Training {
    public static void main(String args[]) throws IOException {
        //EvenOdd();
        //Compare();
        //PositiveNegative();
        //NonZeroDivide();
        //Calculator();
        //PerimeterArea();
        //HelpSystem();
        //SimpleForLoop();
        //SimpleForLoop1();
        //SimpleForLoop2();
        //SimpleForLoop3();
        //SquareRoot();
        //DoubleLoop();
        //StopLoop();
        MissingLoop();
    }

    static void MissingLoop(){
        int i;
        i = 0;
        for(; i <= 5; ){
            System.out.println(i);
            i++;
        }
    }

    static void DoubleLoop(){
        int i, j;

        for(i = 0, j = 10; i < j; i++, j--) System.out.println("i and j: " + i + " " + j);
    }

    static void StopLoop() throws java.io.IOException{
        int i;
        System.out.println("Press S to Stop.");

        for(i = 0; (char) System.in.read() != 'S'; i++) System.out.println("Pass #: " + i);
    }

    static void SquareRoot(){
        double num, sroot, rerr;

        for (num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("The Square root of " + num + " is " + sroot);

            rerr = num - (sroot * sroot);

            System.out.println("The rounding error is " + rerr + "\n");
        }
    }

    static void SimpleForLoop3(){
        for(int i = 100; i >= -100; i -= 5) System.out.println(i);
    }
    static void SimpleForLoop(){
        for(int i = 0; i <= 100; i = i + 2) System.out.println(i);
    }

    static void SimpleForLoop1(){
        for(int i = 1; i <= 100; i = i + 2) System.out.println(i);
    }

    static void SimpleForLoop2(){
        for(int i = 0; i <= 100; i = i + 5) System.out.println(i);
    }

    static void HelpSystem() throws IOException {
        char help;

        Scanner input = new Scanner(System.in);

        System.out.println("This program will help you with If and Switch statements");
        System.out.println("Which would you want help with?");
        System.out.println("1: If");
        System.out.println("2: Switch");
        System.out.println("Input your choice:");

        help = (char) System.in.read();

        switch(help){
            case '1':
                System.out.println("If Help: \n if(condition){ \n Statements... \n } \n else{ \n Statements... \n }" );
            break;

            case '2':
                System.out.println("Switch Help: \n switch(case){ \n Statements... \n break; \n //... \n }" );
            break;

            default:
                System.out.println("Invalid selection");

        }
    }

    static void PerimeterArea(){
        int a, b;
        String type, temp;

        JOptionPane.showMessageDialog(null, "This program will help you calculate the perimeters or area of shapes.");
        type = JOptionPane.showInputDialog(null, "1 = Area, 2 = Perimeter");

        switch(type){
            case "1":
                temp = JOptionPane.showInputDialog(null, "Area of: 1 = Circle, 2 = Square, 3 = Rectangle");

                switch(temp) {
                    case "1":
                        temp = JOptionPane.showInputDialog(null, "Input the radius (r) of the circle");

                        a = Integer.parseInt(temp);

                        JOptionPane.showMessageDialog(null, "The area of the circle is " + (Math.PI * (Math.pow(a, 2))));
                        break;

                    case "2":

                        temp = JOptionPane.showInputDialog(null, "Input the length of one side (a) of the square");

                        a = Integer.parseInt(temp);

                        JOptionPane.showMessageDialog(null, "The area of the square is " + Math.pow(a, 2));
                        break;

                    case "3":

                        temp = JOptionPane.showInputDialog(null, "Input the length (l) of the rectangle");

                        a = Integer.parseInt(temp);

                        temp = JOptionPane.showInputDialog(null, "Input the width (w) of the rectangle");

                        b = Integer.parseInt(temp);

                        JOptionPane.showMessageDialog(null, "The area of the rectangle is " + (a * b));
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Invalid input sent. Try again later");
                }
                break;

            case "2":
                temp = JOptionPane.showInputDialog(null, "Perimeter of: 1 = Circle, 2 = Square, 3 = Rectangle");

                switch(temp) {
                    case "1":
                        temp = JOptionPane.showInputDialog(null, "Input the radius (r) of the circle");

                        a = Integer.parseInt(temp);

                        JOptionPane.showMessageDialog(null, "The perimeter of the circle is " + (2 * Math.PI * a));
                        break;

                    case "2":

                        temp = JOptionPane.showInputDialog(null, "Input the length of one side (a) of the square");

                        a = Integer.parseInt(temp);

                        JOptionPane.showMessageDialog(null, "The perimeter of the square is " + (4 * a));
                        break;

                    case "3":

                        temp = JOptionPane.showInputDialog(null, "Input the length (l) of the rectangle");

                        a = Integer.parseInt(temp);

                        temp = JOptionPane.showInputDialog(null, "Input the width (w) of the rectangle");

                        b = Integer.parseInt(temp);

                        JOptionPane.showMessageDialog(null, "The perimeter of the rectangle is " + (2 * (a + b)));
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Invalid input sent. Try again later");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid input sent. Try again later");
        }
    }


    static void Calculator(){
        int a, b;
        String operation;

        String temp;

        JOptionPane.showMessageDialog(null, "This program will calculate the two values you input");
        temp = JOptionPane.showInputDialog(null, "Input the first number");

        a = Integer.parseInt(temp);

        temp = JOptionPane.showInputDialog(null, "Input the second number");

        b = Integer.parseInt(temp);

        temp = JOptionPane.showInputDialog(null, "Type + for Addition, - for Subtraction, * for Multiplication, / for Division");

        operation = temp;

        switch(operation) {
            case "+":
                JOptionPane.showMessageDialog(null, "Adding " + a + " and " + b + " results to: " + (a + b));
                break;

            case "-":
                JOptionPane.showMessageDialog(null, "Subtracting " + a + " and " + b + " results to: " + (a - b));
                break;

            case "*":
                JOptionPane.showMessageDialog(null, "Multiplying " + a + " and " + b + " results to: " + (a * b));
            break;

            case "/":
                JOptionPane.showMessageDialog(null, "Dividing " + a + " and " + b + " results to: " + (a / b));
            break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid Symbol sent, Try again later");
        }
    }
    static void NonZeroDivide(){
        int number;

        for (int i = -5; i < 6; i++){
            if(i != 0 ? true : false) System.out.println("100 / " + i + " is " + 100 / i);
        }
    }


    static void EvenOdd(){
        int value;
        String result;

        System.out.println("Please input a number and this program will determine if it is an odd or even number: ");
        Scanner input = new Scanner(System.in);

        value = input.nextInt();

        result = value %2== 0 ? value + " is even": value + "is odd";
        System.out.println(result);
    }

    static void Compare(){
        int a, b;
        String result;

        System.out.println("Please input 2 numbers and this program will determine which number is bigger: ");
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the first number: ");
        a = input.nextInt();

        System.out.println("Please input the second number: ");
        b = input.nextInt();

        result = a > b ? "The first number " + a + " is bigger than the second number " + b: "The second number " + b + " is bigger than the first number " + a;
        System.out.println(result);
    }

    static void PositiveNegative(){
        int a;
        String result;

        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number and this program will check if it is a positive or negative number");

        a = input.nextInt();

        result = a > 0 ? "The number is positive" : "The number is negative";

        System.out.println(result);
    }
}
