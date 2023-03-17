package com.devramonie.userspring.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_departaments")

public final class Departaments {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private  String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
