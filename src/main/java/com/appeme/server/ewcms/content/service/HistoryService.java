package com.appeme.server.ewcms.content.service;

import com.appeme.server.ewcms.content.dao.HistoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryService {
    private final HistoryDao dao;

    @Autowired
    public HistoryService(HistoryDao dao) {
        this.dao = dao;
    }
}
