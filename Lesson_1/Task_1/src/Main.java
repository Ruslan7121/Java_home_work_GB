import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Эта программа вычеслит факториал, n-ое треугольного числа или все сразу");
        Scanner scan = new Scanner(System.in);

        System.out.print("""
                Что вы хотите найти?
                                           
                Если факториал нажмите: 1
                Если n-ое треугольного числа нажмите: 2
                Если все сразу: 3
                """);
        System.out.print("Ввод: ");
        int variant = scan.nextInt();

        System.out.print("Введите число: ");
        int n = scan.nextInt();

        if (variant == 2) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println("Факториал равен: " + result);
        }

        if (variant == 1) {
            int result = 0;
            for (int i = 1; i <= n; i++) {
                result += i;
            }
            System.out.println("n-ое треугольного: " + result);
        }

        if (variant == 3) {
            int result_f = 1;
            for (int i = 1; i <= n; i++)
                result_f *= i;

            int result_n = 0;
            for (int i = 1; i <= n; i++) {
                result_n += i;
            }
            System.out.println("Факториал равен: " + result_f);
            System.out.println("n-ое треугольного: " + result_n);
        }
    }
}