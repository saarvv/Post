package com.sarv.PostAndPostman.postman;

import com.sarv.PostAndPostman.post.Post;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostmanDto {

    @ApiModelProperty(value = "Postman id")
    private Long postmanId;

    @ApiModelProperty(value = "Postman name")
    private String postmanName;

}
