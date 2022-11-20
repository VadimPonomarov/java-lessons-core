package Lesson2.hw2.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class Comics extends Magazine {
    private String comics_name;

    public Comics(Paper paper, String editor, String release_date, String comics_name) {
        super(paper, editor, release_date);
        this.comics_name = comics_name;
    }

    public String toString() {
        return "\nComics:" +
                "\ncomics_name=" + comics_name +
                super.toString();
    }

}
