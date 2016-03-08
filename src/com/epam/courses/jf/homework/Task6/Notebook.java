package com.epam.courses.jf.homework.Task6;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by mirza on 03.03.2016.
 */

/**
 *Реализация блокнота с записями
 *
 *
 */
public class Notebook {
    private Note[] notebook;
    private int size;
    private int length = 0;

    public int getLength() {
        return length;
    }

    public int getSize() {
        return size;
    }

    Notebook(int num){
        notebook = new Note[num];
        size = num;
    }

    /**
     * Добавляет в блокнот новую запись
     * @param note
     * новая запись
     *
     */
    public void addNote(Note note){
        if(length == size){
            size = 2 * size;
            notebook = Arrays.copyOf(notebook, size);
        }
        notebook[length] = note;
        length++;
    }

    /**
     * метод, выписывающий все записи
     */
    public void viewAll(){
        for (int i = 0; i < length; i++) {
            System.out.println(notebook[i].getText());
        }
    }

    /**
     * Проверят, попадает ли индекс в границы массива
     * @param i
     * индекс расмматриваемого элемента массива
     * @return
     * возвращает true, если попадает, иначе false
     */
    private boolean checkRange(int i) {
        if (i < 0 || i >= length) return false;
        return true;
    }

    /**
     * Позволяет изменить текст записи в блокноте
     * @param i
     * номер записи в блокноте
     * @param newText
     * новый текст записи
     */
    public void editNote(int i, String newText){
        if (!checkRange(i)) System.out.println("Can't edit, index out of range");
        else {
            notebook[i].setText(newText);
        }
    }

    /**
     * Удаляет запись в блокноте
     * @param i
     * номер записи в блокноте
     */
    public void deleteNote(int i){
        if (!checkRange(i)) System.out.println("Can't delete, index out of range");
        else {
            System.arraycopy(notebook, i + 1, notebook, i, length - i - 1);
            notebook[length--] = null;
        }
    }
}
