import java.util.Scanner;
import org.w3c.dom.Text;

public class Encrypter {

    static Scanner userInput = new Scanner(System.in);
    private static String DecrypteRoute = "EncryptedMesseges.txt";
    private static String[] textToEncrypt = { "abcdefghijklmnopqrstuvwxyz" };
    private static String[] textToDencrypt = {};

    static int mayusLowerValue = 65;
    static int mayusUpperValue = 90;
    static int minusLowerValue = 97;
    static int minusUpperValue = 122;

    public static void main(String[] args) {
        System.out.println("1.- Encrypt Text\n2.-De-encrypt Text");
        int selection = userInput.nextInt();
        switch (selection) {
            case 1:
                EncryptText();
                break;
            case 2:
                DeencryptText();
                break;
        }
        //Encrypt(textToEncrypt[0], 15);
        //Deencrypter.Dencrypt(textToDencrypt);
    }

    public static void EncryptText() {}

    public static void DeencryptText() {
        textToDencrypt = TextFile.GetKotobas(DecrypteRoute);
        int kEncrypt[] = new int[11];
        for (int i = 0; i < textToDencrypt.length; i++) {
            Deencrypter.Dencrypt(textToDencrypt[i]);
            kEncrypt[i] = userInput.nextInt();
        }
        for (int i = 0; i < textToDencrypt.length; i++) {
            System.out.println(textToDencrypt[i] + " (k=" + kEncrypt[i] + ")");
            Encrypt(textToDencrypt[i], 26 - (kEncrypt[i]));
            System.out.println();
        }
    }

    public static void Encrypt(String text, int spaceToMove) {
        if (spaceToMove > 26) {
            spaceToMove = spaceToMove % 26;
        }
        for (int i = 0; i < text.length(); i++) {
            int asciiValue = (int) text.charAt(i);
            char newChar = (char) asciiValue;
            if (
                (asciiValue >= minusLowerValue && asciiValue <= minusUpperValue)
            ) {
                if (asciiValue + spaceToMove > minusUpperValue) {
                    newChar = (char) (asciiValue +
                        spaceToMove -
                        minusUpperValue -
                        1 +
                        minusLowerValue);
                } else {
                    newChar = (char) (asciiValue + spaceToMove);
                }
            } else if (
                (asciiValue >= mayusLowerValue && asciiValue <= mayusUpperValue)
            ) {
                if (asciiValue + spaceToMove > mayusUpperValue) {
                    newChar = (char) (asciiValue +
                        spaceToMove -
                        mayusUpperValue -
                        1 +
                        mayusLowerValue);
                } else {
                    newChar = (char) (asciiValue + spaceToMove);
                }
            }
            System.out.print(newChar);
        }

        System.out.println();
    }
}
