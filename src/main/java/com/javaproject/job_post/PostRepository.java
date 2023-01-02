package com.javaproject.job_post;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.javaproject.job_post.models.Post;

public interface PostRepository extends MongoRepository<Post,String>
{

}
