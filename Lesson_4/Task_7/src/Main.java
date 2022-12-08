import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите минимальное число: ");
        int min = input.nextInt();
        System.out.print("Введите максимальное число: ");
        int max = input.nextInt();
        System.out.print("Введите размер списка: ");
        int s = input.nextInt();
        input.close();

        LinkedList<Integer> arr = getRandomLinkedList(s, min, max);
        System.out.println(arr);
        reverseLinkedList(arr);
        System.out.println(arr);
    }

    static int getRandomNumberInt(int minimum, int maximum) { // рандомное число
        Random random = new Random();
        return random.nextInt(minimum, maximum);
    }

    static LinkedList<Integer> getRandomLinkedList(int size, int minimum, int maximum) { // создаем рандомный массив
        LinkedList<Integer> array = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            array.add(getRandomNumberInt(minimum, maximum));
        }
        return array;
    }

    static void reverseLinkedList(LinkedList<Integer> array) { // через цикл
        List<Integer> temp = new LinkedList<>(array);
        int j = 0;
        for (int i = temp.size() - 1; i >= 0; i--) {
            array.set(j, temp.get(i));
            j++;
        }
    }
}