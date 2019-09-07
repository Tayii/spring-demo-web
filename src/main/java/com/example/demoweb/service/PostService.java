package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {
    private ArrayList<Post> allPosts;

    public ArrayList<Post> listAllPosts() {
        if (this.allPosts == null) {
            this.allPosts = new ArrayList<>();
            this.allPosts.add(new Post("Kappa"));
            this.allPosts.add(new Post("Keepo"));
            this.allPosts.add(new Post("PogChamp"));
        }
        return this.allPosts;
    }
}
