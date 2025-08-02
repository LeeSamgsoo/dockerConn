package com.practice.dockerConn.domain.article;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleForm {
    @NotEmpty(message = "제목을 입력해 주십시오")
    @Size(min = 2, max = 20)
    private String title;

    @NotEmpty(message = "내용을 입력해 주십시오")
    private String content;
}
