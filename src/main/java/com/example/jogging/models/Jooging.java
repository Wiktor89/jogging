package com.example.jogging.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by VAfonin on 26.03.2018.
 */
@Entity
@Table (name = "jogging")
@Getter
@Setter
public class Jooging implements Serializable {

    public Jooging () {
    }

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn (name = "jogging_id", nullable = false)
    private User user;

    @Column (name = "name")
    private String name;

//    @Column
//    @Temporal (TemporalType.TIMESTAMP)
//    @CreatedDate
//    private Date createJooging;
//
//    @Column
//    @Temporal (TemporalType.TIMESTAMP)
//    @CreatedDate
//    private Date endJooging;

    @Override
    public String toString () {
        return "Jooging{" +
                "id=" + id +
                ", user=" + user +
                ", createJooging=" +
                ", endJooging=" +
                '}';
    }
}
