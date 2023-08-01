import java.util.*;
public class Farmer implements Comparable {
    String name;
    int age;
    long income;

    public Farmer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Farmer(String name, int age, long income){
        this.name = name;
        this.age = age;
        this.income = income;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return name + " : " + age;
    }

    public long getIncome(){
        return income;
    }

    public void setIncome(long income){
        this.income = income;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public int compareTo(Object o){
        return getName().compareTo(((Farmer)o).getName());
    }

    static class AgeComparator implements Comparator{
        public int compare(Object o1, Object o2){
            Farmer p1 = (Farmer)o1;
            Farmer p2 = (Farmer)o2;

            if(p1.getIncome () == 0 && p2.getIncome() == 0) return p1.getAge() - p2.getAge();
            else return (int) (p1.getIncome() - p2.getIncome());
        }
    }

    public static void main(String args[]){
        List farmer = new ArrayList();

        farmer.add(new Farmer("Joe", 34));
        farmer.add(new Farmer("Ali", 13));
        farmer.add(new Farmer("Mark", 25));
        farmer.add(new Farmer("Dana", 66));

        Collections.sort(farmer);
        System.out.println("Sort in Natural order");
        System.out.println("\t" + farmer);

        Collections.sort(farmer, Collections.reverseOrder());
        System.out.println("Sort in Reverse Natural order");
        System.out.println("\t" + farmer);

        List farmerIncome = new ArrayList();
        farmerIncome.add(new Farmer("Joe", 34, 33));
        farmerIncome.add(new Farmer("Ali", 13, 3));
        farmerIncome.add(new Farmer("Joe", 25, 666));
        farmerIncome.add(new Farmer("Joe", 66, 2));

        Collections.sort(farmer, new AgeComparator());
        System.out.println("Sort using Age Comparator");
        System.out.println("\t" + farmer);

        Collections.sort(farmer, new AgeComparator());
        System.out.println("Sort using Age Comparator but Income-wise");
        System.out.println("\t" + farmerIncome);
    }
}
