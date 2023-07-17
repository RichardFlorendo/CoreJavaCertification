import java.util.Scanner;

public class Training {

    public static void main(String args[]){
        //Average();
        //Hypotenuse();
        //Quadratic();

    }

    static void Average(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please input 3 numbers to see their average");
        System.out.println("Input your first number: ");

        int a = input.nextInt();

        System.out.println("Input your second number: ");

        int b = input.nextInt();

        System.out.println("Input your last number: ");

        int c = input.nextInt();

        System.out.println("The average of your numbers is: " + ((a + b + c) / 3));
    }

    static void Hypotenuse(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please input 2 sides of a right triangle to see the length of the hypotenuse");
        System.out.println("Input your first number: ");

        int a = input.nextInt();

        System.out.println("Input your second number: ");

        int b = input.nextInt();

        System.out.println("The length of the hypotenuse is: " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }

    static void Quadratic(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please input 3 numbers to see get the values of x");
        System.out.println("Input your first number: ");

        int a = input.nextInt();

        System.out.println("Input your second number: ");

        int b = input.nextInt();

        System.out.println("Input your last number: ");

        int c = input.nextInt();

        System.out.println("The first value is: " + ((-1 * b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/ (2 * a)));
        System.out.println("The second value is: " + ((-1 * b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a)));
    }
}
