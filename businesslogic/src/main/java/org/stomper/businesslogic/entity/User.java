package org.stomper.businesslogic.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by i848785 on 3/29/16.
 */
@Entity
@Table(name = "ORG_USER")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    public User(){}

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "USER_NAME")
    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
