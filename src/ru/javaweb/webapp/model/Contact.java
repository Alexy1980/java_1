package ru.javaweb.webapp.model;

public class Contact {
    // тип контакта
    private final String type;
    // значение
    private final String value;

    public Contact(String type, String value){
        this.type = type;
        this.value = value;
    }
}
