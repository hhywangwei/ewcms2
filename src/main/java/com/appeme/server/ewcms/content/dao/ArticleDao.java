package com.appeme.server.ewcms.content.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDao {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public ArticleDao(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
}
