package com.desktopWork.service.impl;

import com.desktopWork.bean.Word;
import com.desktopWork.dao.WordDao;
import com.desktopWork.service.WordService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private WordDao wordDao;

    @Override
    public Word selectWord(Integer word_id) {
        return wordDao.selectWord(word_id);
    }

    @Override
    public boolean addWord(Word word) {
        wordDao.addWord(word);
        return true;
    }
}
