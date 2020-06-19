package com.chau.jpa.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    private String username;

    private String password;

    private String address;

    private String contact;

    private String mobile;

    private String remark;

    @JsonIgnore
    @ManyToMany(mappedBy = "users")
    private Collection<Car> cars;

}
