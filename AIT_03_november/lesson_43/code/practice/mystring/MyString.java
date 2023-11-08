package practice.mystring;

import practice.mystring.model.MyStringIterator;

import java.util.Iterator;

public class MyString implements Iterable <Character>{
    //field
    private StringBuilder str;//StringBuilder это встроенный в джава класс
    //мы хотим написать на основе этого класса свои методы и поработать с ними

    public StringBuilder getStr() {
        return str;
    }

    public void setStr(StringBuilder str) {
        this.str = new StringBuilder(str);
    }

    //constructor
    public MyString(StringBuilder str) {
        this.str = str;
    }

    //делаем метод добавления символа, до этого сделали геттеры и сеттеры
    public void addChar(char ch) {
        str.append(ch);
    }

    //делаем метод удаления символа
    public void removeChar(char ch) {
        int index = str.indexOf(String.valueOf(ch));//сначала сказали найти индекс, завернули в строку потому что была ошибка
        str.deleteCharAt(index);//сказали удалить по индексу, и там и там использовали встроенные методы
    }

    @Override
    public String toString() {
        return str.toString();
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(str);
    }
}
