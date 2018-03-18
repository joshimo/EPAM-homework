package assigment03.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Напишите приложение, которое получает в качестве данных ввода
 ряд чисел. В конце перечисления данных ввода программа должна
 выводить общее число введенных чисел, наибольшее число,
 наименьшее число и среднее всех чисел.*/

public class Solution {

    public Solution() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         Double number;
         Double max = 0.0;
         Double min = 0.0;
         Double sum = 0.0;
         Double avg;
        int counter = 0;
        System.out.println("Введите ряд целых чисел:");
        while (true) {
            try {
                number = Double.parseDouble(reader.readLine());
                sum += number;
                if (counter == 0) {
                    min = number;
                    max = number;
                }
                if (number > max)
                    max = number;
                if (number < min)
                    min = number;
                counter ++;
            } catch (NumberFormatException nfe) {
                break;
            } catch (IOException ioe) {
                break;
            }
        }
        avg = sum / counter;
        System.out.println("Минимальное число = " + min + "\nМаксимальное число = " + max + "\nСреднее число = " + avg + "\nКоличество введенных чисел = " + counter);
    }

    public static void main(String[] args) {
        new Solution();
    }
}
