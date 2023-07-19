import java.util.Scanner;

public class Calculation {

    public static void main(String args[]){
        CirclePer();
        CircleArea();
        SquarePer();
        SquareArea();
        RectPer();
        RectArea();
    }

    static void CirclePer(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the length of the radius to compute the Perimeter of the circle");
        System.out.println("Input the radius: ");

        int a = input.nextInt();

        System.out.println("The Perimeter of your circle is: " + (2 * Math.PI * Math.pow(a , 2)));
    }

    static void CircleArea(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the length of the radius to compute the Area of the circle");
        System.out.println("Input the radius: ");

        int a = input.nextInt();

        System.out.println("The Perimeter of your circle is: " + (Math.PI * Math.pow(a, 2)));
    }

    static void SquarePer(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the length of one side to calculate the Perimeter of the square");
        System.out.println("Input the length of one side: ");

        int a = input.nextInt();

        System.out.println("The Perimeter of your square is: " + (4 * a));
    }

    static void SquareArea(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the length of one side to calculate the Area of the square");
        System.out.println("Input the length of one side: ");

        int a = input.nextInt();

        System.out.println("The Area of your square is: " + (Math.pow(a, 2)));
    }

    static void RectPer(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the length of one side to calculate the Perimeter of the rectangle");
        System.out.println("Input the length: ");

        int a = input.nextInt();

        System.out.println("Input the width: ");

        int b = input.nextInt();

        System.out.println("The Perimeter of your rectangle is: " + (2 * (a + b)));
    }

    static void RectArea(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the length and width to calculate the Area of the rectangle");
        System.out.println("Input the length: ");

        int a = input.nextInt();

        System.out.println("Input the width: ");

        int b = input.nextInt();

        System.out.println("The Area of your rectangle is: " + (a * b));
    }
}
