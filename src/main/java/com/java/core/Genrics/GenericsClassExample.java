package com.java.core.Genrics;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * We can restrict the type using: class MyCustomList<T extends Number>
 * This way we are only allowed to use Byte, Double, Flot, Integer, Long, Short as these are
 * subclasses of Number Class
 *
 */

class MyCustomList<T> {
    ArrayList<T> list = new ArrayList();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public String toString() {
        return String.valueOf(list);
    }

    public T get(int i) {
        return list.get(i);
    }
}

@Slf4j
public class GenericsClassExample {

    public static void main(String[] args) {

        MyCustomList<String> list1 = new MyCustomList();
        list1.addElement("Element 1");
        list1.addElement("Element 2");
        String value1 = list1.get(0);
        log.info("Value at index 0: " + value1);
        log.info(String.valueOf(list1));

        MyCustomList<Integer> list2 = new MyCustomList();
        list2.addElement(Integer.valueOf(1));
        list2.addElement(Integer.valueOf(2));
        Integer value2 = list2.get(0);
        log.info("Value at index 0: " + value2);
        log.info(String.valueOf(list2));

        log.info(doubleValue(new String("Rahul")));
        log.info(String.valueOf(doubleValue(Integer.valueOf(570))));

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
        duplicate(numbers);
        log.info(String.valueOf(numbers));

        log.info(sumOfNumberList(List.of(1,2,3)).toString());
        log.info(sumOfNumberList(List.of(1l,2l,3l)).toString());
        log.info(sumOfNumberList(List.of(1.1,2.1,3.1)).toString());

        log.info(String.valueOf(sumOfNumberList2(new ArrayList<>())));
    }

    static <T> T doubleValue(T value) {
        return value;
    }

    static <T extends List> boolean duplicate(T list) {
        return list.addAll(list);
    }

    // Upper Bound: All List which are subclass of Number
    // ? is wildcard which accepts any list which extends number class
    static Number sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number: numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // Lower Bound: adds all subtypes of Number
    static List<? super Number> sumOfNumberList2(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);
        return numbers;
    }
}
