package com.matias.resquin.veterinary.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data

public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOwner;
    private String name;
    private String lastName;
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Pet> petList = new ArrayList<>();

}
