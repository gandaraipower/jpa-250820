package com.back.domain.post.entity;

import jakarta.persistence.*;
import lombok.*;

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

        public Post(String title, String content) {
            this.title=title;
            this.content=content;
        }
    }

