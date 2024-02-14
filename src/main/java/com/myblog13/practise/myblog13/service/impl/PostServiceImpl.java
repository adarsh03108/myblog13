package com.myblog13.practise.myblog13.service.impl;

import com.myblog13.practise.myblog13.entity.Post;
import com.myblog13.practise.myblog13.payload.PostDto;
import com.myblog13.practise.myblog13.repository.PostRepository;
import com.myblog13.practise.myblog13.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post= new Post();
        post.setId(postDto.getId());
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(post.getContent());

        Post savedPost = postRepository.save(post);

        PostDto dto =new PostDto();
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());
        return dto;
    }
}
