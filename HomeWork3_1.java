/**
 * Java. Level 1. Lesson 3
 *
 * @author Artem Belsky
 * @version dated June 8, 2019
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class HomeWork3_1 {
    public static BufferedReader reader;
    public static Random random = new Random();
    public static void main (String[] args) throws IOException {
        playLevel();
    }
    private static void playLevel() throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            int number = random.nextInt(10);
            for (int i = 0; i < 3; i++) {
                System.out.println("Угадайте число от 0 до 9.");
                int inputNumber = Integer.parseInt(reader.readLine());
                if (inputNumber == number) {
                    System.out.println("Победа!");
                    break;
                } else if (inputNumber > number) {
                    System.out.println("Загаданное число меньше.");
                } else {
                    System.out.println("Загаданное число больше.");
                }
                if (i == 2) System.out.println("\nВы проиграли."
                        + "\nПравильный ответ: " + number);
            }
            System.out.println("\nПродолжить? 1 для продолжения");
        } while (Integer.parseInt(reader.readLine()) == 1);
    }
}