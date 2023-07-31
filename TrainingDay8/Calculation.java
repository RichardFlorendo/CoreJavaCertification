public class Calculation {
    int Calculate(int side){
        return (int) Math.pow(side, 2);
    }

    int Calculate(int length, int width){
        return length * width;
    }

    double Calculate(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    double Calculate(double base, double height){
        return (base * height) / 2;
    }
}
