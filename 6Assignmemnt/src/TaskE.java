import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            int count = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == current) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(current);
                break;
            }
        }
    }
}
