package com.practice.dockerConn.domain.article;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/articles")
public class ApiV1ArticleController {
    private final ArticleService articleService;

    @GetMapping("/list")
    public String readArticles (Model model) {
        List<Article> articles = this.articleService.getArticles();
        model.addAttribute("articles", articles);
        return "article_list";
    }

    @GetMapping("/detail/{id}")
    public String readArticle (Model model, @PathVariable(value = "id") Long id) {
        Article article = this.articleService.getArticle(id);
        if (article == null) {
            return "redirect:/articles/list";
        }
        model.addAttribute("article", article);
        return "article_detail";
    }

    @GetMapping("/create")
    public String createArticle () {
        return "article_form";
    }

    @PostMapping("/create")
    public String createArticle (@Valid ArticleForm articleForm, BindingResult bindingResult) {
        return "article_list";
    }
}
