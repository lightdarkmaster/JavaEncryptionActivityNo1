import java.util.Scanner;
public class VigenereCipher
{

    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        String plaintext;
        String keyword;

        System.out.println("Enter plaintext: ");
        plaintext = input.nextLine();

        System.out.println("Enter Key: ");
        keyword = input.next();
        //decrypt(plaintext,keyword);

        encrypt(plaintext, keyword);
        decrypt();

        //if the key is integer execute this condition
        int intKey;
        if (isInteger(keyword)) {
            intKey = Integer.parseInt(keyword);
            System.out.println("Integer Key: " + intKey);
            encrypt(plaintext, String.valueOf(intKey));
            decrypt(plaintext, intKey);
        } else {
            System.out.println("String Key: " + keyword);
            encrypt(plaintext, keyword);
            decrypt(plaintext, Integer.parseInt(keyword));
        }
    }

    private static void decrypt(String plaintext, int intKey) {
    }


    public static void encrypt(String plaintext, String keyword){
        //Converting plaintext to char array
        char msg[] = plaintext.toCharArray();
        int msgLen = msg.length;
        int i,j;

        // Creating new char arrays
        char key[] = new char[msgLen];
        char encryptedMsg[] = new char[msgLen];

 /* generate key, using keyword in cyclic
 manner equal to the length of
 original message i.e plaintext */
        for(i = 0, j = 0; i < msgLen; ++i, ++j)
        {
            if(j == keyword.length())
            {
                j = 0;
            }
            key[i] = keyword.charAt(j);
        }

        //encryption code
        for(i = 0; i < msgLen; ++i)
            encryptedMsg[i] = (char) (((msg[i] + key[i]) % 26) + 'A');



        System.out.println("Original Message: " + plaintext);
        System.out.println("Keyword: " + keyword);
 /* String.valueOf() method converts
    char[] to String */
        System.out.println("Key: " + String.valueOf(key));
        System.out.println();
        System.out.println("Encrypted Message: " + String.valueOf(encryptedMsg));
    }

    public static void decrypt(){
        Scanner input = new Scanner(System.in);
        String plaintext = "";
        String keyword = "";

        //Converting plaintext to char array
        char msg[] = plaintext.toCharArray();
        int msgLen = msg.length;
        int i,j;

        // Creating new char arrays
        char key[] = new char[msgLen];
        char encryptedMsg[] = new char[msgLen];
        char decryptedMsg[] = new char[msgLen];

 /* generate key, using keyword in cyclic
 manner equal to the length of
 original message i.e plaintext */
        for(i = 0, j = 0; i < msgLen; ++i, ++j)
        {
            if(j == keyword.length())
            {
                j = 0;
            }
            key[i] = keyword.charAt(j);
        }
        for(i = 0; i < msgLen; ++i)
            decryptedMsg[i] = (char)((((encryptedMsg[i] - key[i]) + 26) % 26) + 'A');

        System.out.println("Decrypted Message: " + String.valueOf(decryptedMsg));

    }
    public static boolean isInteger(String str) {
        try {
            int value = Integer.parseInt(str);
            // Ensure the integer value is within the range [0, 25]
            return value >= 0 && value <= 25;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}