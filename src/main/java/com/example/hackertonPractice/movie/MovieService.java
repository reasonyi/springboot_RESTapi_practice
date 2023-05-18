package com.example.hackertonPractice.movie;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor    // final이 선언된 모든 필드를 인자값으로 하는 생성자를 대신 생성해줌. 의존성 관계가 변경될 때마다 코드를 계속해서 수정하는 번거로움을 해결
@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public Movie createMovie(MovieDto movieDto) {
        return movieRepository.save(movieDto.toEntity());
    }

    public Movie findById(Long id) {
        return movieRepository.findById(id)
                .orElseThrow(()-> new NullPointerException());  // 찾고자 하는 영화가 없으면 null을 던진다.

    }

    public Movie updateMovie(Long id, MovieDto movieDto) {
        Movie movie = findById((id));
        movie.update(movieDto.getTitle(), movieDto.getGenre(), movieDto.getRunningTime(), movieDto.getPostUrl());
        return movie;
    }

    public Long deleteMovie(Long id) {
        Movie movie = findById(id);
        movieRepository.delete(movie);
        return id;
    }

    public List<Movie> findAllMovie() {
        return movieRepository.findAll();
    }

}
