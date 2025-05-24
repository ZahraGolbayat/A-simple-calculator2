import java.util.Scanner;

public class SimpleCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter the operator: ");
        String operator = scanner.next();
        int resualt;
        if (operator.equals("+")) {
            resualt = a+b;
        }
        else if (operator.equals("-")) {
            resualt = a-b;
        }
        else if (operator.equals("/")) {
            resualt = a/b;
        }
        else if (operator.equals("*")) {
            resualt = a*b;
        }
        else {
            System.out.println("Enter one of the following operators: ");
            System.out.println("+ , - , / , * ");
            scanner.close();
            return;
        }

        System.out.println("your numbers are: " + a + " and" +" " + b + " and your chosen operator is " + operator + " and the resualt is: " + resualt);

        scanner.close();
    }
}
