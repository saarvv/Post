package com.sarv.PostAndPostman.postman;

import com.sarv.PostAndPostman.post.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostmanService implements IPostmanService {

    private PostmanRepository repository;

    public PostmanService(PostmanRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Postman> findAll() {
        return repository.findAll();
    }

    @Override
    public Postman save(Postman postman) {
        return repository.save(postman);
    }
}
