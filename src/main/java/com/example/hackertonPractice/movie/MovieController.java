package com.example.hackertonPractice.movie;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor    // final이 선언된 모든 필드를 인자값으로 하는 생성자를 대신 생성해줌. 의존성 관계가 변경될 때마다 코드를 계속해서 수정하는 번거로움을 해결

public class MovieController {
}
