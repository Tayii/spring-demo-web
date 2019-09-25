package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    private ArrayList<Post> allPosts;

    public ArrayList<Post> listAllPosts() {
        if (this.allPosts == null) {
            this.allPosts = new ArrayList<>();
            this.allPosts.add(new Post("Kappa", new Date()));
            this.allPosts.add(new Post("Keepo", new Date()));
            this.allPosts.add(new Post("PogChamp", new Date()));
        }
        return this.allPosts;
    }
}
