import java.util.*;

public class ArraysandFuntions {

    public static void main(String args[]){
//        ArrayReference();
//        ArrayLength();
//        ArrayCopy();
//        QDemo();
//        EnhancedLoop();
//        StringSample();
//        StringMethods();
//        StringArray();
//        SubString();
//        ArrayList();
        ComparableSample();
    }

    static void ComparableSample(){
        List ts1 = new ArrayList();
        ts1.add(new Employee("Tom", 40000.00));
        ts1.add(new Employee("Harry", 20000.00));
        ts1.add(new Employee("Maggie", 50000.00));
        ts1.add(new Employee("Chris", 70000.00));

        Collections.sort(ts1);
        Iterator itr = ts1.iterator();

        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element + "\n");
        }
    }

    static void ArrayList(){
        ArrayList al = new ArrayList();
        System.out.println("Initial size of al: " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("size of al after: " + al.size());

        System.out.println("contents of al: " + al);

        al.remove("F");
        al.remove(2);
        System.out.print("size after deletions: " + al.size());
        System.out.println();
        System.out.print("contents of al: " + al);
    }

    static void SubString(){
        String orig = "Java makes the Web move.";

        String subst = orig.substring(5, 18);
        System.out.println("Original String: " + orig);
        System.out.println("Sub String: " + subst);
    }

    static void StringArray(){
        String strs[] = {"This", "is", "a", "test."};

        System.out.print("Original array: ");
        for(String s: strs) System.out.print(s + " ");
        System.out.println("\n");

        strs[1] = "was";
        strs[3] = "test, too!";

        System.out.print("Modified array: ");
        for(String s: strs) System.out.print(s + " ");
        System.out.println("\n");
    }

    static void StringMethods(){
        String str1 = "When it comes to Web programming, Java is #1.";
        String str2 = new String(str1);
        String str3 = "Java strings are powerful";
        int result, idx;
        char ch;

        System.out.println("Length of str1: " + str1.length());

        for(int i=0; i < str1.length(); i++) System.out.print(str1.charAt(i));
        System.out.println();

        if(str1.equals(str2)) System.out.println("str1 equals str2");
        else System.out.println("Str1 does not equal str2");

        if(str1.equals(str3)) System.out.println("str1 equals str3");
        else System.out.println("str1 does not equal str3");

        result = str1.compareTo(str3);

        if(result == 0) System.out.println("str1 and str3 are equal");
        else if (result < 0) System.out.println("str1 is less than str3");
        else System.out.println("Str1 is greater than str3");

        str2 = "One Two Three One";
        idx = str2.indexOf("One");

        System.out.println("The Index of the first occurrence of 'One': " + idx);

        idx = str2.lastIndexOf("One");

        System.out.println("The Index of the last occurrence of 'One': " + idx);
    }

    static void StringSample(){
        String str1 = new String("Java strings are objects.");
        String str2 = "They are constructed in various ways";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
    static void EnhancedLoop(){
        int nums[] = {1, 2, 3, 4, 5, 6 ,7 , 8, 9, 10};
        int sum = 0;

        for(int x: nums){
            System.out.println("Value is: " + x);
            sum += x;
        } System.out.println("Summation is: " + sum);
    }

    static void ArrayReference(){
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (i = 0; i < 10; i++) nums1[i] = i;

        for (i = 0; i < 10; i++) nums2[i] = -i;

        System.out.print("Here us nums1: ");
        for(i = 0; i < 10; i++) System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.print("Here us nums2: ");
        for(i = 0; i < 10; i++) System.out.print(nums2[i] + " ");
        System.out.println();

        nums2 = nums1;

        System.out.println("Here is nums2 after assignment: ");
        for (i = 0; i < 10; i++) System.out.print(nums2[i] + " ");
        System.out.println();

        nums2[3] = 99;

        System.out.print("Here us nums1 after change through nums2: ");
        for(i = 0; i < 10; i++) System.out.print(nums1[i] + " ");
        System.out.println();
    }

    static void ArrayLength(){
        int list[] = new int[10];
        int nums[] = {1, 2, 3};
        int table[][] = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        System.out.println("The length of list array is: " + list.length);

        System.out.println("The length of nums array is: " + nums.length);

        System.out.println("The length of table array is: " + table.length);

        System.out.println("The length of table[0] is: " + table[0].length);

        System.out.println("The length of table[1] is: " + table[1].length);

        System.out.println("The length of table[2] is: " + table[2].length);

        System.out.println();

        for (int i = 0; i < list.length; i++) list[i] = i * i;
        System.out.print("Here is list array: ");

        for (int i = 0; i < list.length; i++) System.out.print(list[i] + " ");
        System.out.println();
    }

    static void ArrayCopy(){
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for(i = 0; i < nums1.length; i++) nums1[i] = i;
        if(nums2.length >= nums1.length) {
            for(i = 0; i <nums2.length; i++) nums2[i] = nums1[i];
        }

        for(i = 0; i < nums2.length; i++) System.out.print(nums2[i] + " ");
    }


    static void QDemo() {
        Queue biqQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using BigQ to store the alphabet.");

        for(i = 0; i < 26; i++) biqQ.put((char) ('A' + i));

        System.out.print("Contents of BigQ: ");
        for(i = 0; i < 26; i++){
            ch = biqQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Using SmallQ to generate errors.");

        for(i = 0; i < 5; i++){
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }

        System.out.print("Contents of SmallQ: ");
        for(i = 0; i < 5; i++){
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }

}
