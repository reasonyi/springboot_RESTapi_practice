package com.example.hackertonPractice.movie;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequiredArgsConstructor    // final이 선언된 모든 필드를 인자값으로 하는 생성자를 대신 생성해줌. 의존성 관계가 변경될 때마다 코드를 계속해서 수정하는 번거로움을 해결
@RequestMapping(value = "/api/movie")
@CrossOrigin                // 모든 도메인, 모든 요청방식에 대해 허용한다는 뜻이다.
public class MovieController {

    private final MovieService movieService;

    @GetMapping // 모든 영화를 다 가져오는 경우
    public ResponseEntity getAllMovie() {   // ResponseEntity는 HttpStatus, HttpHeaders, HttpBody를 포함한다.
        List<Movie> movies = movieService.findAllMovie();
        return ResponseEntity.ok().body(movies);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity getMovie(@PathVariable Long id) {
        Movie movie = movieService.findById(id);
        return ResponseEntity.ok().body(movie);
    }

    @PostMapping
    public ResponseEntity createMovie(@RequestBody MovieDto movieDto) {
        Movie movie = movieService.createMovie(movieDto);
        URI createUri = linkTo(methodOn(MovieController.class).createMovie(movieDto)).slash(movie).toUri();

        return ResponseEntity.created(createUri).body(movie);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.ok().body(id);
    }
}
