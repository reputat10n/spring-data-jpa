package com.chau.jpa.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author Chau
 * @date 2020/6/19
 * @func
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String color;

    private Integer type;

    @ManyToMany
    @JoinTable(name = "user_car", joinColumns = {@JoinColumn(name = "cid",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "uid", referencedColumnName = "id")})
    private Collection<User> users;

}
