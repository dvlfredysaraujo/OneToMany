package com.spring_project.OneToMany.repository;

import com.spring_project.OneToMany.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}


