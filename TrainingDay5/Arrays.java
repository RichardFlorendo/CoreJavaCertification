import java.util.Scanner;

public class Arrays {
    public static void main (String args[]){
//        Array();
//        MinMax();
//        BubbleSort();
        LookforNumber();
    }

    static void Array(){
        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10; i = i + 1) sample[i] = i;

        for (i = 0; i < 10; i = i + 1) System.out.println("This is sample [" + i + "]: " + sample[i]);

    }

    static void MinMax(){
        int nums[] = new int[10];
        int min, max;
        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;
        min = max = nums[0];

        for (int i = 1; i < 10; i++){
            System.out.println("Current min and max: " + min + " " + max);
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        System.out.println("Final min and max: " + min + " " + max);
    }

    static void BubbleSort(){
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int a, b, t;
        int size = 10;

        System.out.print("Original array is: ");
        for (int i = 0; i < size; i++) System.out.print(" " + nums[i]);
        System.out.println();

        for (a = 1; a < size; a++){
            for (b = size - 1; b >= a; b--){
                if (nums[b-1] > nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
            System.out.print("Sort state #" + a + " is: ");
            for (int i = 0; i < size; i++) System.out.print(" " + nums[i]);
            System.out.println();
        }
        System.out.print("Sorted array is:");
        for (int i = 0; i < size; i++) System.out.print(" " + nums[i]);
        System.out.println();
    }

    static void LookforNumber(){
        int a, size;
        int array[] = {56, 23, 2, 96, 14, 67, 34, 83, 70, 6};

        size = 10;
        code: while (true){
            System.out.println("Please input a number from 1 - 100 and this program will answer if it is in the Array");
            Scanner input = new Scanner(System.in);
            a = input.nextInt();

            for (int i = 0; i < size; i++) {
                if (a == array[i]) {
                    System.out.println("You found one of the numbers! It was " + a + " at location " + (i + 1) + " of the array!");
                    break code;
                }
            }
        }
    }
}
