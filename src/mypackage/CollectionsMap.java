package mypackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionsMap {
    public static void main(String[] args) {

        // Map интерфейс входит в Collections Framework но не входит в интерфейс Collection
        // данные хранит с помощью пары key-value (ключ-значение) (ключ должен быть уникальным)
        Map<Integer, String> map = new HashMap<>();

        // добавляет элемент (ключи должны быть уникальные)
        map.put(1, "Black");
        map.put(2, "White");
        map.put(3, "Yellow");
        map.put(10, "Green");

        // получает значение
        System.out.println(map.get(1));
        System.out.println(map.get(10));

        System.out.println(map.size());
        // метод очищает
        // map.clear();
        System.out.println(map.size());

        // позволяет узнать есть ли в списке элемент с заданным ключом
        System.out.println(map.containsKey(90));
        System.out.println(map.containsKey(10));

        // метод позволяет проверить есть ли в списке элемент с указанным значением
        System.out.println(map.containsValue("White"));
        System.out.println(map.containsValue("Gray"));

        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }

        System.out.println();
        System.out.println(map.get(2));
        map.put(2, "Yellow");
        System.out.println(map.get(2));

        Map<String, String> map2 = new HashMap<>();
        map2.put("Vasya", "Frolov");
        map2.put("Petya", "Gromov");
        System.out.println();
        System.out.println(map2.get("Petya"));

    }
}
