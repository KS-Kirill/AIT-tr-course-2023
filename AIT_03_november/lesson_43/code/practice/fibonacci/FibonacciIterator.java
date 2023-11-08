package practice.fibonacci;

import java.util.Iterator;

public class FibonacciIterator implements Iterator <Integer> {

    @Override
    public boolean hasNext() {
        return false;//todo - проверка на количество чисел в ряду
    }

    @Override
    public Integer next() {
        return null;//todo как получить следующее число Фибоначчи в ряду = предыдущее + текущее
    }
}
