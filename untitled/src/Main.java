import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a adjective(description): ");
        String adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        String noun1 = scanner.nextLine();
        System.out.print("Enter a adjective(description): ");
        String adjective2 = scanner.nextLine();
        System.out.print("Enter a verb ending with -ing (action): ");
        String verb = scanner.nextLine();
        System.out.print("Enter a adjective(description): ");
        String adjective3 = scanner.nextLine();


        scanner.close();
    }
}
