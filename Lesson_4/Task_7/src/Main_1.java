import java.util.*;

public class Main_1 {
    public static void main(String[] args) {
        LinkedList<String> turn = new LinkedList<>();
        Scanner input = new Scanner(System.in, "cp866");
        while (true) {
            System.out.println("""
                    Введите:
                    1 Добавить в конец очереди
                    2 Удалить из начала очереди
                    3 Показать первый в очереди
                    stop Для выхода""");
            String element;
            element = input.next();
            switch (element) {
                case "stop":
                    input.close();
                    System.exit(1);
                case "1":
                    while (true) {
                        System.out.println("Введите что добавить в очередь (stop для выхода):");
                        element = input.next();
                        if (element.equals("stop")) break;
                        enqueue(turn, element);
                    }
                    break;
                case "2":
                    dequeue(turn);
                    break;
                case "3":
                    first(turn);
                    break;
                default:
                    System.out.println("Введите корректную команду");
                    break;
            }
            System.out.println(turn);
        }
    }
    static void enqueue(LinkedList<String> temp_list, String str) {
        temp_list.addLast(str);
    }
    static void dequeue(LinkedList<String> temp_list) {
        System.out.printf("Первый в очереди: %s - удален\n", temp_list.getFirst());
        temp_list.removeFirst();
    }
    static void first(LinkedList<String> temp_list) {
        System.out.printf("Первый в очереди: %s\n", temp_list.getFirst());
    }
}