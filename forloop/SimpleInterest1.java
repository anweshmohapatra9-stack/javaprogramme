import java.util.Scanner;

class SimpleInterest1 {
    static void simpleInterest() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter time: ");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }

    public static void main(String[] args) {
        simpleInterest();
    }
}