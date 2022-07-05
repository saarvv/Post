package com.sarv.PostAndPostman.postman;

import com.sarv.PostAndPostman.post.Post;

import java.util.List;

public interface IPostmanService {

    List<Postman> findAll();

    Postman save(Postman postman);
}
