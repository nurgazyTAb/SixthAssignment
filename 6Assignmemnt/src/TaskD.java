import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int words = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ' && (i == 0 || input.charAt(i - 1) == ' ')) {
                words++;
            }
        }

        System.out.println("Words = " + words);
    }
}
