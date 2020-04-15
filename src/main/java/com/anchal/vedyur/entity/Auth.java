package com.anchal.vedyur.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="auth")
@Data
public class Auth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private  String password;
}
