public class SocialNetwork {
    private String name;
    private int totalUsers;

    // Constructor
    public SocialNetwork(String name, int totalUsers) {
        this.name = name;
        this.totalUsers = totalUsers;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }

    public void printInfo() {
        System.out.println("Social Network: " + name + " | Total Users: " + totalUsers);
    }
}
