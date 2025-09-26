import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        Student student = new Student(name, m1, m2, m3);

        System.out.println("\n--- Student Report ---");
        System.out.println(student);

        sc.close();
    }
}
