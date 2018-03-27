package com.example.jogging.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by VAfonin on 26.03.2018.
 */
@Entity
@Table (name = "users_j")
@Getter
@Setter
public class User implements Serializable {

    public User() {
    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "loggin")
    private String loggin;

    @Column (name = "password")
    private String password;

    @Column (name = "create",nullable = false, updatable = false)
    @Temporal (value = TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createDate;

    @JsonIgnore
    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "user")
    private List<Jooging> joogingList;

    @Override
    public String toString () {
        return "User{" +
                "id=" + id +
                ", loggin='" + loggin + '\'' +
                ", password='" + password + '\'' +
                ", createDate=" + createDate +
                ", joogingList=" + joogingList +
                '}';
    }
}
