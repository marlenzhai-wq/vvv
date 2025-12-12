public class Main {
    public static void main(String[] args) {

        // Profiles
        Profile p1 = new Profile("marlen", "Java developer", 1200);
        Profile p2 = new Profile("aidana", "Designer", 2500);

        p1.printInfo();
        p2.printInfo();

        // Compare profiles
        if (p1.hasMoreFollowers(p2)) {
            System.out.println(p1.getUsername() + " has more followers.");
        } else {
            System.out.println(p2.getUsername() + " has more followers.");
        }

        // Posts
        Post post1 = new Post("Hello world!", "marlen", 300);
        Post post2 = new Post("New design uploaded!", "aidana", 500);

        post1.printInfo();
        post2.printInfo();

        // Compare posts by likes
        if (post1.hasMoreLikesThan(post2)) {
            System.out.println("Post 1 has more likes.");
        } else {
            System.out.println("Post 2 has more likes.");
        }

        // Social Network
        SocialNetwork sn = new SocialNetwork("ChatNet", 1000000);
        sn.printInfo();
    }
}
