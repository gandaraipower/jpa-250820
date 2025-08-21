package com.back.global.initData;

import com.back.domain.post.entity.Post;
import com.back.domain.post.service.PostService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration //spring이 bean으로 등록해 줌
@RequiredArgsConstructor
public class BaseInitData {


    private final PostService postService; //한번저장하고 계속 쓸 수있다. 바뀔 일이 없다


    @Bean
    @Transactional
    ApplicationRunner initDataRunner(){
        return args -> {
            work1();
            work2();
        };
    }

    //baseinitData(repository) -> view -> service
    //생성
    @Transactional
    private void work1() {

        if(postService.getTotalCount() >0){
            return;
        }
        
        //서비스를 도입해서 비즈니스 로직을 재사용
        postService.write("제목1","내용1");
        postService.write("제목2","내용2");

    }
    
    //조회
    @Transactional
    private void work2() {
        Optional<Post> onPost = postService.getPost(1);
    }
}
