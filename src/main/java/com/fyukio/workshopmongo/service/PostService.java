package com.fyukio.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyukio.workshopmongo.domain.Post;
import com.fyukio.workshopmongo.repository.PostRepository;
import com.fyukio.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> post = repo.findById(id);
        return post.orElseThrow(() ->
                new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> searchTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }
}