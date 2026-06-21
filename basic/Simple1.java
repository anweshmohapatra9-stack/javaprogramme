import java.util.Scanner;

public class Simple1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a principal");
        int p = sc.nextInt();

        System.out.println("enter a rate of interest");
        int r = sc.nextInt();

        System.out.println("enter a time");
        int t = sc.nextInt();

        double si = p * r * t / 100.0;

        System.out.println("principal = " + p);
        System.out.println("rate of interest = " + r);
        System.out.println("time = " + t);
        System.out.println("simple interest = " + si);

        sc.close();
    }
}