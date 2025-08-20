package com.back.domain.post.repository;

import com.back.domain.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
//JpaRepository<T,ID> T: 어떤 엔티티 클래스를 다룰지 , ID: 그 엔티티의 기본 키 타입
}
