package assigment03.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /**Напишите приложение, которое определяет через сколько целых лет
     вложенная в банк сумма s под n процентов годовых достигнет
     заданного значения. Можно ли в ней использовать цикл с
     постусловием? Перепишите ее для всех возможных видов циклов.
     Можно ли для завершения расчета накопленной суммы
     использовать оператор break, break с меткой, return? Вызов
     System.exit() ? */

    /**Цикл с предусловием */
    public static int percentCounterPre(double s, double n, double expectedAmount) {
         double totalAmount = s;
         int years = 0;
        while(totalAmount < expectedAmount) {
            totalAmount += 0.01 * n * totalAmount;
            years ++;
        }
        return years;
    }

    /** Цикл с постусловием */
    public static int percentCounterPost(double s, double n, double expectedAmount) {
        double totalAmount = s;
        int years = 0;
        if (s < expectedAmount)
            do {
                totalAmount += 0.01 * n * totalAmount;
                years ++;
            } while(totalAmount < expectedAmount);
        return years;
    }

    /** Цикл с предусловием и break */
    public static int percentCounterPreBreak(double s, double n, double expectedAmount) {
        double totalAmount = s;
        int years = 0;
        while(true) {
            if (totalAmount >= expectedAmount)
                break;
            totalAmount += 0.01 * n * totalAmount;
            years ++;
        }
        return years;
    }

    /** Цикл с предусловием и return */
    public static int percentCounterPreReturn(double s, double n, double expectedAmount) {
        double totalAmount = s;
        int years = 0;
        while(true) {
            if (totalAmount >= expectedAmount)
                return years;
            totalAmount += 0.01 * n * totalAmount;
            years ++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int result;
        System.out.println("Введите сумму вклада:");
        Double s = Double.parseDouble(reader.readLine());
        System.out.println("Введите процентную ставку:");
        Double n = Double.parseDouble(reader.readLine());
        System.out.println("Введите ожидаемую величину суммы вклада с процентами:");
        Double expectedAmount = Double.parseDouble(reader.readLine());
        result = percentCounterPre(s, n, expectedAmount);
        System.out.println("Цикл с предусловием\nВклад достигнет ожидаемой чуммы через " + result + " целых лет");
        result = percentCounterPost(s, n, expectedAmount);
        System.out.println("Цикл с постусловием\nВклад достигнет ожидаемой чуммы через " + result + " целых лет");
        result = percentCounterPreBreak(s, n, expectedAmount);
        System.out.println("Цикл с предусловием и break\nВклад достигнет ожидаемой чуммы через " + result + " целых лет");
        result = percentCounterPreReturn(s, n, expectedAmount);
        System.out.println("Цикл с предусловием и return\nВклад достигнет ожидаемой чуммы через " + result + " целых лет");
    }

}
