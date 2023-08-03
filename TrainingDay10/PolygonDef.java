interface PolygonDef {
    void getArea();

    default void getSides(){
        System.out.println("I can get all the sides of a polygon");
    }

    default void getPerimeter(int... sides){
        int perimeter = 0;
        for(int side: sides) perimeter += side;

        System.out.println("Perimeter: " + perimeter);
    }
}
