package com.example.silkroadsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
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

    private BasketModel basket;
}
