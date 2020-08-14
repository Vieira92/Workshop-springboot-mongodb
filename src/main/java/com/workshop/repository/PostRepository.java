package com.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.workshop.entity.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
