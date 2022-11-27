public class Main {
    public static void main(String[] args) {
        System.out.println("Вывод всех простых чисел считая от 0 до 1000");
        for (int i = 2; i < 1000; ++i) {
            int count = 0;
            for (int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count < 2)
                System.out.println(i);
        }
    }
}