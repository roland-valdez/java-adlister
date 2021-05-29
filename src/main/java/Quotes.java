import java.io.Serializable;

public class Quotes implements Serializable {
    private int id;
    private String content;
    private int authorId;
    private String Author;

    public Quotes(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getId() {
        return this.id;
    }

    public String getAuthor() {
        return this.Author;
    }

    public int getAuthorId() {
        return this.authorId;
    }

    public String getContent() {
        return content;
    }
}
