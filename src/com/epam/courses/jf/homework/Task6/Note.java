package com.epam.courses.jf.homework.Task6;

/**
 * Created by mirza on 03.03.2016.
 */

/**
 * Реализация записи в блокноте
 */
public class Note {
    private String text;

    public Note(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
