package com.sarv.PostAndPostman.postman;
import com.sarv.PostAndPostman.post.Post;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "Postman")
public class Postman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postman_id")
    private Long postmanId;

    @Column(name = "postman_name")
    private String postmanName;

    //post_post_id
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_post_id")
    private Post post;
}
