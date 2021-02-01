public class Square extends Shape {

    int length;
    int height;

    //    constructor
    public Square(String name) {
        super(name);
        this.length = 0;
        this.height = 0;
    }

    public void setDimensions(int length, int height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public void printDimensions() {
        System.out.println("Length: " + length + " Height: " + height);
    }

    @Override
    public double getArea() {
        return length * height;
    }

}