package com.example.jogging.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by VAfonin on 26.03.2018.
 */
@Entity
@Table (name = "users_j")
public class User implements Serializable {

    public User() {
    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonIgnore
    @Column (name = "loggin")
    private String loggin;

    @JsonIgnore
    @Column (name = "password")
    private String password;

//    @Column (name = "create",nullable = false, updatable = false)
//    @Temporal (value = TemporalType.TIMESTAMP)
//    @CreatedDate
//    private Date createDate;

    @JsonIgnore
    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "user")
    private List<Jooging> joogingList;

    public Integer getId () {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public String getLoggin () {
        return loggin;
    }

    public void setLoggin (String loggin) {
        this.loggin = loggin;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public List<Jooging> getJoogingList () {
        return joogingList;
    }

    public void setJoogingList (List<Jooging> joogingList) {
        this.joogingList = joogingList;
    }

    @Override
    public String toString () {
        return "User{" +
                "id=" + id +
                ", loggin='" + loggin + '\'' +
                ", password='" + password + '\'' +
                ", createDate=" +
                ", joogingList=" + joogingList +
                '}';
    }
}
