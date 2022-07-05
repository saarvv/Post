package com.sarv.PostAndPostman.post;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PostMapper {

    Post toEntity(PostDto postDto);
    PostDto toDto(Post post);
    List<PostDto> toDto(List<Post> posts);
    List<Post> toEntities(List<PostDto> postDtos);
}
