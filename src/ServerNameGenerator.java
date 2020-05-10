//import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {

        // Create two arrays whose elements are strings:
        // one with at least 10 adjectives, another with at least 10 nouns.
        String[] adjectives = {"dedicated", "detailed", "fancy", "glossy", "tall", "beautiful", "confident", "shiny", "lovely", "dirty"};
        String[] nouns = {"ion", "nitrogen", "photon", "neutron", "proton", "electron", "gamma", "carbon", "chase", "fiber"};

        Random random = new Random();
        int indexAdj = random.nextInt(adjectives.length);
        System.out.println(adjectives[indexAdj]);
        int indexN = random.nextInt(adjectives.length);
        System.out.println(nouns[indexN]);

        System.out.printf("Here is your server name:%n%s-%s", adjectives[indexAdj], nouns[indexN]);

    }
}

