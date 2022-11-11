package lesson1.hw.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comment {
    private int postId;
    private int iD;
    private String name;
    private String email;
    private String body;

    @Override
    public String toString() {
        return "\nComment: " +
                "\npostId=" + postId +
                "\niD=" + iD +
                "\nname='" + name + '\'' +
                "\nemail='" + email + '\'' +
                "\nbody='" + body + '\'' +
                "";
    }
}
