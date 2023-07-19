import javax.swing.*;
import java.io.IOException;

public class Swing {

    public static void main (String args[]) throws IOException {
        //Average();
        //GuessingGame();
        //NestedIf();
        //CompareThree();
        //TicketPrice();
        Grading();
    }

    static void Grading(){
        String temp;
        int average;

        JOptionPane.showMessageDialog(null, "This program will check the student's grade based on their grades on 4 subjects");

        temp = JOptionPane.showInputDialog(null, "Please input the student's grade in Mathematics");

        int a = Integer.parseInt(temp);

        temp = JOptionPane.showInputDialog(null, "Please input the student's grade in Science");

        int b = Integer.parseInt(temp);

        temp = JOptionPane.showInputDialog(null, "Please input the student's grade in History");

        int c = Integer.parseInt(temp);

        temp = JOptionPane.showInputDialog(null, "Please input the student's grade in Social Studies");

        int d = Integer.parseInt(temp);

        average = (a + b + c + d) / 4;

        if (average >= 90) JOptionPane.showMessageDialog(null, "The student's average is " + average + " and they get an A");
        else if (average >= 80 && average < 90) JOptionPane.showMessageDialog(null, "The student's average is " + average + " and they get a B");
        else if (average >= 70 && average < 80) JOptionPane.showMessageDialog(null, "The student's average is " + average + " and they get a C");
        else if (average >= 60 && average < 70) JOptionPane.showMessageDialog(null, "The student's average is " + average + " and they get a D");
        else JOptionPane.showMessageDialog(null, "The student's average is " + average + " and they get an F");
    }

    static void TicketPrice(){
        String temp;

        JOptionPane.showMessageDialog(null, "This program will check the price of your ticket based on your age");

        temp = JOptionPane.showInputDialog(null, "Please input your Age here");

        int a = Integer.parseInt(temp);

        if (a <= 12) JOptionPane.showMessageDialog(null, "Kids aged 12 and below have free admission");
        else if (a > 12 && a <= 17) JOptionPane.showMessageDialog(null, "Adolescent Ticket price is 10 AED");
        else if (a > 17 && a <= 59) JOptionPane.showMessageDialog(null, "Regular ticket price is 50 AED");
        else JOptionPane.showMessageDialog(null, "Adults aged 60 and above have free admission");
    }

    static void CompareThree(){
        String temp;

        JOptionPane.showMessageDialog(null, "This program will check which of the three numbers you input are bigger");

        temp = JOptionPane.showInputDialog(null, "Please input your First Number here");

        int a = Integer.parseInt(temp);

        temp = JOptionPane.showInputDialog(null, "Please input your Second Number here");

        int b = Integer.parseInt(temp);

        temp = JOptionPane.showInputDialog(null, "Please input your Third Number here");

        int c = Integer.parseInt(temp);


        if(a > b){
            if(a > c) JOptionPane.showMessageDialog(null, "The first number " + a + " is bigger than the second number " + b + " and the third number " + c);
            else if(c > a) JOptionPane.showMessageDialog(null, "The third number " + c + " is bigger than the first number " + a + " and the second number " + b);
            else if (a == c) JOptionPane.showMessageDialog(null, "Both the first " + a + " and third numbers " + c + " are equally bigger than the second number " + b);
        }

        else if (b > a){
            if(b > c) JOptionPane.showMessageDialog(null, "The second number " + b + " is bigger than the first number " + a + " and the third number " + c);
            else if(c > b) JOptionPane.showMessageDialog(null, "The third number " + c + " is bigger than the first number " + a + " and the second number " + b);
            else if (b == c) JOptionPane.showMessageDialog(null, "Both the second " + b + " and third numbers " + c + " are equally bigger than the first number " + a);
        }

        else if (a == b) {
            if(a > c && b > c) JOptionPane.showMessageDialog(null, "Both the first " + a + " and second numbers " + b + " are equally bigger than the third number " + c);
            if(a == c && b == c) JOptionPane.showMessageDialog(null, "All three numbers are equal to " + a);
            else JOptionPane.showMessageDialog(null, "The third number " + c + " is bigger than the first number " + a + " and the second number " + b);
        }


        else JOptionPane.showMessageDialog(null, "All three numbers are equal to " + a);
    }

    static void NestedIf(){
        int x;

        for(x = 0; x < 6; x++){
            if(x == 1) System.out.println("X is one");
            else if(x == 2) System.out.println("X is two");
            else if(x == 3) System.out.println("X is three");
            else if(x == 4) System.out.println("X is four");
            else  System.out.println("X is not between 1 and 4");
        }
    }

    static void GuessingGame()
    throws java.io.IOException{
        char ch, answer = 'J';

        System.out.println("I'm thinking of a letter between A and Z");
        System.out.println("Try to guess which it is!");

        ch = (char) System.in.read();

        if(ch == answer) System.out.println("**! You got it !**");
        else{
            System.out.print("Wrong, try again next time! You were ");

            if(ch < answer) System.out.print("too low");
            else System.out.print("too high");
        }
    }

    static void Average(){
        String temp;

        JOptionPane.showMessageDialog(null, "This program will check which of the two numbers you input are bigger");

        temp = JOptionPane.showInputDialog(null, "Please input your First Number here");

        int a = Integer.parseInt(temp);

        temp = JOptionPane.showInputDialog(null, "Please input your Second Number here");

        int b = Integer.parseInt(temp);

        if(a > b) JOptionPane.showMessageDialog(null, "The first number " + a + " is bigger than the second number " + b);

        else if (b > a) JOptionPane.showMessageDialog(null, "The second number " + b + " is bigger than the first number " + a);

        else JOptionPane.showMessageDialog(null, "Both numbers are equal to " + a);
    }
}
