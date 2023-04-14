import java.util.Scanner;
import java.util.*;

public class CompteurMots {

    public static int compterMots(String phrase) {
        if (phrase == null || phrase.trim().isEmpty()) {
            return 0;
        } else {
            String[] mots = phrase.trim().split("\\s+");
            return mots.length;
        }
    }

    public static void main(String[] args) {
        String phrase1 = "Bonjour, comment ça va ?";

        System.out.println("Phrase 1 : " + compterMots(phrase1) + " mots");
    }
}
