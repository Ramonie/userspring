package com.devramonie.userspring.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="tb_user")
public class Users {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  Long id;
    private  String name;
    private String email;
    @ManyToOne
    @JoinColumn(name = "departament_id")
    private Departaments Departament;

    public Users(){
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Departaments getDepartament() {
        return Departament;
    }

    public void setDepartament(Departaments departament) {
        Departament = departament;
    }



}
