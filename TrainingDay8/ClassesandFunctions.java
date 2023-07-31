import java.io.IOException;
import java.util.Scanner;

public class ClassesandFunctions {

    int x;
    public static void main(String args[]) throws IOException {
//        MethodSample();
//        EmployeeSample();
//        ParameterSample();
//        HelpSytstem();
//        ConstructorDemo();
//        ConstructorDemo2();
        OverloadCalculation();
    }

    static void OverloadCalculation(){
        Calculation calc = new Calculation();
        int a, b, resultI;
        double c, d, resultD;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose from 1-4 and the program will calculate the Area of your chosen shape:");
        System.out.println("1: Square");
        System.out.println("2: Rectangle");
        System.out.println("3: Circle");
        System.out.println("4: Triangle");

        a = input.nextInt();

        switch (a) {
            case (1):
                System.out.println("Input one side of the square: ");
                a = input.nextInt();

                resultI = calc.Calculate(a);
                System.out.println("The Area of the Square with side length " + a + " is: " + resultI);
                break;

            case (2):
                System.out.println("Input the length of the rectangle: ");
                a = input.nextInt();

                System.out.println("Input the width of the rectangle: ");
                b = input.nextInt();

                resultI = calc.Calculate(a, b);
                System.out.println("The Area of the Rectangle with length " + a + " and width " + b + " is: " + resultI);
                break;

            case (3):
                System.out.println("Input the radius of the circle: ");
                c = input.nextDouble();

                resultD = calc.Calculate(c);
                System.out.println("The Area of the Circle with radius " + c + " is: " + resultD);
                break;

            case (4):
                System.out.println("Input the base of the triangle: ");
                c = input.nextDouble();

                System.out.println("Input the height of the rectangle: ");
                d = input.nextDouble();

                resultD = calc.Calculate(c, d);
                System.out.println("The Area of the Triangle with base " + c + " and height " + d + " is: " + resultD);
                break;

            default:
                break;

        }
    }


    static void OverloadMethods(){
        Overload ov = new Overload();
        int resI;
        double resD;

        ov.ovlDemo();
        System.out.println();

        ov.ovlDemo(2);
        System.out.println();

        resI = ov.ovlDemo(4, 6);
        System.out.println("Result of ov.ovlDemo(4, 6): " + resI);
        System.out.println();

        resD = ov.ovlDemo(1.1, 2.32);
        System.out.println("Result of ov.ovlDemo(1.1, 2.32): " + resD);
        System.out.println();
    }

    static void ConstructorDemo(){
        Sample sample1 = new Sample(10);
        Sample sample2 = new Sample(88);

        System.out.println(sample1.x + " " + sample2.x);
    }

    static void ConstructorDemo2(){
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Minivan needs " + gallons + " gallons of fuel to travel " + dist + " miles.");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("Sportscar needs " + gallons + " gallons of fuel to travel " + dist + " miles.");
    }

    static void HelpSytstem() throws IOException {
        char choice;
        Help helpobj = new Help();

        for(;;){
            do{
                helpobj.showmenu();
                do{
                    choice = (char) System.in.read();
                } while(choice == '\n' | choice == '\r');
            } while(!helpobj.isvalid(choice));

            if(choice == 'q') break;
            System.out.println("\n");
            helpobj.helpon(choice);
        }
    }

//    static void ParameterSample(){
//        Vehicle minivan = new Vehicle();
//        Vehicle sportscar = new Vehicle();
//        int dist = 252;
//        double gallons;
//
//        minivan.passengers = 7;
//        minivan.fuelcap = 16;
//        minivan.mpg = 21;
//        gallons = minivan.fuelneeded(dist);
//
//        System.out.println("Minivan needs " + gallons + " gallons of fuel to travel " + dist + " miles.");
//
//        sportscar.passengers = 2;
//        sportscar.fuelcap = 14;
//        sportscar.mpg = 12;
//        gallons = sportscar.fuelneeded(dist);
//
//        System.out.println("Sportscar needs " + gallons + " gallons of fuel to travel " + dist + " miles.");
//    }

//    static void MethodSample(){
//        Vehicle minivan = new Vehicle();
//        Vehicle sportscar = new Vehicle();
//        int range1, range2;
//
//        minivan.passengers = 7;
//        minivan.fuelcap = 16;
//        minivan.mpg = 21;
//
//        sportscar.passengers = 2;
//        sportscar.fuelcap = 14;
//        sportscar.mpg = 12;
//
//        range1 = minivan.range();
//        range2 = sportscar.range();
//
//        System.out.print("Minivan has a range of " + range1 + " miles");
//        minivan.capacitydisplay();
//
//        System.out.println();
//
//        System.out.print("Sportscar has a range of " + range2 + " miles");
//        sportscar.capacitydisplay();
//    }

    static void EmployeeSample(){
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.employeeId = "0101";
        employee1.employeeName = "John Doe";
        employee1.basicSalary = 1000;
        employee1.allowance = 200;
        employee1.deductions = 300;

        employee2.employeeId = "0053";
        employee2.employeeName = "Jane Does";
        employee2.basicSalary = 4000;
        employee2.allowance = 500;
        employee2.deductions = 600;

        employee1.employeeDisplay();
        employee2.employeeDisplay();
    }
}
