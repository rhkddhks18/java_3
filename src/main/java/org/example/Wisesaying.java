package org.example;

public class Wisesaying {
    private long id;
    private String author;
    private String content;
    Wisesaying(Long id, String author, String content){
        this.id = id;
        this.author = author;
        this.content = content;
    }

    public long getId() {
        return this.id;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getContent() {
        return this.content;
    }
}
