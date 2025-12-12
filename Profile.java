public class Profile {
    private String username;
    private String bio;
    private int followers;

    // Constructor
    public Profile(String username, String bio, int followers) {
        this.username = username;
        this.bio = bio;
        this.followers = followers;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getBio() {
        return bio;
    }

    public int getFollowers() {
        return followers;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public void printInfo() {
        System.out.println("Profile: @" + username + " | Bio: " + bio + " | Followers: " + followers);
    }

    // Compare profiles by followers
    public boolean hasMoreFollowers(Profile other) {
        return this.followers > other.followers;
    }
}
