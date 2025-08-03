package com.practice.dockerConn.domain.article;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getArticles () {
        return this.articleRepository.findAll();
    }

    public Article getArticle (Long id) {
        return this.articleRepository.findById(id).orElse(null);
    }

    public void createArticle (ArticleForm articleForm) {
        Article article = Article.builder()
                .title(articleForm.getTitle())
                .content(articleForm.getContent())
                .build();
        this.articleRepository.save(article);
    }
}
