import java.lang.Math;

public class Triangle extends Shape {

    int a;
    int b;
    int c;

    //    constructor
    public Triangle(String name) {
        super(name);
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public void setDimensions(int side1, int side2, int side3) {
        this.a = side1;
        this.b = side2;
        this.c = side3;
    }

    @Override
    public void printDimensions() {
        System.out.println("Side 1: " + a + " Side 2: " + b + " Side 3: " + c);
    }

    @Override
    public double getArea() {
        double s = a + b + c;
        s = s/2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

}
