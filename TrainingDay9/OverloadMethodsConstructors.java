public class OverloadMethodsConstructors extends Language {

    public static void main(String args[]){
//        OverloadSample();
//        ConstructorOverload();
//        Summation();
//        PublicPrivate();
//        FailArrayDemo();
//        ProtectedDemo();
        AbstractionDemo();
        AbstractionDemo2();
        AbstractionDemo3();
    }

    static void AbstractionDemo3(){
        MountainBike bike = new MountainBike();

        bike.brake();

        SportsBike sports = new SportsBike();

        sports.brake();
    }

    static void AbstractionDemo2(){
        AbsDog dog = new AbsDog();

        dog.makeSound();
        dog.eat();
    }

    static void AbstractionDemo(){
        OverloadMethodsConstructors main = new OverloadMethodsConstructors();

        main.display();
    }

    static void ProtectedDemo(){
        Dog labrador = new Dog();
        Animal cat = new Animal();

//        cat.eat();
        labrador.eat();
        labrador.bark();

    }

    static void FailArrayDemo(){
        FailArray fa = new FailArray(5, -1);
        int x;

        System.out.println("Fail quietly.");
        for(int i = 0; i < (fa.length * 2); i++) fa.put(i, i * 10);

        for(int i = 0; i < (fa.length * 2); i++){
            x = fa.get(i);
            if(x != -1)System.out.print(x + " ");
        }

        System.out.println("");

        System.out.println("\nFail with error reports.");
        for(int i = 0; i < (fa.length * 2); i++) if(!fa.put(i, i * 10)) System.out.println("Index " + i + " out-of-bounds");

        for(int i = 0; i < (fa.length * 2); i++){
            x = fa.get(i);
            if(x != -1) System.out.print(x + " ");
            else System.out.println("Index " + i + " out-of-bounds");
        }
    }

    static void PublicPrivate(){
        ClassSample ob = new ClassSample();
        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());
    }

    static void Summation(){
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
    }

    static void ConstructorOverload(){
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(17.23);
        MyClass t4 = new MyClass(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }

    static void OverloadSample(){
        Overload ov = new Overload();
        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ov.f(i);
        ov.f(d);
        ov.f(b);
        ov.f(s);
        ov.f(f);
    }

}
