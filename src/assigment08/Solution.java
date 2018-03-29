package assigment08;

import java.io.IOException;

import static com.joshimo.utils.WindowPrinter.*;

/*1. Определите ссылку на объект и присвойте ей значение null.
Попробуйте вызвать метод объекта, пользуясь этой ссылкой.
Поместите данный код в обработчик и перехватите
исключение. Какое исключение было выброшено
(контролируемое/неконтролируемое) ?

2. Определите класс, который генерирует исключение в одном
методе и перехватывает его в другом. Выведите на консоль
строковое представление объекта перехваченного
исключения. Добавьте предложение finally и распечатайте
оттуда сообщение, о том, что объект исключения был
перехвачен.

3. Модифицируйте программу, полученную при выполнении
предыдущего задания таким образом, чтобы она выбрасывала
генерируемое исключение в том же методе. Модифицируйте
полученную программу таким образом, чтобы исключение
было выброшено только при выполнении некоторого условия,
например, при передачи вызываемому методу нулевой
ссылки. Всегда ли будет выполняться блок finally?
Напишите соответствующий код, доказывающий Ваш ответ.

4. Намеренно смоделируйте ситуации:
a) переполнения стека
b) нехватки памяти в куче*/

public class Solution {

    public static void task01() {
        Object obj = null;
        try {
            obj.toString();
        } catch (NullPointerException npe) {
            print(npe);
        }
    }

    /*class ExceptionThrower <E extends Exception> {

        E exception;

        public ExceptionThrower(E exception) {
            this.exception = exception;
        }

        private void generateException() throws E {
            throw exception;
        }
        private void interceptException() {
            try {
                generateException();
            } catch (E e) {
                print(e);
            }
        }

    }*/

    public static void main(String... args){
        task01();
    }
}
