package assigment05.application;


import assigment05.task01.Article;
import assigment05.task01.Paragraph;
import assigment05.task04.Country;
import assigment05.task04.Ukraine;

import static assigment05.printer.Printer.*;

public class Application {


        /**task01 */
        public static void task01() {
            String header = "Assignment05";
            Paragraph paragraph1 = new Paragraph("Создать приложение, удовлетворяющее требованиям, приведенным в задании. Аргументировать\n" +
                    "принадлежность классу каждого создаваемого метода и корректно переопределить для каждого класса методы\n" +
                    "equals(), hashCode(), toString().");
            Paragraph paragraph2 = new Paragraph("1. Создать объект класса Текст, используя класс Абзац. Методы: дополнить текст, вывести на консоль\n" +
                    "текст, заголовок текста.");
            Article article = new Article(header);
            article.addParagraph(paragraph1);
            article.addParagraph(paragraph2);
            article.printText();
        }

        /** task02 */
        public static void task02() {

        }

        /** task03 */
        public static void task03() {

        }

        /** task04 */
        public static void task04() {
            Country ukraine = Ukraine.create();
            print(ukraine);
        }

        /** task05 */
        public static void task05() {

        }

        /** task06 */
        public static void task06() {

        }

        /** task07 */
        public static void task07() {

        }

        /** task08 */
        public static void task08() {

        }

        /** task09 */
        public static void task09() {

        }

        /** task10 */
        public static void task10() {

        }

        /** task11 */
        public static void task11() {

        }

        /** task12 */
        public static void task12() {

        }

        /** task13 */
        public static void task13() {

        }

        /** task14 */
        public static void task14() {

        }

        /** task15 */
        public static void task15() {

        }

        /** task16 */
        public static void task16() {

        }

        /** task17 */
        public static void task17() {

        }

        /** task18 */
        public static void task18() {

        }

        /** task19 */
        public static void task19() {

        }

        /** task20 */
        public static void task20() {

        }

        /** task21 */
        public static void task21() {

        }

        /** task22 */
        public static void task22() {

        }

        /** task23 */
        public static void task23() {

        }

        /** task24 */
        public static void task24() {

        }

        public static void main(String[] args){
            task04();
        }
}
