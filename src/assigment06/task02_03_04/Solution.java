package assigment06.task02_03_04;

/** 2. Создайте открытый интерфейс, содержащий хотя бы один метод.
 Реализуйте его в закрытом внутреннем классе. Дополните внешний
 класс порождающим методом, который возвращает ссылку на
 созданный объект внутреннего класса. Какой вид классов
 предпочтительнее при этом использовать: внутренний или
 вложенный?
 3. Повторите предыдущее задание, определив внутренний класс
 внутри порождающего метода.
 4. Повторите предыдущее задание, определив вместо локального
 внутреннего класса анонимный. */

public class Solution {

    private class InnerSolution implements Printer {

        @Override
        public void print(Object object) {
            System.out.println(object.toString());
        }
    }

    private static class InnerStaticSolution implements Printer {

        @Override
        public void print(Object object) {
            System.out.println(object.toString());
        }
    }

    /** task 2 */
    private Printer createInnerSolution2a() {
        Printer printer = new InnerSolution();
        return printer;
    }

    private Printer createInnerStaticSolution2b() {
        Printer printer = new InnerStaticSolution();
        return printer;
    }

    /** task 3 */
    private Printer createInnerStaticSolution3a() {
        Printer printer = new Printer() {
            @Override
            public void print(Object object) {
                System.out.println(object.toString());
            }
        };
        return printer;
    }

    private Printer createInnerStaticSolution3b() {
        class Inner implements Printer {

            @Override
            public void print(Object object) {
                System.out.println(object.toString());
            }
        }
        Printer printer = new Inner();
        return printer;
    }

    /** task 4 */
    private Printer createInnerStaticSolution4() {
        return new Printer() {
            @Override
            public void print(Object object) {
                System.out.println(object.toString());
            }
        };
    }

}
