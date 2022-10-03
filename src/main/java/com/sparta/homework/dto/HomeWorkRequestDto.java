package com.sparta.homework.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class HomeWorkRequestDto {
    private String title;
    private String username;
    private String password;

    private String contents;


    public HomeWorkRequestDto(String title,String username,String contents, String password) {
        this.title = title;
        this.password = password;
        this.username = username;
        this.contents = contents;
    }

}