package com.secondmonth.bookable.modules.books.model;

import com.secondmonth.bookable.modules.users.model.Users;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.List;

public class Books {


    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String author;

    @Column(name = "release_date", updatable = false)
    private LocalDateTime releaseDate;

//    RELATIONS
    @ManyToMany(mappedBy = "books")
    private List<Users> users;

//    TODO more properties on book


    public Books() {
    }

    public Books(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
}
