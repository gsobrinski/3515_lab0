import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        prompt for dimensions
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Square's first side length: ");
        int square_side1 = scanner.nextInt();
        System.out.println("Enter the Square's second side length: ");
        int square_side2 = scanner.nextInt();

        System.out.println("Enter the Circle's radius: ");
        int radius = scanner.nextInt();

        System.out.println("Enter the Triangle's first side length: ");
        int triangle_side1 = scanner.nextInt();
        System.out.println("Enter the Triangle's second side length: ");
        int triangle_side2 = scanner.nextInt();
        System.out.println("Enter the Triangle's third side length: ");
        int triangle_side3 = scanner.nextInt();

        System.out.println("Enter the Equilateral Triangle's side length: ");
        int etriangle_side = scanner.nextInt();

//        create Square
        Square square = new Square("Square");
        System.out.println(square.getName());
        square.setDimensions(square_side1, square_side2);
        square.printDimensions();
        System.out.println("Area: " + square.getArea());

//        create Circle
        Circle circle = new Circle("Circle");
        System.out.println(circle.getName());
        circle.setDimensions(radius);
        circle.printDimensions();
        System.out.println("Area: " + circle.getArea());

//        create Triangle
        Triangle triangle = new Triangle("Triangle");
        System.out.println(triangle.getName());
        triangle.setDimensions(triangle_side1, triangle_side2, triangle_side3);
        triangle.printDimensions();
        System.out.println("Area: " + triangle.getArea());

//        create Equilateral Triangle
        EquilateralTriangle etriangle = new EquilateralTriangle("EquilateralTriangle");
        System.out.println(etriangle.getName());
        etriangle.setDimensions(etriangle_side);
        etriangle.printDimensions();
        System.out.println("Area: " + etriangle.getArea());
    }
}
