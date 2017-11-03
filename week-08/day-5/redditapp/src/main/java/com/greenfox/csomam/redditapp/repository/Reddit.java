package com.greenfox.csomam.redditapp.repository;

import com.greenfox.csomam.redditapp.modules.RedditPost;
import org.springframework.data.repository.CrudRepository;

public interface Reddit extends CrudRepository<RedditPost, Long> {
}
