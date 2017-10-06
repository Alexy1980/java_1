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
        if (!(o instanceof Link)) return false;

        Link link = (Link) o;

        if (!name.equals(link.name)) return false;
        if (url != null ? url.equals(link.url) : link.url == null) return true;
        else return false;
    }
    // хэш-код представляет собой уникальное число, которое идентифицирует объект
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}