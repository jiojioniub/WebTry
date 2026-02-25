package com.desktopWork.dao;

import com.desktopWork.bean.Word;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WordDao {

    //    添加语句
    @Insert("insert into tb_word value (null,#{word_wordname})")
    public boolean addWord(Word word);

    //    查找语句
    @Select("select * from tb_word where word_id=#{word_id}")
    public Word selectWord(Integer word_id);



}
