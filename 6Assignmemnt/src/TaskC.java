import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int vowels = 0;
        for (char ch : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            }
        }

        System.out.println("Vowels = " + vowels);
    }
}
