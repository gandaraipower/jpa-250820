package com.back.global.initData;

import com.back.domain.post.entity.Post;
import com.back.domain.post.service.PostService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration //spring이 bean으로 등록해 줌
public class BaseInitData {


    private PostService postService;

    public BaseInitData(PostService postService) {
        this.postService = postService;
    }

    @Bean
    ApplicationRunner initDataRunner(){
        return args -> {
            work1();
            work2();
        };
    }

    //baseinitData(repository) -> view -> service
    private void work1() {

        if(postService.getTotalCount() >0){
            return;
        }
        
        //서비스를 도입해서 비즈니스 로직을 재사용
        postService.write("제목1","내용1");
        postService.write("제목2","내용2");

    }

    private void work2() {
        Optional<Post> onPost = postService.getPost(1);
    }
}
