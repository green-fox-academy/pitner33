package com.greenfoxacademy.url2.Services;

import com.greenfoxacademy.url2.Models.UrlModel;
import com.greenfoxacademy.url2.Repositories.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.net.URL;
import java.util.List;
import java.util.Optional;

@Service
public class UrlService {
    private UrlRepository urlRepository;

    @Autowired
    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public void saveUrl(UrlModel urlModel) {
        urlRepository.save(urlModel);
    }

    public UrlModel findByAlias(String alias) {
        return urlRepository.findByAlias(alias);
    }

    public List<UrlModel> findAll() {
        return (List<UrlModel>) urlRepository.findAll();
    }



    public UrlRepository getUrlRepository() {
        return urlRepository;
    }

    public void setUrlRepository(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }


    public Optional<UrlModel> findById(Long id) {
        return urlRepository.findById(id);
    }

    public void delete(UrlModel urlModel) {
        urlRepository.delete(urlModel);
    }
}
