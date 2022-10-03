package com.sparta.homework.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sparta.homework.dto.HomeWorkRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class HomeWork extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String username;

    @JsonIgnore
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String contents;


    public HomeWork(HomeWorkRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
        this.contents = requestDto.getContents();
    }
    public HomeWork(String title,String username, String contents, String password) {
        this.title = title;
        this.password = password;
        this.username = username;
        this.contents = contents;
    }

    public void update(HomeWorkRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.password = requestDto.getPassword();
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }

}