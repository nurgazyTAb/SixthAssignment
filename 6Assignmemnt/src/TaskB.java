import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int consonants = 0;
        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z' && "aeiou".indexOf(ch) == -1) {
                consonants++;
            }
        }

        System.out.println("Consonants = " + consonants);
    }
}
