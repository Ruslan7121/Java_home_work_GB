import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(20));
        }
        System.out.println("Случайный спиcок: " + numbers);

        int total = 0;
        int minNumbers = numbers.get(0);
        int maxNumbers = numbers.get(0);

        for (Integer number : numbers) {
            if (number > maxNumbers) {
                maxNumbers = number;
            } else if (number < minNumbers) {
                minNumbers = number;
            }
            total += number;
        }

        int average = total / numbers.size();
        System.out.println("Минимальное число: " + minNumbers);
        System.out.println("Максимальное число: " + maxNumbers);
        System.out.println("Средне арифметическое: " + average);
    }
}