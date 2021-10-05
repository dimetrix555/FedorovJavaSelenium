package mypackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsList {
    public static void main(String[] args) {

        //int[] array = new int[3];

        // Коллекция List
        List<Integer> list = new ArrayList<>();

        // Добавление элемента в список
        list.add(5);
        list.add(10);
        list.add(9);

        int a = list.get(2);

        // Получение элемента из списка
        System.out.println(list.get(1));
        System.out.println(a);

        // метод позволяет изменить значение элемента
        list.set(2, 100);

        System.out.println(list.get(2));

        System.out.println();
        System.out.println(list.get(1));
        // удаление элемента из списка
        list.remove(1);
        System.out.println(list.get(1));

        System.out.println();
        // вывод размера списка
        System.out.println(list.size());
        list.add(9);
        System.out.println(list.size());

        // метод очищает список
        //list.clear();
        //System.out.println(list.size());

        List<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(56);

        System.out.println();
        System.out.println(list.size());
        // добавляет элементы одного списка в другой
        list.addAll(list2);
        System.out.println(list.size());

        // удаляет элементы одного списка из другого
        list.removeAll(list2);
        System.out.println(list.size());

        // метод позволяет узнать пустой ли список или нет
        System.out.println(list.isEmpty());
        //list.clear();
        System.out.println(list.isEmpty());

        // проверяет есть ли в списке элемент с указанным числом
        System.out.println();
        System.out.println(list.contains(100));
        System.out.println(list.contains(987));

        list.addAll(list2);
        System.out.println();
        // проверяет существуют ли элементы второго списка в указанном списке
        System.out.println(list.containsAll(list2));
        list.removeAll(list2);
        System.out.println(list.containsAll(list2));

        // Итератор это интерфейс который позволяет работать с элементами списка или коллекции
        Iterator<Integer> iterator = list.iterator();
        // метод указывает на следующий элемент в списке
        // System.out.println(iterator.next());
        //System.out.println(iterator.next());
        // метод позволяет узнать существует ли следующий элемент списка возвращает (true|false)
        //System.out.println(iterator.hasNext());
        System.out.println();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
