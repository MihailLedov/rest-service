package com.ledok.spring.restservice.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table (name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column (name = "name")
    private String name;

    @Column (name = "email")
    private String email;
}
