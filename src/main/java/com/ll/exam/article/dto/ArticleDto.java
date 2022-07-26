package com.ll.exam.article.dto;

import lombok.*;

@ToString
@Data
@AllArgsConstructor
public class ArticleDto {
    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String body;
}