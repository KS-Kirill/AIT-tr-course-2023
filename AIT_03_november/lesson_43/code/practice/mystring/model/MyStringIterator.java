package practice.mystring.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {

    private StringBuilder str;
    private int size;
    private int currPosition;

    public MyStringIterator(StringBuilder str) {
        this.str = str;
        this.size = str.length();
        //this.currPosition = 0;
    }

    //проверка есть ли следующий элемент

    @Override
    public boolean hasNext() {
        return currPosition < size; //логическое выражение, true - ещё есть элементы
    }

    //этот метод должен вернеть элемент множества

    @Override
    public Character next() {
        Character curCharacter = str.charAt(currPosition);
        currPosition++;
        return curCharacter;
    }
//этот метод для удаления элемента строки
    public void remove() {
        str.deleteCharAt(--currPosition);
        size--;
    }
}
