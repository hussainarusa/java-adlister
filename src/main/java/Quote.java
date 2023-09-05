public class Quote {
    private long in;
    private String content;
    private Author author;

    public long getIn() {
        return in;
    }

    public void setIn(long in) {
        this.in = in;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Quote(long in, String content, Author author) {
        this.in = in;
        this.content = content;
        this.author = author;
    }


}
