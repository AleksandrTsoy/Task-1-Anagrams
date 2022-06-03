import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Anagramms anagram = new Anagramms();
        Scanner in = new Scanner(System.in);
        System.out.print("Input the text: ");
        String text = in.nextLine();
        in.close();
        String reverseText = anagram.reverseText(text);
        System.out.println(reverseText);
    }
}