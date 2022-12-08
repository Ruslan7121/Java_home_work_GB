import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите минимальное число: ");
        int minNumber = input.nextInt();
        System.out.print("Введите максимальное число: ");
        int maxNumber = input.nextInt();
        System.out.print("Введите размер списка: ");
        int listSize = input.nextInt();
        input.close();

        LinkedList<Integer> listNumber = getRandomLinkedList(minNumber, maxNumber, listSize);
        System.out.println(listNumber);
        reverseLinkedList(listNumber);
        System.out.println(listNumber);
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