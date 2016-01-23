package jt.library.model.entity;

import java.util.List;

/**
 * Created by sergey on 17.01.16.
 */
public class Book implements Persisten {
    private Long id;
    private String title;
    private List<Author> authors;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
