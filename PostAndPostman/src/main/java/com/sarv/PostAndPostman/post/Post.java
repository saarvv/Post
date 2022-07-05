package com.sarv.PostAndPostman.post;

import com.sarv.PostAndPostman.postman.Postman;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "Posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @Column(name = "receiver_name")
    private String receiverName;

    @Column(name = "sender_name")
    private String senderName;

    @Column(name = "post_weight")
    private Double postWeight;

    @Column(name = "receiver_address")
    private String receiverAddress;

    @OneToOne(mappedBy = "post")
    private Postman postman;
}
