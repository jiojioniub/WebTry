package com.desktopWork.controller;

import com.desktopWork.bean.Word;

import com.desktopWork.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/words")
public class WordController {
    @Autowired
    private WordService wordService;

    //    添加语句
    @PostMapping
    public Result addWord(@RequestBody Word word){
        boolean flag = wordService.addWord(word);
        return new Result(flag,flag?Code.ADD_OK:Code.ADD_ERR);
    }
    //    查找语句
    @GetMapping
    public Result selectWord(@PathVariable Integer word_id){
        Word word = wordService.selectWord(word_id);
        Integer code = word != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = word != null ? "": "查询失败，请重试！";
        return new Result(word,code,mess);

    }



}
