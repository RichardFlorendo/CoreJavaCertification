import java.io.*;

public class InterfaceandEncapsulation {

    public static void main(String args[]){
//        Interface1();
//        Interface2();
//        DefaultInter1();
//        DefaultInter2();
//        Encapsulation1();
//        DataHiding();
//        FileOperations();
    }

    static void FileOperations(){
        File f1 = new File("Folder/FILE");
        File f2 = new File("Folder/FILE1");
        String s;

        if(f1.exists()){
            if(f1.isFile()){
                System.out.println("File Name is " + f1.getName());
                s = f1.getParent();

                File f3 = new File(s);
                f1.renameTo(new File("Folder/abc"));
                f2.delete();

                if(f3.isDirectory()) System.out.println(f2.getPath());
            }
            else System.out.println("Not a file");
        }


    }

    static void DataHiding(){
        Person p1 = new Person();

        p1.setAge(24);
        System.out.println("My age is " + p1.getAge());
    }

    static void Encapsulation1(){
        Area rectangle = new Area(5, 6);
        rectangle.getArea();
    }

    static void DefaultInter2(){
        TriangleDef tri = new TriangleDef(2, 3, 4);

        tri.getArea();
        tri.getPerimeter(2, 3, 4);
    }

    static void DefaultInter1(){
        RectangleDef rect = new RectangleDef();
        SquareDef square = new SquareDef();

        rect.getSides();
        rect.getArea();

        square.getSides();
        square.getArea();
    }

    static void Interface1(){
        Rectangle rect = new Rectangle();
        rect.getArea(5, 6);
    }

    static void Interface2(){
        ProgrammingLanguage lang = new ProgrammingLanguage();
        lang.getName("Java");
    }
}
