public class Post {
    private String content;
    private String author;
    private int likes;

    // Constructor
    public Post(String content, String author, int likes) {
        this.content = content;
        this.author = author;
        this.likes = likes;
    }

    // Getters
    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public int getLikes() {
        return likes;
    }

    // Setters
    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    // Method
    public void printInfo() {
        System.out.println("Post by " + author + ": \"" + content + "\" | Likes: " + likes);
    }

    // Compare posts by likes
    public boolean hasMoreLikesThan(Post other) {
        return this.likes > other.likes;
    }
}
