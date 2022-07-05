package com.sarv.PostAndPostman.post;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPostService {
    List<Post> findAll();
    Post save(Post post);

}
