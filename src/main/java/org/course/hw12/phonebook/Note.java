package org.course.hw12.phonebook;

import java.util.List;
import java.util.ArrayList;

public class Note {
    private String name;
    private List<String> phoneNumbers;

    public Note(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
        this.phoneNumbers.add(phoneNumber);
    }


    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void addPhoneNumber(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
    }
}
