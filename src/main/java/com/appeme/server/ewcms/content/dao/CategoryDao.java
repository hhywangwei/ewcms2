package com.appeme.server.ewcms.content.dao;

import com.appeme.server.ewcms.content.domain.Category;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDao {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public CategoryDao(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public String insert(Category t){
        mongoTemplate.insert(t);
        return t.getId();
    }

    public Boolean update(Category t){
        final Query query = Query.query(Criteria.where("id").is(t.getId()));
        final Update update = Update.update("icon", t.getIcon()).set("name", t.getName());
        return mongoTemplate.updateFirst(query, update, Category.class).getModifiedCount() > 0;
    }

    public Category findOne(String id){
        final Query query = Query.query(Criteria.where("id").is(id));
        return mongoTemplate.findOne(query, Category.class);
    }

    public Boolean delete(String id){
        final Query query = Query.query(Criteria.where("id").is(id));
        return mongoTemplate.remove(query, Category.class).getDeletedCount() > 0;
    }

    public Long count(String name){
        final Query query = Query.query(buildCriteria(name));
        return mongoTemplate.count(query, Category.class);
    }

    private Criteria buildCriteria(String name){
        Criteria criteria = new Criteria();
        if(StringUtils.isNotBlank(name)){
            criteria.and("name").regex(name);
        }
        return criteria;
    }

    public List<Category> find(String name, int limit, long offset) {
        final Query query = Query
                .query(buildCriteria(name))
                .with(Sort.by(Sort.Direction.ASC, "createTime"))
                .skip(offset)
                .limit(limit);
        
        return mongoTemplate.find(query, Category.class);

    }
}
