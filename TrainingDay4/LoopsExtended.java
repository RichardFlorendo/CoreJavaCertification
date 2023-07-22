import java.io.IOException;

public class LoopsExtended {

    public static void main(String args[]) throws IOException {
        //LoopBreak();
        //LoopBreak2();
        //LoopBreak3();
        //LabelBreak();
        LabelBreak2();
    }

    static void LabelBreak2(){
        done:
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < 10; j++){
                    for(int k = 0; k < 10; k++){
                        System.out.println(k);
                        if (k == 5) break done;
                    }
                    System.out.println("After K Loop");
                }
                System.out.println("After J Loop");
            }
            System.out.println("After I Loop");
    }

    static void LabelBreak(){
        int i;

        for(i = 1; i < 4; i++){
            one:{
                two:{
                    three:{
                        System.out.println("\ni is " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;

                        System.out.println("won't print");
                    } System.out.println("After block three.");
                } System.out.println("After block two.");
            } System.out.println("After block one.");
        }
        System.out.println("After For Loop.");
    }

    static void LoopBreak3(){
        for(int i = 0; i < 3; i++){
            System.out.println("Outer loop count: " + i);
            System.out.print("Inner loop count: " );
            int t = 0;
            while(t < 100){
                if(t == 10) break;
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loops complete");
    }

    static void LoopBreak2() throws IOException {
        char ch;

        for( ; ; ){
            ch = (char) System.in.read();

            if(ch == 'q') break;
        }
        System.out.println("You pressed q! Program exited");
    }

    static void LoopBreak(){
        int num;
        num = 100;

        for(int i = 0; i < num; i++){
            if(i * i >= 100) break;
            System.out.print(i + " ");
        }
        System.out.println("Loop Complete");
    }
}
