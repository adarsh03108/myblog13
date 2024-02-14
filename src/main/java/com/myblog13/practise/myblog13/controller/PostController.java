package com.myblog13.practise.myblog13.controller;

import com.myblog13.practise.myblog13.entity.Post;
import com.myblog13.practise.myblog13.payload.PostDto;
import com.myblog13.practise.myblog13.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/music")
    public String music(){
        return "music is playing";
    }

    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        PostDto dto= postService.createPost(postDto);
 return new ResponseEntity<>( dto,HttpStatus.CREATED);



    }
}
