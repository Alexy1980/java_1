package ru.javaweb.webapp.model;

import java.util.Collection;
import java.util.List;

public class Resume {
    private String fullName;
    private String location;
    // List - упорядоченная коллекция
    private List<Contact> contacts;
    private List<Section> sections;
}
