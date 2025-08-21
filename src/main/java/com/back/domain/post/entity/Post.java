package com.back.domain.post.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

    @Setter
    @Getter
    @Entity
    public class Post {

        @Id
        @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
        private int id;
        private String title;
        @Column(columnDefinition = "TEXT")
        private String content;

        public Post(){}

        public Post(String title, String content) {
            this.title = title;
            this.content = content;
        }
    }

