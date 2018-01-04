package com.cerner.sharepoint;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface MyBlogRepository extends MongoRepository<MyBlog, String>{

}
