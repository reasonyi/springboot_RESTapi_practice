package com.example.hackertonPractice.movie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class MovieDto {
    private String title;
    private String genre;
    private int runningTime;
    private String postUrl;

    public Movie toEntity() {
        return Movie.builder()
                .title(title)
                .genre(genre)
                .runningTime(runningTime)
                .posterUrl(postUrl)
                .build();
    }
}
