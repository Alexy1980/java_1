package ru.javaweb.webapp.model;

public class Link {
    // final означает, что свойство не меняется
    private String name = "name";
    private String url = "url";
    // конструктор
    public Link(String name, String url) {
       this.name = name;
       this.url = url;
    }
}

