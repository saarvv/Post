package com.sarv.PostAndPostman.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/post")
public class PostController {

    private IPostService postService;
    private PostRepository repository;
    private PostMapper postMapper;

    @Autowired
    public PostController(IPostService postService, PostRepository repository, PostMapper postMapper) {
        this.postService = postService;
        this.repository = repository;
        this.postMapper = postMapper;
    }

    @PostMapping
    public ResponseEntity<Object> savePost(@RequestBody @Valid PostDto postDto){
        Post post = postMapper.toEntity(postDto);
        postService.save(post);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


    @GetMapping
    public List<Post> getAll(){
        List<Post> posts = postService.findAll();
        List<PostDto> postDtos = postMapper.toDto(posts);
        return postService.findAll();
    }
}
