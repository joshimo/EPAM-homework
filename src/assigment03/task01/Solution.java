package assigment03.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Дано целое число a. Определить число вхождений в него цифры b.*/

public class Solution {

    public static int digitCounter(long a, int b) {
        int counter = 0;
        int digit;
        long dividedA = a;
        while (dividedA > 0) {
            digit = (int) (dividedA % 10);
            if (digit == b)
                counter ++;
            dividedA = dividedA / 10;
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        long a;
        int b;
        int counter;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое число а:");
        a = Long.parseLong(reader.readLine());
        System.out.println("Введите цифру b:");
        b = Integer.parseInt(reader.readLine());
        if (b >= 10 || b < 0)
            System.out.println("Число b должно быть цифрой");
        else {
            counter = digitCounter(a, b);
            System.out.println("Число вхождений цифры b в число a составляет " + counter);
        }
    }


}
