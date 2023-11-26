package org.course.hw12.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PhoneBook {
    private List<Note> notes;

    public PhoneBook() {
        this.notes = new ArrayList<>();
    }

    public void add(Note note) {
        if (!isNoteExist(note.getName(), note.getPhoneNumbers())) {
            notes.add(note);
        }


    }

    private boolean isNoteExist(String name, List<String> phoneNumber) {
        for (Note note : notes) {
            if (note.getName().equals(name) && note.getPhoneNumbers().equals(phoneNumber)) {
                return true;
            }
        }
        return false;
    }

    public Note find(String name) {
        return notes.stream()
                .filter(note -> note.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public List<Note> findAll(String name) {
        List<Note> foundNote = notes.stream()
                .filter(note -> note.getName().equals(name))
                .collect(Collectors.toList());

        return  foundNote.isEmpty() ? null : foundNote;
    }
}
