public class ServerNameGenerator {
    /* Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    Create a method that will return a random element from an array of strings.
    Add a main method, and inside of your main method select and random noun and adjective
    and hyphenate the combination and display the generated name to the user.

    Example Output
    Here is your server name:
    dedicated-photon */

    static String[] adjs = {"happy", "stormy", "green", "lively", "massive", "loud", "quick", "lurid", "intense", "quiet"};
    static String[] nouns = {"quorum", "darling", "tanker", "termite", "bird", "locomotive", "dog", "pancake", "paint", "house"};

    public static void main(String[] args) {
        String randomAdj = getRandomStringFromArray(adjs);
        String randomNoun = getRandomStringFromArray(nouns);

        String serverName = String.format("%s-%s", randomAdj, randomNoun);
        System.out.println(serverName);
    }

    private static String getRandomStringFromArray(String[] source) {
        int randomIndex = (int) (Math.random() * source.length);
        return source[randomIndex];
    }
}
