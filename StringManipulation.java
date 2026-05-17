import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input yang benar
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah kalimat: ");
        String sentence = scanner.nextLine();
        
        System.out.println("\n--- Hasil Output ---");

        // 1. Total Karakter
        int totalChars = sentence.length();
        System.out.println("Total Characters: " + totalChars);

        // 2. Total Kata
        String[] words = sentence.trim().split("\\s+");
        int totalWords = sentence.trim().isEmpty() ? 0 : words.length;
        System.out.println("Total Words: " + totalWords);

        // 3. Uppercase
        System.out.println("Uppercase: " + sentence.toUpperCase());

        // 4. Lowercase
        System.out.println("Lowercase: " + sentence.toLowerCase());

        // 5. Reverse Sentence
        String reversed = new StringBuilder(sentence).reverse().toString();
        System.out.println("Reverse: " + reversed);

        // 6 & 7. Hitung Vokal dan Konsonan
        int vowels = 0;
        int consonants = 0;
        String lowerSentence = sentence.toLowerCase();

        for (int i = 0; i < lowerSentence.length(); i++) {
            char ch = lowerSentence.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // 8. Cek Palindrome
        String cleanSentence = sentence.replaceAll("\\s+", "").toLowerCase();
        String reversedClean = new StringBuilder(cleanSentence).reverse().toString();
        
        if (cleanSentence.equals(reversedClean)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        scanner.close();
    }
}