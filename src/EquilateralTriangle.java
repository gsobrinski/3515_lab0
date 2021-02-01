public class EquilateralTriangle extends Triangle {
    int a;

    //    constructor
    public EquilateralTriangle(String name) {
        super(name);
        this.a = 0;
    }

    public void setDimensions(int a) {
        this.a = a;
    }

    @Override
    public void printDimensions() {
        System.out.println("Side 1: " + a + " Side 2: " + a + " Side 3: " + a);
    }

    @Override
    public double getArea() {
        double s = 3 * a;
        s = s/2;
        return Math.sqrt(s * (s-a) * (s-a) * (s-a));
    }

}
