package eu.ciechanowiec.intellij;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Herman Ciechanowiec
 */
class IntelliJ {

    public static void main(String[] args) {
        /* * * * * * * * * * * * * * * * * * * *
         * DO NOT CHANGE ANYTHING IN THIS MAIN *
         * * * * * * * * * * * * * * * * * * * * /

        /* TASK 1 */
        String wordOne = "Milky";
        String wordTwo = "Way";
        String connectedWords = connectWords(wordOne, wordTwo);
        System.out.println("\nTASK 1");
        System.out.printf("Connected words: %s%n", connectedWords);

        /* TASK 2 */
        int number = ThreadLocalRandom.current().nextInt(1, 100);
        int resultOfSomeMath = makeSomeMath(number);
        System.out.println("\nTASK 2");
        System.out.printf("Result of some math: %d%n", resultOfSomeMath);

        /* TASK 3 */
        String randomString = generateRandomString();
        System.out.println("\nTASK 3");
        System.out.printf("Random string: \"%s\"%n", randomString);

        /* TASK 4 */
        int randomNum = obtainRandomNum();
        System.out.println("\nTASK 4");
        System.out.printf("Random number: %d%n", randomNum);
    }

    /* Enable an appropriate inspection in 'Code style issues'
     * to see the mistake. Next, correct that mistake.
     * List of IntelliJ Java inspections:
     * https://www.jetbrains.com/help/idea/list-of-java-inspections.html */
    static String connectWords(String wordOne, String wordTwo) {
        return wordOne.concat(wordTwo);
    }

    /* Correct this method any way you like
     * to avoid the warning suggested by the Inspector */
    private static int makeSomeMath(int number) {
        return number / 1;
    }

    /* Correct this method the way
     * suggested by the Inspector */
    static String generateRandomString() {
//        String firstWordForMyString = "*******";
//        String secondWordForMyString = "======";
//        String thirdWordForMyString = "$$$$$$";
//        List<String> list = new ArrayList<>();
//        list.add(firstWordForMyString);
//        list.add(secondWordForMyString);
//        list.add(thirdWordForMyString);
//        Collections.shuffle(list);
//        return String.join("|", list);
        return IntStream.rangeClosed(0, 10)
                .map(num -> ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE))
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    /* Enable an appropriate inspection in 'Declaration redundancy'
     * to see the mistake. Next, correct that mistake.
     * List of IntelliJ Java inspections:
     * https://www.jetbrains.com/help/idea/list-of-java-inspections.html */
    protected static int obtainRandomNum() {
        return ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE);
    }
}
