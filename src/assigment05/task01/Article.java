package assigment05.task01;

import java.util.ArrayList;
import java.util.List;
import static assigment05.printer.Printer.*;

/** 1. Создать объект класса Текст, используя класс Абзац. Методы: дополнить текст, вывести на консоль
 текст, заголовок текста.*/

public class Article {

    private String name;
    private List<Paragraph> paragraphList;

    public Article(String name) {
        this.name = name;
        paragraphList = new ArrayList<>();
    }

    public void addParagraph(Paragraph paragraph) {
        paragraphList.add(paragraph);
    }

    public void printHeader() {
        print(name);
    }

    public void printText() {
        print(this.toString());
    }

    @Override
    public String toString() {
        String article = name + "\n";
        for (Paragraph paragraph : paragraphList)
            article += paragraph.getText() + "\n";
        return article;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (!name.equals(article.name)) return false;
        return paragraphList.equals(article.paragraphList);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + paragraphList.hashCode();
        return result;
    }
}