package jt.library.model.entity;

/**
 * Created by sergey on 17.01.16.
 */
public class Author implements Persisten {
    private Long id;
    private String firstName;
    private String lastName;



    public Author() {
    }

    public Author(Long id) {
        this.id = id;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
