
public class ClassPractice {

    public static void main (String args[]){
        int range1, range2;

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range1 = minivan.fuelcap * minivan.mpg;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range2 = sportscar.fuelcap * sportscar.mpg;


        System.out.println("A minivan can carry " + minivan.passengers + " passengers with a range of " + range1);

        System.out.println("A sportscar can carry " + sportscar.passengers + " passengers with a range of " + range2);
    }

}
