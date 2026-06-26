import java.util.Scanner;

class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee age: ");
        int age = sc.nextInt();

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        sc.nextLine(); // clear input buffer

        System.out.print("Enter employee gender: ");
        String gender = sc.nextLine();

        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Gender: " + gender);
    }
}