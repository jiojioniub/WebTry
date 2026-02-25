package com.desktopWork.service;

import com.desktopWork.bean.Word;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface WordService {
    //    添加语句
    public boolean addWord(Word word);
    //    查找语句
    public Word selectWord(Integer word_id);

}
