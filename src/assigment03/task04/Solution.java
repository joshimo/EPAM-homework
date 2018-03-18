package assigment03.task04;

/**Напечатать числа в виде таблицы:
 а).
 0
 1 0
 2 1 0
 3 2 1 0
 4 3 2 1 0

 б).
 1
 2 1
 3 2 1
 4 3 2 1
 5 4 3 2 1*/

public class Solution {

    public static void printTriangles() {
        /** a)*/
        for (int i = 0; i <= 4; i ++) {
            for (int j = i; j >= 0; j--)
                System.out.print(j + " ");
            System.out.println();
        }
        /** б)*/
        for (int i = 1; i <= 5; i ++) {
            for (int j = 5; j >= 1; j --)
                if (j > i)
                    System.out.print("  ");
                else
                    System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void main(String... args) {
        printTriangles();
    }
}
