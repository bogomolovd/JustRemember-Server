package com.justremember.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @SequenceGenerator(name="user_sequence", sequenceName = "user_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String email;
    @Column(length = 150, nullable = false)
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
