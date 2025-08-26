package com.back.domain.member.repository;

import com.back.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Integer> {
//JpaRepository<T,ID> T: 어떤 엔티티 클래스를 다룰지 , ID: 그 엔티티의 기본 키 타입
}