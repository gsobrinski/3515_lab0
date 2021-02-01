public class Circle extends Shape {
    int radius;

    //    constructor
    public Circle(String name) {
        super(name);
        this.radius = 0;
    }

    public void setDimensions(int radius) {
        this.radius = radius;
    }

    @Override
    public void printDimensions() {
        System.out.println("Radius: " + radius);
    }

    @Override
    public double getArea() {
        return 3.14159 * (radius * 2);
    }

}
