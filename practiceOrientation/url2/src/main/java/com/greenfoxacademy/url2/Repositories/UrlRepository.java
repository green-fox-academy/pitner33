package com.greenfoxacademy.url2.Repositories;

import com.greenfoxacademy.url2.Models.UrlModel;
import org.springframework.data.repository.CrudRepository;

public interface UrlRepository extends CrudRepository<UrlModel, Long> {
    UrlModel findByAlias(String alias);
}
