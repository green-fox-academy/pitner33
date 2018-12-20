package com.grennfoxacademy.reddit.Services;

import com.grennfoxacademy.reddit.Models.Reddit;
import com.grennfoxacademy.reddit.Repositories.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RedditService {
    private RedditRepository redditRepository;

    @Autowired
    public RedditService(RedditRepository redditRepository) {
        this.redditRepository = redditRepository;
    }

    public List<Reddit> findAll() {
        return (List<Reddit>) redditRepository.findAll();       //Iterable-t ad vissza, atcastolom Listre
    }

    public Reddit findById(Long id) {
        Optional<Reddit> reddit = redditRepository.findById(id);         //hasznos lenne egy if statementtel megnezni hogy null-e - ha igen Throw Exception
        if (reddit.isPresent()) {
            return reddit.get();
        } else {
            throw new IndexOutOfBoundsException();
        }
//       return redditRepository.findById(id).get();                    //e helyett
    }

    public void upScore(Long id) {
       Reddit reddit = redditRepository.findById(id).get();
       reddit.setScore(reddit.getScore() + 1);
       redditRepository.save(reddit);
    }

    public void downScore(Long id) {
        Reddit reddit = redditRepository.findById(id).get();
        reddit.setScore(reddit.getScore() - 1);
        redditRepository.save(reddit);
    }

    public void save(Reddit reddit) {
        redditRepository.save(reddit);
    }

    public List<Reddit> mostPopularReddits() {
        List<Reddit> allReddit = findAll();
        List<Reddit> mostPopularReddits = allReddit.stream()
                                                    .sorted(Comparator.comparing(Reddit::getScore).reversed())
                                                    .limit(10L)
                                                    .collect(Collectors.toList());
        return mostPopularReddits;


    }


}
