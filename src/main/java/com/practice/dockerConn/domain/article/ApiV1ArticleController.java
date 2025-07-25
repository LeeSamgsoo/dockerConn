package com.practice.dockerConn.domain.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/articles")
public class ApiV1ArticleController {
    private final ArticleService articleService;

    @GetMapping("")
    public String readArticles (Model model) {
        List<Article> articles = this.articleService.getArticles();
        model.addAttribute("articles", articles);
        return "article_list";
    }
}
