/**
 * Java. Level 1. Lesson 2
 *
 * @author Artem Belsky
 * @version dated June 3, 2019
 */
import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        changeOnetoZero();
        fillWithStep();
        multyplicationByTwo();
        //createDiagonal();

    }

    public static void changeOnetoZero() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание 1");
        System.out.println("Вот так выглядел массив");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("Ниже то, что получилось");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void fillWithStep() {
        int[] arr = new int[8];
        System.out.println("Задание 2");
        System.out.println("Создан пустой массив с 8 элементами");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println("Ниже то, что получилось");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void multyplicationByTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 3");
        System.out.println("Вот так выглядел массив");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Ниже то, что получилось");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    /*public static void createDiagonal() {
        int[][] arr = new int[5][5];
        System.out.println("Задание 4");
        System.out.println("Вот так выглядел массив");
        System.out.println(ArrayList.toString(arr));
        /*for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Ниже то, что получилось");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    */

}