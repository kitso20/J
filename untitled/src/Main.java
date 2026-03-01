import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        if(isStudent){
        System.out.print("Your name is " + name + "and you're " + age + "and you're a wethinkcoder");
        }

        scanner.close();
    }
}
