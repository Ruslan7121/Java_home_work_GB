import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Эта постой калькулятор");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scan.nextInt();
        System.out.print("Введите действие (+, -, * или /) ");
        String variant = scan.next();
//        scan.close();

        int result = 0;
        switch (variant) {
            case ("+") -> result = number1 + number2;
            case ("-") -> result = number1 - number2;
            case ("*") -> result = number1 * number2;
            case ("/") -> result = number1 / number2;
            default -> {
            }
        }
        System.out.println(number1 + " " + variant + " " + number2 + " = " + result);
    }
}