package com.mansooonuna.exam.board;

public class Article {
    int articleNo;
    String title, body;

    public Article(int articleNo, String title, String body) {
        this.articleNo = articleNo;
        this.title = title;
        this.body = body;
    }

    public String toString() {
        return "생성된 게시물 객체 {id : " + articleNo + ", 제목 : " + title + ", 내용 : " + body + "}";

    }
}
