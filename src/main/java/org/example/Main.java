package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 10: Поиск наибольшего элемента с compareTo ===\n");

        Circle[] circles = {
                new Circle(2.5),
                new Circle(1.0),
                new Circle(3.7),
                new Circle(2.0),
                new Circle(3.0)
        };

        System.out.println("Массив кругов:");
        for (Circle circle : circles) {
            System.out.println("  " + circle);
        }

        Circle maxCircle = ArrayMaxFinder.findMaxCircle(circles);
        System.out.println("\nСамый большой круг: " + maxCircle);

        Integer[] integers = {15, 8, 42, 17, 3, 99, 25};
        System.out.println("\nМассив целых чисел: " + java.util.Arrays.toString(integers));
        Integer maxInt = ArrayMaxFinder.findMaxInteger(integers);
        System.out.println("Максимальное число: " + maxInt);

        Double[] doubles = {3.14, 2.71, 1.41, 1.73, 2.50};
        System.out.println("\nМассив дробных чисел: " + java.util.Arrays.toString(doubles));
        Double maxDouble = ArrayMaxFinder.findMaxDouble(doubles);
        System.out.println("Максимальное дробное: " + maxDouble);

        String[] strings = {"apple", "banana", "cherry", "date", "apricot"};
        System.out.println("\nМассив строк: " + java.util.Arrays.toString(strings));
        String maxString = ArrayMaxFinder.findMaxString(strings);
        System.out.println("Максимальная строка: " + maxString);

        int maxIndex = ArrayMaxFinder.findMaxIndex(circles);
        System.out.println("\nИндекс самого большого круга: " + maxIndex);

        Circle minCircle = ArrayMaxFinder.findMin(circles);
        System.out.println("Самый маленький круг: " + minCircle);

        System.out.println("\n=== Проверка с одним элементом ===");
        Circle[] singleArray = {new Circle(5.0)};
        Circle singleMax = ArrayMaxFinder.findMax(singleArray);
        System.out.println("Единственный элемент: " + singleMax);

        System.out.println("\n=== Программа завершена ===");
    }
}