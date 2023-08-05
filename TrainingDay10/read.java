import java.io.*;
public class read {
    public static void main(String args[]){
        int s = 6;
        int b[] = new int[6];
        char c[] = new char[6];

        try{
            FileInputStream f = new FileInputStream("read.java");
            for(int i = 0; i < 6; i++) {
                b[i] = f.read();
                c[i] = (char) b[i];
            }

            System.out.println("\n\n First 6 Bytes of the file:");
            for(int i = 0; i < 6; i++) System.out.print(b[i] + " ");

            System.out.println("\n\n First 6 Bytes as characters:");
            for(int i = 0; i < 6; i++) System.out.print(c[i]);

        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
