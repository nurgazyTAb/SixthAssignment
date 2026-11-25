import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (i == 0 || input.charAt(i - 1) == ' ') {
                result = result + Character.toUpperCase(ch);
            } else {
                result = result + Character.toLowerCase(ch);
            }
        }

        System.out.println(result);
    }
}
