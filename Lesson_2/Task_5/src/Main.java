import java.io.IOException;
import java.util.logging.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = {3, 8, 5, 10, 21, 6, 1, 49};

        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler handler = new FileHandler("/Users/ruslankaverin/Desktop/Java_home_work_GB/Lesson_2/Task_4/src");
        SimpleFormatter sFormat = new SimpleFormatter();
        handler.setFormatter(sFormat);
        logger.addHandler(handler);

        int temp;                                               // переменная для замены
        for (int i = array.length - 1; i > 0; i--) {            // внешний цикл
            for (int j = 0; j < i; j++) {                       // внутренний цикл
                if (array[j] > array[j + 1]) {                  // сравнение
                    temp = array[j];                            // если истино, то меняем
                    array[j] = array[j + 1];                    // местами элементы
                    array[j + 1] = temp;
                }
                logger.info(Arrays.toString(array));
            }
        }
        System.out.println(Arrays.toString(array));             //выводим результат в консоль
    }
}