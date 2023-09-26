public class Monoalphabetic {
    public static void main(String[] args) {
        String plaintext = "hello";
        String key = "P";

        // Encrypt the plaintext
        String ciphertext = encrypt(plaintext, key);
        System.out.println("Cipher: " + ciphertext);

        // Decrypt the ciphertext
        String decryptedText = decrypt(ciphertext, key);
        System.out.println("Decipher: " + decryptedText);
    }

    public static String encrypt(String plaintext, String key) {
        plaintext = plaintext.toUpperCase();
        String ciphertext = "";

        int intKey;
        if (isInteger(key)) {
            intKey = Integer.parseInt(key);
        } else {
            // Handle string key by converting it to uppercase (pwersa to uppercase char)..haahahh.
            key = key.toUpperCase();
            intKey = key.charAt(0) - 'A';
        }

        for (int i = 0; i < plaintext.length(); i++) {
            int index = plaintext.charAt(i) - 'A';
            int ci = (index + intKey) % 26;
            char ch = (char) (ci + 'A');
            ciphertext += ch;
        }

        return ciphertext;
    }

    public static String decrypt(String ciphertext, String key) {
        ciphertext = ciphertext.toUpperCase();
        String decryptedText = "";

        int intKey;
        if (isInteger(key)) {
            intKey = Integer.parseInt(key);
        } else {
            // Handle string key by converting it to uppercase
            key = key.toUpperCase();
            intKey = key.charAt(0) - 'A';
        }

        for (int i = 0; i < ciphertext.length(); i++) {
            int index = ciphertext.charAt(i) - 'A';
            int ci = (index - intKey + 26) % 26;
            char ch = (char) (ci + 'A');
            decryptedText += ch;
        }

        return decryptedText;
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
