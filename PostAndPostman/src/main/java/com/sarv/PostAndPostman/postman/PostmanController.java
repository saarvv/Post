package com.sarv.PostAndPostman.postman;
import com.sarv.PostAndPostman.post.Post;
import com.sarv.PostAndPostman.post.PostDto;
import com.sarv.PostAndPostman.post.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/postman")
public class PostmanController {

    private IPostmanService postmanService;
    private PostmanRepository repository;
    private PostmanMapper postmanMapper;

    @Autowired
    public PostmanController(IPostmanService postmanService, PostmanRepository repository, PostmanMapper postmanMapper) {
        this.postmanService = postmanService;
        this.repository = repository;
        this.postmanMapper = postmanMapper;
    }

    @PostMapping
    public ResponseEntity<Object> savePostman(@RequestBody @Valid PostmanDto postmanDto) {
        Postman postman = postmanMapper.toEntity(postmanDto);
        postmanService.save(postman);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

  @GetMapping
    public List<Postman> getAll(){
        List<Postman> postmen = postmanService.findAll();
        List<PostmanDto> postmanDtos = postmanMapper.toDto(postmen);
        return postmanService.findAll();
  }


}



