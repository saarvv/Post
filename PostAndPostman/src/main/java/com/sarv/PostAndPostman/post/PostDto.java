package com.sarv.PostAndPostman.post;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    @ApiModelProperty(value = "Post id")
    private Long id;

    @ApiModelProperty(value = "Receiver Name")
    private String receiverName;

    @ApiModelProperty(value = "Sender Name")
    private String senderName;

    @ApiModelProperty(value = "Post Weight")
    private Double postWeight;

    @ApiModelProperty(value = "Receiver Address")
    private String receiverAddress;

}
