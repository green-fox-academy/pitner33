package com.grennfoxacademy.reddit.Repositories;

import com.grennfoxacademy.reddit.Models.Reddit;
import org.springframework.data.repository.CrudRepository;

public interface RedditRepository extends CrudRepository<Reddit, Long> {
}
