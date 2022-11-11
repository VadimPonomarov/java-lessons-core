package lesson1.hw.classes;

public class Main {

    public static void main(String[] args) {
        System.out.print("=========================================\n");
        System.out.print("Hello!!! This is my first JAVA project\n");
        System.out.print("=========================================\n");
        Post newPost = new Post(1, 2, "Post title ...", "Post body ...");
        System.out.print("This is my Post class attributes: " + newPost.toString()+"\n");
        System.out.print("=========================================\n");
        Comment newComment = new Comment(1, 2, "Comment name ...", "Email ...", "Comment body ...");
        System.out.print("This is my Comment class attributes:" + newComment.toString()+"\n");
        System.out.print("=========================================\n");
    }

}


