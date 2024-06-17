package com.spring_project.OneToMany.controller;

import com.spring_project.OneToMany.entity.Blog;
import com.spring_project.OneToMany.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @GetMapping
    public ResponseEntity<List<Blog>> getAllBlogs(){
        List<Blog> allBlogs = blogRepository.findAll();
        return new ResponseEntity<>(allBlogs, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog){
        Blog savedBlog = blogRepository.save(blog);
        return new ResponseEntity<>(savedBlog, HttpStatus.OK);
    }
}


