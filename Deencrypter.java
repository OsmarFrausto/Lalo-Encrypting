public class Deencrypter {

    static int mayusLowerValue = 65;
    static int mayusUpperValue = 90;
    static int minusLowerValue = 97;
    static int minusUpperValue = 122;

    public static void Dencrypt(String text) {
        for (int i = 0; i <= 26; i++) {
            int spaceToMove = i;

            System.out.print(i + ".- ");
            for (int j = 0; j < text.length(); j++) {
                int asciiValue = (int) text.charAt(j);
                char newChar = (char) asciiValue;
                if (asciiValue == 32) {
                    System.out.print(" ");
                    continue;
                }
                if (
                    (asciiValue >= minusLowerValue &&
                        asciiValue <= minusUpperValue)
                ) {
                    if (asciiValue - spaceToMove < minusLowerValue) {
                        newChar = (char) (asciiValue -
                            spaceToMove +
                            minusUpperValue +
                            1 -
                            minusLowerValue);
                    } else {
                        newChar = (char) (asciiValue - spaceToMove);
                    }
                } else if (
                    (asciiValue >= mayusLowerValue &&
                        asciiValue <= mayusUpperValue)
                ) {
                    if (asciiValue - spaceToMove < mayusLowerValue) {
                        newChar = (char) (asciiValue -
                            spaceToMove +
                            mayusUpperValue +
                            1 -
                            mayusLowerValue);
                    } else {
                        newChar = (char) (asciiValue - spaceToMove);
                    }
                }
                System.out.print(newChar);
            }
            System.out.println();
        }
    }
}
