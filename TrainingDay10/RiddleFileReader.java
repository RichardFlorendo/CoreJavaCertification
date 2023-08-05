import java.io.*;
import java.util.Scanner;
public class RiddleFileReader {
    private Scanner fileScan;
    private Scanner kbScan;

    public RiddleFileReader(String fName){
        kbScan = new Scanner(System.in);

        try{
            File theFile = new File(fName);
            fileScan = new Scanner(theFile);
            fileScan = fileScan.useDelimiter("\r\n");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public Riddle readRiddle(){
        String ques = null;
        String ans = null;

        Riddle theRiddle = null;

        if(fileScan.hasNext()) ques = fileScan.next();

        if(fileScan.hasNext()) {
            ans = fileScan.next();
            theRiddle = new Riddle(ques, ans);
        }
        return theRiddle;
    }

    public void displayRiddle(Riddle aRiddle){
        System.out.println(aRiddle.getQuestion());

        System.out.print("Input any letter to see answer: ");

        String sr = kbScan.next();

        System.out.println(aRiddle.getAnswer());

        System.out.println();
    }

    public static void main(String args[]){
        RiddleFileReader rfr = new RiddleFileReader("riddles.txt");

        Riddle riddle = rfr.readRiddle();

        while(riddle != null){
            rfr.displayRiddle(riddle);

            riddle = rfr.readRiddle();
        }
    }
}
