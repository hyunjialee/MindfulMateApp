package com.example.mindfulmateapp.user.model;

import com.example.mindfulmateapp.mood.model.MoodEntry;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
@Data
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int userId;
    private String userName;
    private String email;
    private String password;


    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    List<MoodEntry> moodEntries;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Collections.emptyList();
//    }
//
//    @Override
//    public String getUsername() {
//        return userName;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
}
