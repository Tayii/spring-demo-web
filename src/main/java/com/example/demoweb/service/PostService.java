package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    private ArrayList<Post> posts;

    public ArrayList<Post> listAllPosts() {
        if (this.posts == null) {
            this.posts = new ArrayList<>();
        }
        return this.posts;
    }

    public void create(String text) {
        if (this.posts == null) {
            this.posts = new ArrayList<>();
        }
        this.posts.add(new Post((long) this.posts.size(), text, new Date()));
    }
}
