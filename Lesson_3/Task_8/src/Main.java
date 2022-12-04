import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(11));
        }
        System.out.println("Случайный список чисел: " + numbers);
        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) % 2 == 0) {
                numbers.remove(j);
                j--;
            }
        }
        System.out.println("Список без четных чисел: " + numbers);
    }
}