package com.sarv.PostAndPostman.postman;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PostmanMapper {

    Postman toEntity(PostmanDto postmanDto);

    PostmanDto toDto(Postman postman);

    List<PostmanDto> toDto(List<Postman> postmen);

    List<Postman> toEntities(List<PostmanDto> postmanDtos);
}