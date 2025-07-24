package com.practice.dockerConn.domain.article;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ArticleService {
    private final ArtilceRepository artilceRepository;

    public List<Article> getArticles () {
        List<Article> articles = this.artilceRepository.findAll();
        return articles;
    }
}
