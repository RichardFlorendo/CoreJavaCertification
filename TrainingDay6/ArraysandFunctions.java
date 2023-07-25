import java.util.Scanner;

public class ArraysandFunctions {

    public static void main(String args[]){
        //TwoDArray();
        //MatrixAdd();
        MatrixMultiply();
    }

    static void TwoDArray(){
        int row, column;
        int table [][] = new int[3][4];

        for(row = 0; row < 3; ++row){
            for(column = 0; column < 4; ++column){
                table[row][column] = (row * 4) + column + 1;

                System.out.print(table[row][column] + " ");
            }
            System.out.println();
        }
    }

    static void MatrixAdd() {
        Scanner input = new Scanner(System.in);

        int row1, column1;
        int table1[][] = new int[3][3];

        int row2, column2;
        int table2[][] = new int[3][3];

        int row3, column3;
        int sum[][] = new int[3][3];

        System.out.println("This program will add and multiply 2 matrices of size 3x3. Please input the values for each matrix:");

         for (row1 = 0; row1 < 3; ++row1) {

            for (column1 = 0; column1 < 3; ++column1) {

                System.out.print("Input the values for the first matrix at the " + row1 + ":" + column1 + " position");

                table1[row1][column1] = input.nextInt();
            }
        }

         System.out.println();

        for (row2 = 0; row2 < 3; row2++) {

            for (column2 = 0; column2 < 3; column2++) {

                System.out.print("Input the values for the second matrix at the " + row2 + ":" + column2 + " position");

                table2[row2][column2] = input.nextInt();
            }
        }

        System.out.println("This is your first matrix: ");
        for (row1 = 0; row1 < 3; ++row1) {

            for (column1 = 0; column1 < 3; ++column1) {

                System.out.print(table1[row1][column1] + " ");
            }
            System.out.println();
        }

        System.out.println("This is your second matrix: ");
        for (row2 = 0; row2 < 3; ++row2) {

            for (column2 = 0; column2 < 3; ++column2) {

                System.out.print(table2[row2][column2] + " ");
            }
            System.out.println();
        }

        System.out.println("This is the sum of both of your matrices: ");
        for (row3 = 0; row3 < 3; ++row3) {

            for (column3 = 0; column3 < 3; ++column3) {

                sum[row3][column3] = table1[row3][column3] + table2[row3][column3];

                System.out.print(sum[row3][column3] + " ");
            }
            System.out.println();
        }

    }

    static void MatrixMultiply() {
        Scanner input = new Scanner(System.in);

        int a, b, c, d;

        int row1, column1;
        int table1[][] = new int[3][3];

        int row2, column2;
        int table2[][] = new int[3][3];

        int row3, column3, multiply3;
        int mul[][] = new int[3][3];

        System.out.println("This program will add and multiply 2 matrices of your input. Please input the size and values for each matrix:");

        System.out.print("Input the row size of the first matrix:");
        a = input.nextInt();

        System.out.print("Input the column size of the first matrix:");
        b = input.nextInt();

        System.out.print("Input the row size of the second matrix:");
        c = input.nextInt();

        System.out.print("Input the column size of the decond matrix:");
        d = input.nextInt();

        if (b == c) {
            for (row1 = 0; row1 < a; ++row1) {

                for (column1 = 0; column1 < b; ++column1) {

                    System.out.print("Input the values for the first matrix at the " + row1 + ":" + column1 + " position");

                    table1[row1][column1] = input.nextInt();
                }
            }

            System.out.println();

            for (row2 = 0; row2 < c; ++row2) {

                for (column2 = 0; column2 < d; ++column2) {

                    System.out.print("Input the values for the second matrix at the " + row2 + ":" + column2 + " position");

                    table2[row2][column2] = input.nextInt();
                }
            }

            System.out.println("This is your first matrix: ");
            for (row1 = 0; row1 < a; ++row1) {

                for (column1 = 0; column1 < b; ++column1) {

                    System.out.print(table1[row1][column1] + " ");
                }
                System.out.println();
            }

            System.out.println("This is your second matrix: ");
            for (row2 = 0; row2 < c; ++row2) {

                for (column2 = 0; column2 < d; ++column2) {

                    System.out.print(table2[row2][column2] + " ");
                }
                System.out.println();
            }

            for (row3 = 0; row3 < b; ++row3) {

                for (column3 = 0; column3 < c; ++column3) {

                    mul[row3][column3] = 0;

                    for (multiply3 = 0; multiply3 < 3; ++multiply3) {

                        mul[row3][column3] += table1[row3][multiply3] * table2[multiply3][column3];
                    }
                }
            }

            System.out.println("This is the product of both of your matrices: ");
            for (row3 = 0; row3 < a; ++row3) {

                for (column3 = 0; column3 < d; ++column3) {

                    System.out.print(mul[row3][column3] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("It is not possible to multiply these two matrices with different Matrix 1 Row and Matrix 2 Column size");
        }
    }
}
