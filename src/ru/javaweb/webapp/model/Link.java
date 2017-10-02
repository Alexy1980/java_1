package ru.javaweb.webapp.model;

public class Link {
    // final означает, что свойство не меняется
    private final String name;
    private final String url;
    // конструктор
    public Link(String name, String url) {
       this.name = name;
       this.url = url;
    }
    // делаем копию Link (клонируем)
    public Link(Link link) {
        this.name = link.name;
        this.url = link.url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Link link = (Link) o;

        return url != null ? url.equals(link.url) : link.url == null;
    }

    @Override
    public int hashCode() {
        return url != null ? url.hashCode() : 0;
    }
}