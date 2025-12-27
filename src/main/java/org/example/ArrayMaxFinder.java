package org.example;

public class ArrayMaxFinder {

    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым или null");
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static Circle findMaxCircle(Circle[] circles) {
        return findMax(circles);
    }

    public static Integer findMaxInteger(Integer[] array) {
        return findMax(array);
    }

    public static String findMaxString(String[] array) {
        return findMax(array);
    }

    public static Double findMaxDouble(Double[] array) {
        return findMax(array);
    }

    public static <T extends Comparable<T>> int findMaxIndex(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым или null");
        }

        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(array[maxIndex]) > 0) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static <T extends Comparable<T>> T findMin(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым или null");
        }

        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }
}