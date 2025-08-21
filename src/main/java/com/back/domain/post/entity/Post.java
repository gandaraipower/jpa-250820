package com.back.domain.post.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
    @Getter
    @NoArgsConstructor
    @Entity
    public class Post {

        @Id
        @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
        private int id;
        private String title;
        @Column(columnDefinition = "TEXT")
        private String content;
        private LocalDateTime createdDate;
        private LocalDateTime modifyDate;

        public Post(String title, String content) {
            this.createdDate = LocalDateTime.now();
            this.modifyDate = LocalDateTime.now();

            this.title=title;
            this.content=content;
        }
    }

