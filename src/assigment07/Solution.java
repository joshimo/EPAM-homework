package assigment07;

import java.io.IOException;
import java.util.*;
import static com.joshimo.utils.WindowPrinter.*;
import static com.joshimo.utils.WindowReader.*;

public class Solution {

    /* task 01 */
    public static Integer calculateLength(String string) {
        return string.length();
    }

    /* task 02 */
    public static Boolean checkEquality(String string1, String string2, boolean ignoreCase) {
        if (ignoreCase)
            return string1.toLowerCase().equals(string2.toLowerCase());
        return string1.equals(string2);
    }

    /* task03 */
    public static String changeToUppercase(String string) {
        return string.toUpperCase();
    }

    public static String changeToLowercase(String string) {
        return string.toLowerCase();
    }

    /* task 04 */
    public static Set<Integer> findIndexes(String string, String word, boolean ignoreCase) {
        Set<Integer> result = new HashSet<>();
        String[] str = string.split("[^0-9a-zA-Zа-яА-ЯёЁ@&]");
        for (int index = 0; index < str.length; index ++)
            if (checkEquality(str[index], word, ignoreCase))
                result.add(index + 1);
        return result;
    }

    /* task 05 */
    public static String replaceWord(String string, String wordToReplace, String replacement, boolean ignoreCase) {
        if (!ignoreCase)
            return string.replace(wordToReplace, replacement);
        String upper = wordToReplace.toUpperCase();
        String lower = wordToReplace.toLowerCase();
        StringBuilder regex = new StringBuilder();
        for (int index = 0; index < wordToReplace.length(); index ++)
            regex.append("[" + lower.charAt(index)).append(upper.charAt(index) + "]");
        return string.replaceAll(regex.toString(), replacement);
    }

    /* task 06 */
    public static Map<String, Integer> findRepetitions(String string) {
        Map<String, Integer> result = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(string.replace("-", " "), " ");
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().replaceAll("[^0-9a-zA-Zа-яА-ЯёЁ@&]", "");
            if (!result.containsKey(word))
                result.put(word, 1);
            else {
                Integer count = result.get(word) + 1;
                result.replace(word, count);
            }
        }
        return result;
    }

    public static void main (String... args) throws IOException {
        String text = read("Введите текст для анализа:");
        Integer length = calculateLength(text);
        print("Длина текста: " + length);
        print("Оригинал текста: \n" + text);
        print("Текст в нижнем регистре: \n" + text.toLowerCase());
        print("Текст в верхнем регистре: \n" + text.toUpperCase());
        String wordToReplace = read("Введите слово для замены:");
        String replacement = read("Введите замену для слова \'" + wordToReplace + "\':");
        String editedText = replaceWord(text, wordToReplace, replacement, true);
        print("Текст с замененным словом \'" + wordToReplace + "\' на слово \'" + replacement+ "\': \n" + editedText);
        String word = read("Введите слово для поиска в тексте:");
        Set<Integer> indexes = findIndexes(text, word, true);
        print("Позиции слова \'" + word + "\' в тексте: " + indexes);
        print("Число повторений каждого слова в тексте: ");
        Map<String, Integer> words = findRepetitions(text);
        Set<String> keywords = words.keySet();
        for (String keyword : keywords)
            print(keyword + " = " + words.get(keyword));

        /*print("Before exception");

        try {
            Integer.parseInt("");
        } catch (Exception e) {
            print(e);
            e.printStackTrace();
        }

        print("After exception");*/
    }
}
