import java.util.Scanner;

public class Main {
    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++) {
            if (analyzers[i].processText(text) != Label.OK) {
                return analyzers[i].processText(text);
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) {

        int ml = 30;
        String[] spam = {"плохой", "отвратный", "отрицательный", "дурак"};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите комментарий: \n");
        String string = in.nextLine();
        TextAnalyzer[] ta = {
                new SpamAnalyzer(spam),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(ml)
        };
        System.out.println(checkLabels(ta, string));
    }
}