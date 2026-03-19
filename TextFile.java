import java.io.*;
import java.nio.file.*;

public class TextFile {

    public static String[] GetKotobas(String route) {
        String[] Phrase = {};
        String characterToRead = "\\s*@\\s";

        try {
            String content = Files.readString(Paths.get(route));

            String[] Phrases = content.split(characterToRead);
            Phrase = Phrases;
        } catch (IOException e) {}

        return Phrase;
    }
}
