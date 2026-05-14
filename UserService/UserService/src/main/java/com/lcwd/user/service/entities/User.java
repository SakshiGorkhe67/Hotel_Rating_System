package com.lcwd.user.service.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="micro_users")
@Setter
@Getter

public class User {
    @Id
    @Column(name="ID")
    private String userId;
    @Column(name="NAME",length = 20)
    private String name;
    @Column(name="EMAIL")
    private String email;
    @Column(name="ABOUT")
    private String about;

    //it will not store it in database
    @Transient
    private List<Rating> ratings = new ArrayList<>();
}
