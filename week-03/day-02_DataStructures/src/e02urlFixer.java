public class e02urlFixer {
    public static void main(String[] args) {
        String url1 = "https//www.reddit.com/r/nevertellmethebots";
        String url2 = "https//www.reddit.com/r/nevertellmethebots";
        String url3 = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        System.out.println(url1.replace("bots", "odds"));

        String urlCorrect = url2.replace("https", "https:");
        String urlCorrect2 = urlCorrect.replace("bots", "odds");
        System.out.println(urlCorrect2);

        if (!url3.startsWith("https://")) {
            url3 = url3.replace("https//", "https://");
        }
        url3 = url3.replace("bots", "odds");
        System.out.println(url3);
    }
}
