package com.example.silkroadsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    private String password;

    private String phoneNumber;

    private String summaT;

    private String DT;

    private String KT;

    private String inn;

    private String country;

    private String region;

    private String street;

    private String account;

    private String mfoC;

    private String emp;

    private String nLic;

    private String hash;

    private String tarif;

    @OneToOne(cascade = CascadeType.ALL)
    private Basket basket;
}
