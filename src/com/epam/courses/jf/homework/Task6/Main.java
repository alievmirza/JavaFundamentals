package com.epam.courses.jf.homework.Task6;

/**
 * Created by mirza on 03.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Notebook nb = new Notebook(2);
        nb.addNote(new Note("Hi"));
        nb.addNote(new Note("Bye"));
        nb.addNote(new Note("Test"));
        nb.addNote(new Note("Test"));
        nb.addNote(new Note("Test4"));
        nb.addNote(new Note("Testlast"));
        //nb.editNote(6,"LOL");
        nb.deleteNote(6);
        nb.viewAll();
        System.out.println(nb.getLength());
        System.out.println(nb.getSize());
    }
}
