package com.sarv.PostAndPostman.post;

import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class PostService implements IPostService{

    private PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    @Override
    public Post save(Post post) {
        return (Post) repository.save(post);
    }

    @Override
    public List<Post> findAll() {
        return repository.findAll();
    }
}
