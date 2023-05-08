package com.ll.gramgram3.boundedContext.instaMember.repository;

import com.ll.gramgram3.boundedContext.instaMember.entity.InstaMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InstaMemberRepository extends JpaRepository<InstaMember, Integer> {
    Optional<InstaMember> findByUsername(String username);
}