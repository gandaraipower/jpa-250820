package com.back.domain.post.entity;

import jakarta.persistence.*;
import lombok.*;

    @Setter
    @Getter
    @RequiredArgsConstructor
    @Entity
    public class Post {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private final String title;
        @Column(columnDefinition = "TEXT")
        private final String content;

        public Post(){
            this.title="";
            this.content="";
        }
    }

