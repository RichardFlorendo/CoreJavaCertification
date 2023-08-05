public class TriangleDef implements PolygonDef{
    private int a, b, c;
    private double s, area;

    TriangleDef(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    public void getArea(){
        s = (double) (a + b + c)/2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the Triangle is " + area);
    }
}
