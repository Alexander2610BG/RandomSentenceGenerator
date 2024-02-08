import java.util.Random;
import java.util.Scanner;

public class RandomSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = { "Alex", "George", "Ema", "Svetlomira" };
        String [] places = { "Varna", "Plovdiv", "Burgas", "Sofia", "Dublin" };
        String[] verbs = { "eats", "plays with", "brings", "sees", "holds"};
        String[] nouns = { "stones", "cake", "apple", "laptop", "bikes"};
        String[] adverbs = { "slowly", "diligently", "warmly", "sadly", "rapidly"};
        String[] details = { "near the river", "at home", "in the park" };

        System.out.println("Please enter the number of sentences: ");
        int sentences = Integer.parseInt(scanner.nextLine());

        System.out.println("Hello, this is your first random-generated sentence: ");
        System.out.println();

        for (int i = 1; i <= sentences ; i++) {
            String randomName = getRandomWord(names);
            String randomPlace = getRandomWord(places);
            String randomVerb = getRandomWord(verbs);
            String randomNoun = getRandomWord(nouns);
            String randomAdverb = getRandomWord(adverbs);
            String randomDetail = getRandomWord(details);

            System.out.printf("%s from %s %s %s %s %s%n",randomName, randomPlace, randomAdverb,
                    randomVerb, randomNoun, randomDetail);
            System.out.println();
        }

    }

    public static String getRandomWord(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];

        return word;
    }
}