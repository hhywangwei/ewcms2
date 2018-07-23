package com.appeme.server.ewcms.content.service;

import com.appeme.server.ewcms.content.dao.CategoryDao;
import com.appeme.server.ewcms.content.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CategoryService {
    private final CategoryDao dao;

    @Autowired
    public CategoryService(CategoryDao dao) {
        this.dao = dao;
    }

    public Category save(Category t){
        t.setCreateTime(new Date());
        String id = dao.insert(t);
        return dao.findOne(id);
    }

    public Category update(Category t){
        dao.update(t);
        return dao.findOne(t.getId());
    }

    public Category get(String id){
        return dao.findOne(id);
    }

    public Boolean delete(String id){
        return dao.delete(id);
    }

    public Page<Category> query(boolean isCount, String name, Pageable page){
        List<Category> categories = dao.find(name, page.getPageSize(), page.getOffset());
        return isCount?
                new PageImpl<>(categories, page, dao.count(name)) :
                new PageImpl<>(categories, page, -1L);
    }
}
