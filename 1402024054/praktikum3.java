
import java.util.Scanner;

public class praktikum3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau kalimat: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Ini adalah palindrome.");
        } else {
            System.out.println("Ini bukan palindrome.");
        }

    }

    public static boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanedInput.length() - 1;

        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}
