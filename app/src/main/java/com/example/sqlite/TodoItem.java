package com.example.sqlite;

public class TodoItem {
    private int id;             // 게시글 공유 id
    private String title;       // 할 일 계획
    private String content;     // 할 일 내용
    private String writeDate;   // 할 일 날짜

    public TodoItem(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

    public void add(TodoItem todoItem) {
    }
}
