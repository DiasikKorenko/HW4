import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num; // номер задания
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Задание 1. Пройти по массиву, вывести все элементы в прямом и в обратном порядке. \n");
                System.out.println("Ведите размер массива(заполнение Random): ");
                int size;
                size = scanner.nextInt();
                double array[] = new double[size];
                System.out.println("Массив в прямом порядке: ");
                for (int i = 0; i < array.length; i++) {
                    array[i] = Math.random() * 10;
                    System.out.print((int) array[i] + " ");
                }
                System.out.println();
                System.out.println("Массив в обратном порядке: ");
                for (int i = array.length - 1; i >= 0; i--) {
                    System.out.print((int) array[i] + " ");
                }
            case 2, 3:
                System.out.println("Задание 2,3. Найти минимальный-максимальный элементы(+ их индексы) и вывести. \n");
                System.out.println("Ведите размер массива(заполнение Random): ");
                int size_2;
                size_2 = scanner.nextInt();
                double array_2[] = new double[size_2];
                System.out.println("Массив: ");
                for (int i = 0; i < array_2.length; i++) {
                    array_2[i] = Math.random() * 10;
                    System.out.print((int) array_2[i] + " ");
                }
                double max_el = array_2[0];
                int index_max = 0;
                System.out.println();
                for (int i = 0; i < array_2.length; i++) {
                    if (max_el <= array_2[i]) {
                        max_el = array_2[i];
                        index_max = i;
                    }
                }
                double min_el = array_2[0];
                int index_min = 0;
                for (int i = 0; i < array_2.length; i++) {
                    if (min_el > array_2[i]) {
                        min_el = array_2[i];
                        index_min = i;
                    }
                }
                System.out.println("Максимальный элемент: " + (int) max_el + " Индекс: " + index_max);
                System.out.println("Минимальный элемент: " + (int) min_el + " Индекс: " + index_min);
            case 4:
                System.out.println("Задание 4. Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет. \n");
                System.out.println("Ведите размер массива: ");
                int size_4;
                size_4 = scanner.nextInt();
                int array_4[] = new int[size_4];
                int count = 0;
                System.out.println("Заполните массив: ");
                for (int i = 0; i < array_4.length; i++) {
                    array_4[i] = scanner.nextInt();
                    System.out.println("Элемент массива[" + i + "] = " + array_4[i]);
                }
                System.out.println(Arrays.toString(array_4));
                for (int i = 0; i < array_4.length; i++) {
                    if (array_4[i] == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("Нулевых элементов в массиве нет!!!");
                } else {
                    System.out.println("Количество нулевых элементов в массиве = " + count);
                }
            case 5:
                System.out.println("Задание 5. Пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.");
                System.out.println("Ведите размер массива: ");
                int size_5;
                size_5 = scanner.nextInt();
                int array_5[] = new int[size_5];
                System.out.println("Заполните массив: ");
                for (int i = 0; i < array_5.length; i++) {
                    array_5[i] = scanner.nextInt();
                    System.out.println("Элемент массива[" + i + "] = " + array_5[i]);
                }
                System.out.println(Arrays.toString(array_5));
                int temp;
                for (int i = 0; i < array_5.length / 2; i++) {
                    temp = array_5[array_5.length - i - 1];
                    array_5[array_5.length - i - 1] = array_5[i];
                    array_5[i] = temp;
                }
                System.out.println();
                System.out.println(Arrays.toString(array_5));
            case 6:
                System.out.println("Задание 6. Проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего) \n");
                System.out.println("Ведите размер массива: ");
                int size_6;
                size_6 = scanner.nextInt();
                int array_6[] = new int[size_6];
                System.out.println("Заполните массив: ");
                for (int i = 0; i < array_6.length; i++) {
                    array_6[i] = scanner.nextInt();
                    System.out.println("Элемент массива[" + i + "] = " + array_6[i]);
                }
                System.out.println(Arrays.toString(array_6));
                int flag = 0;
                for (int i = 0; i < array_6.length - 1; i++) {
                    if (array_6[i] < array_6[i + 1]) {
                        continue;
                    } else {
                        flag = 1;
                    }
                    if (flag == 0) {
                        System.out.println("Массив является возрастающей последовательностью");
                    } else {
                        System.out.println("Массив НЕявляется возрастающей последовательностью");
                    }
                }
            default:
                System.out.println("Такого задания нет");
        }
    }
}

