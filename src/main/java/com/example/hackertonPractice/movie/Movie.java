package com.example.hackertonPractice.movie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK의 생성 규칙을 나타낸다. GenerationType.IDENTITY 옵션을 추가하면 Auto_Increment가 된다.
    private Long id;

    private String title;       // 영화 제목
    private String genre;       // 영화 장르
    private int runningTime;    // 영화 러닝타임
    private String posterUrl;   // 영화 포스터 url

    public void update(String title, String genre, int runningTime, String posterUrl) {
        this.title = title;
        this.genre = genre;
        this.runningTime = runningTime;
        this.posterUrl = posterUrl;
    }

}
