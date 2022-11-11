package lesson1.hw.classes;

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    @Override
    public String toString() {
        return "\nPost:" +
                "\nuserId=" + userId +
                "\nid=" + id +
                "\ntitle='" + title + '\'' +
                "\nbody='" + body + '\'' +
                "";
    }


    public Post() {
    }

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public void setUserId(short userId) {
        this.userId = userId;
    }

    public void setId(short id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
