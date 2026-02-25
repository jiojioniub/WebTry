package com.desktopWork.service;

import com.desktopWork.bean.Word;
import com.desktopWork.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class WordServiceTest {
    @Autowired
    private WordService wordService;

    Word word = new Word("我的天哪");
    @Test
    public void testGetAll(){
        Random random = new Random();
        int nextInt = random.nextInt(60);
        System.out.println(nextInt);
        Word all = wordService.selectWord(nextInt);
        System.out.println(all);
    }
    @Test
    public void testAddUser(){
//        外键还不能成功做
        wordService.addWord(word);
        System.out.println("插入中....");
        System.out.println(word);
        System.out.println("插入成功....");
    }
}
