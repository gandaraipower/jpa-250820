package com.back.domain.post.service;

import com.back.domain.post.entity.Post;
import com.back.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service //PostService를 bean으로 만듬, 가독성을 위해 Service, Component, Repository 사용
@RequiredArgsConstructor
public class PostService {


    private final PostRepository postRepository;

    public void write(String title, String content) {

        Post post = new Post(title,content);

        postRepository.save(post);
    }

    public Optional<Post> getPost(int id) {
        return postRepository.findById(id);
    }

    public long getTotalCount() {
        return postRepository.count();
    }
}
