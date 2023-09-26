package com.example.javascriptbootdome01.SQL.JpaCache;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
/**
 * @author mrr
 * @date 2023/9/23 19:59
 * @description:
 */

@RestController
public class JpaController {
    @Autowired
    private JpaArticleService jpaArticleService;

    //t_article表
    @GetMapping("/aget/{id}")
    public JpaArticle findById2(@PathVariable("id") int article_id) {
        JpaArticle jpaArticle = jpaArticleService.findById2(article_id);
        return jpaArticle;
    }

    @GetMapping("/aupdate/{id}/{author}")
    public JpaArticle updateJpaArticle(@PathVariable("id") int article_id,
                                 @PathVariable("author") String title) {
        JpaArticle jpaArticle=jpaArticleService.findById2(article_id);
        jpaArticle.setTitle(title);
        JpaArticle updateJpaArticle=jpaArticleService.updateJpaArticle(jpaArticle);
        return updateJpaArticle;
    }

    @GetMapping("/adelete/{id}")
    public void deleta(@PathVariable("id") int article_id) {
        jpaArticleService.deleteJpaArticle(article_id);
    }

}
