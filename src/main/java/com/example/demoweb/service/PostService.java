package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public ArrayList<Post> listAllPosts() {
        if (this.posts == null) {
            this.posts = new ArrayList<>();
        }
        return this.posts;
    }

    public void create(String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
