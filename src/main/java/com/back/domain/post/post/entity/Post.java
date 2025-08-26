package com.back.domain.post.post.entity;

import com.back.domain.member.entity.Member;
import com.back.global.jpa.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Post extends BaseEntity {

    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    @ManyToOne
    private Member author;

    public Post(String title, String content, Member author) {
        this.title = title;
        this.content = content;
        this.author=author;
    }
}