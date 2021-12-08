package lesson3;

import java.util.Arrays;

public class MyDeque<E> implements Deque<E> {
    protected final int DEFAULT_TAIL = -1;
    protected final int DEFAULT_HEAD = 0;

    protected final E[] data;
    protected int size;
    protected int tail;
    protected int head;


    public MyDeque(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        tail = DEFAULT_TAIL;
        head = DEFAULT_HEAD;
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }

        if (tail == data.length - 1) {
            tail = DEFAULT_TAIL;
        }

        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        if (isFull()) {
            return false;
        }

        if (head == DEFAULT_HEAD) {
            head = data.length;
        }

        data[--head] = value;
        size++;
        return true;
    }

    @Override
    public E removeLeft() {
        if (isEmpty())
        return null;
        if (tail == data.length){
            tail = DEFAULT_TAIL;
        }
        E value = data[tail];

        data[tail] = null;
        size--;
        tail--;
        return value;
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }

        if (head == data.length) {
            head = DEFAULT_HEAD;
        }

        E value = data[head];
        data[head] = null;
        head++;

        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {

        return Arrays.toString(data);
    }
}
