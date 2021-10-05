package mypackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsSet {
    public static void main(String[] args) {

        // Коллекция Set хранит уникальные значения(объекты) (нет индексов) (нет метода get) (все элементы уникальные)

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(11);

        // возвращает размер сета
        System.out.println(set.size());

        // удаление элемента, указывается не индекс элемента, а его значение
        set.remove(11);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//
//        System.out.println();
//        for (int i : set) {
//            System.out.println(i);
//        }

        // метод очищает список
        //set.clear();
        System.out.println(set.size());

        System.out.println(set.contains(10));
        System.out.println(set.contains(11));
    }
}
