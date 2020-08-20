package ru.geekbrains.arrays;

import java.util.Arrays;

public class Main {

    private static void change(int[] a) {
        for (int i = 0; i < a.length; i++) {
//            a[i] = (a[i] == 1) ? 0 : 1;
//            a[i] = (a[i] + 1) % 2;
            a[i] = 1 - a[i];
        }
    }

    private static void fillArray(int[] a, int shift, int step) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i * step + shift;
        }
    }

    private static void multiplier(int[] a, int val, int mul) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < val)
                a[i] *= mul;
        }
    }

    private static int findMax(int[] a) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[index])
                index = i;
        }
        return index;
    }

    private static int findMin(int[] a) {
        int result = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < result)
                result = a[i];
        }
        return result;
    }

    private static int fingMaxBadIdea(int[] a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }

    /*
    5 * Создать квадратный целочисленный массив
    (количество строк и столбцов одинаковое), заполнить его
    диагональные элементы единицами, используя цикл(ы);
     */
    private static void crossFill(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            a[i][i] = 1;
            a[i][a.length - 1 - i] = 1;
        }
    }

    private static boolean checkBalance(int[] a) {
        int sum = 0;
        int left = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int i = 0; i < a.length - 1; i++) {
            sum -= a[i];
            left += a[i];
            if (sum == left)
                return true;
        }
        return false;
    }

    private static void shift(int[] a, int n) {
        boolean direction = n < 0;
        if (direction) n = -n;
        n %= a.length;
        int lastIndex = a.length - 1;
        for (int i = 0; i < n; i++) {
            int temp = (direction) ? a[0] : a[lastIndex];

            for (int j = 0; j < lastIndex; j++) {
                if (direction)
                    a[j] = a[j + 1];
                else
                    a[lastIndex - j] = a[lastIndex - j - 1];
            }

            if (direction)
                a[lastIndex] = temp;
            else
                a[0] = temp;
        }
    }

    private static void shift3(int[] a, int n) {
        boolean dir = n < 0;
        if (dir) n = -n;

        n %= a.length;
        int shift = (dir) ? a.length - n : n;

        for (int i = 0; i < shift; i++) {
            int temp = a[a.length - 1];
            System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = temp;
        }
    }

    public static void main(String[] args) {
        // 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод,
        // заменяющий в принятом массиве 0 на 1, 1 на 0;
        int[] ar1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(ar1));
        change(ar1);
        System.out.println(Arrays.toString(ar1));

        // 2 Задать пустой целочисленный массив размером 8. Написать
        // метод, который помощью цикла заполнит его значениями
        // 1 4 7 10 13 16 19 22;
        int[] ar2 = new int[8];
        fillArray(ar2, 1, 3);
        System.out.println(Arrays.toString(ar2));

        /*
        3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        написать метод, принимающий на вход массив и умножающий
        числа меньше 6 на 2;
        * */
        int[] ar3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(ar3));
        multiplier(ar3, 6, 2);
        System.out.println(Arrays.toString(ar3));

        /*
        4 Задать одномерный массив.
        Написать методы поиска в нём минимального и
        максимального элемента;
        * */
        //look at findMethods()

        int[][] ar4 = new int[10][10];
        crossFill(ar4);
        for (int y = 0; y < ar4.length; y++) {
            System.out.println(Arrays.toString(ar4[y]));
        }

        /*
        6 ** Написать метод, в который передается не пустой одномерный целочисленный
        массив, метод должен вернуть true если в массиве есть место, в котором сумма
        левой и правой части массива равны.
        Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
        checkBalance ([2, 1, 1, 2, 1]) → false,
        checkBalance ([10, || 1, 2, 3, 4]) → true.
        * */
        System.out.println("T: " + checkBalance(new int[] {1, 1, 1, 2, 1}));
        System.out.println("F: " + checkBalance(new int[] {2, 1, 1, 2, 1}));
        System.out.println("T: " + checkBalance(new int[] {10, 1, 2, 3, 4}));
    }
}