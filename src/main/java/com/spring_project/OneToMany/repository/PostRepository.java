package com.spring_project.OneToMany.repository;

import com.spring_project.OneToMany.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}



