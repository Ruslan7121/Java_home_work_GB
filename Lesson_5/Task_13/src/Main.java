import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
// Создание ArrayList с поочередным добавлением новых людей.
        List<String> people = new ArrayList<>();
        people.add("Иван Юрин");
        people.add("Петр Лыков");
        people.add("Иван Иванов");
        people.add("Светлана Петрова");
        people.add("Кристина Белова");
        people.add("Анна Мусина");
        people.add("Марина Светлова");
        people.add("Мария Савин");
        people.add("Мария Рыкова");
        people.add("Петр Петин");
        people.add("Иван Ежов");
        people.add("Павел Чернов");
        people.add("Петр Чернышов");
        people.add("Анна Крутова");
        people.add("Марина Лугова");
        people.add("Анна Владимирова");
        people.add("Иван Мечников");
        people.add("Мария Федорова");
// Создание HashMap. Каждое значение ArrayList заносится в двумерный массив, разбивается по пробелу. Первый элемент массива - ключ.
// начением является количество повторов. Если в HashMap уже имеется строка из ArrayList,
// значит ключ HashMap переписывается с добавлением +1 к значению. Если нет значения, что ключ добавляется в HashMap со значением 1.
        Map<String, Integer> nameList = new HashMap<>();
        for (String person : people) {
            String temp = person.replace(" ", "_");
            String[] array = temp.split("_");
            if (nameList.containsKey(array[0])) {
                nameList.put(array[0], nameList.get(array[0]) + 1);
            } else {
                nameList.put(array[0], 1);
            }
        }
// Вывод в консоль полученного HashMap с обратной сортировкой по значению.
        System.out.print("Список поворяющихся имен: \n");
        nameList.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}