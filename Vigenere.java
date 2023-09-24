import java.util.Scanner;

public class Vigenere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter plaintext: ");
        String plaintext = input.nextLine();
        System.out.println("Enter key: ");
        String keyword = input.nextLine();

        String encryptedMsg = encrypt(plaintext, keyword);
        String decryptedMsg = decrypt(encryptedMsg, keyword);

        System.out.println("Original Message: " + plaintext);
        System.out.println("Keyword: " + keyword);
        System.out.println("Encrypted Message: " + encryptedMsg);
        System.out.println("Decrypted Message: " + decryptedMsg);

        input.close();
    }

    public static String encrypt(String plaintext, String keyword) {
        char[] msg = plaintext.toCharArray();
        char[] key = generateKey(msg, keyword);

        char[] encryptedMsg = new char[msg.length];

        for (int i = 0; i < msg.length; ++i)
            encryptedMsg[i] = (char) (((msg[i] + key[i]) % 26) + 'A');

        return String.valueOf(encryptedMsg);
    }

    public static String decrypt(String encryptedMsg, String keyword) {
        char[] encMsg = encryptedMsg.toCharArray();
        char[] key = generateKey(encMsg, keyword);

        char[] decryptedMsg = new char[encMsg.length];

        for (int i = 0; i < encMsg.length; ++i)
            decryptedMsg[i] = (char)((((encMsg[i] - key[i]) + 26) % 26) + 'A');

        return String.valueOf(decryptedMsg);
    }

    private static char[] generateKey(char[] message, String keyword) {
        char[] key = new char[message.length];

        for (int i = 0, j = 0; i < message.length; ++i, ++j) {
            if (j == keyword.length()) {
                j = 0;
            }
            key[i] = keyword.charAt(j);
        }

        return key;
    }
}
