package org.course.hw12.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneBook {
    private List<Record> records;

    public PhoneBook() {
        this.records = new ArrayList<>();
    }

    public void add(Record record) {
        if (!isNoteExist(record.getName(), record.getPhoneNumbers())) {
            records.add(record);
        }


    }

    private boolean isNoteExist(String name, List<String> phoneNumber) {
        for (Record record : records) {
            if (record.getName().equals(name) && record.getPhoneNumbers().equals(phoneNumber)) {
                return true;
            }
        }
        return false;
    }

    public Record find(String name) {
        return records.stream()
                .filter(note -> note.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public List<Record> findAll(String name) {
        List<Record> foundRecords = records.stream()
                .filter(note -> note.getName().equals(name))
                .collect(Collectors.toList());

        return  foundRecords.isEmpty() ? null : foundRecords;
    }
}
