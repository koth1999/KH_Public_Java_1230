package 입출력스트림예제10번;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
    private int number;
    private String title;
    private String content;
    private String writer;
    private Date date;

    public Board(int number, String title, String content, String writer, Date date) {
        this.number = number;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
