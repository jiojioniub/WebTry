package com.desktopWork.bean;

public class Word {

    private Integer word_id;

    private String word_wordname;

    public Word() {
    }

    public Word( String word_wordname) {
        this.word_wordname = word_wordname;
    }

    public Integer getWordId() {
        return word_id;
    }

    public void setWordId(Integer wordId) {
        this.word_id = wordId;
    }

    public String getWordName() {
        return word_wordname;
    }

    public void setWordName(String wordName) {
        this.word_wordname = wordName;
    }

    @Override
    public String toString() {
        return "Word{" +
                "wordId=" + word_id +
                ", wordName='" + word_wordname + '\'' +
                '}';
    }
}
