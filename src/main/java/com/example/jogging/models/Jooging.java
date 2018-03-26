package com.example.jogging.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by VAfonin on 26.03.2018.
 */
@Entity
@Table (name = "jogging")
@Getter
@Setter
public class Jooging implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @ManyToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn (name = "jogging_id", nullable = false)
    private User user;

    @Column
    @Temporal (TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createJooging;

    @Column
    @Temporal (TemporalType.TIMESTAMP)
    @CreatedDate
    private Date endJooging;

    @Override
    public String toString () {
        return "Jooging{" +
                "id=" + id +
                ", user=" + user +
                ", createJooging=" + createJooging +
                ", endJooging=" + endJooging +
                '}';
    }
}
