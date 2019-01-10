package com.greenfoxacademy.url.Repositories;

import com.greenfoxacademy.url.Models.UrlModel;
import org.springframework.data.repository.CrudRepository;

public interface UrlRepository extends CrudRepository<UrlModel, Long> {
}
