import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rectangle length: ");
        double length = sc.nextDouble();

        System.out.print("Enter rectangle breadth: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}