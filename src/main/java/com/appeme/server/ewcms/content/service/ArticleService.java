package com.appeme.server.ewcms.content.service;

import com.appeme.server.ewcms.content.dao.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    private final ArticleDao dao;

    @Autowired
    public ArticleService(ArticleDao dao) {
        this.dao = dao;
    }
}
